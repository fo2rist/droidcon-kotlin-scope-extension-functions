package com.github.fo2rist.kotlinscopeandextensionfunctions

import org.junit.Test
import java.lang.Thread.currentThread

class ExampleExtensionForEach {

    @Test
    fun `play with different for each extensions`() {
        (1..5).forEach {
            println(it)
            if (it == 2) return
        }
        println("Done!")
    }


    // Kotlin's forEach for reference
    //public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
    //    for (element in this) action(element)
    //}
    private fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
        for (element in this) action(element)
    }


    private inline fun <T : Int> Iterable<T>.myParallelForEach(action: (T) -> Unit): Unit {
        for (element in this) {
            Thread.sleep(element * 10L) // simulate work

            action(element)
        }
    }
}
