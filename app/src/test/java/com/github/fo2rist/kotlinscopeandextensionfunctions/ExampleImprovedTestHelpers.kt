package com.github.fo2rist.kotlinscopeandextensionfunctions

import com.github.fo2rist.kotlinscopeandextensionfunctions.testutils.parametersOf
import com.github.fo2rist.kotlinscopeandextensionfunctions.testutils.and
import com.github.fo2rist.kotlinscopeandextensionfunctions.testutils.shouldReturn
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ExampleImprovedTestHelpers(
    private val left: String?,
    private val right: String?,
    private val result: String
) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "'{0} + {1} gives {2}")
        fun testData() = parametersOf(
            (null and "a") shouldReturn "a",
            ("a" and null) shouldReturn "a",
            ("a" and "a") shouldReturn "aa"
        )
    }

    @Test
    fun test() {
        assertEquals(
            result,
            transform(left, right)
        )
    }
}








// a first prototype of the concat function
private fun transform(left: String?, right: String?) = left + right
