package com.github.fo2rist.kotlinscopeandextensionfunctions

import org.junit.Test
import java.lang.Thread.currentThread
import kotlin.random.Random.Default.nextLong

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


    private inline fun <T> Iterable<T>.myParallelForEach(action: (T) -> Unit): Unit {
        for (element in this) {
            Thread.sleep(nextLong(1000))
            print("In ${currentThread()} ")
            action(element)
        }
    }
}
