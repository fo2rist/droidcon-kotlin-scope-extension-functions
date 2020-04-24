package com.github.fo2rist.kotlinscopeandextensionfunctions

import org.junit.Assert.assertEquals
import org.junit.Test
import java.lang.String
import kotlin.contracts.contract
import kotlin.contracts.ExperimentalContracts

@ExperimentalContracts
class ExampleCustomContract {

    private val potentiallyNullable: String? = getPotentiallyNullableString()

    private fun getPotentiallyNullableString(): String? = String("_123")

    @Test
    fun `I can write my own contract`() {
        assertEquals(
            String("_123_"),
            convertToID(potentiallyNullable)
        )
    }
}

@ExperimentalContracts
private fun convertToID(potentiallyNullable: String?): String {
    checkNotNull(potentiallyNullable)
    check(potentiallyNullable.startsWith("_"))

    return String(potentiallyNullable.concat("_"))
}

@ExperimentalContracts
private fun checkIsValidIdentifier(value: String?): String {
    contract {
        returns() implies (value != null)
    }
    if (value == null || !value.startsWith("_"))
        throw IllegalStateException("Valid value should start with '_', received: $value")
    return value
}
