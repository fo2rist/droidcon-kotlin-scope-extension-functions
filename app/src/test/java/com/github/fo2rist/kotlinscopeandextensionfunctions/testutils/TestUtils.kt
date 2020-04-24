package com.github.fo2rist.kotlinscopeandextensionfunctions.testutils

infix fun <A, B, C> Pair<A, B>.to(that: C): Triple<A, B, C> = Triple(this.first, this.second, that)

infix fun <A, B, C> Pair<A, B>.shouldReturn(that: C): Triple<A, B, C> = Triple(this.first, this.second, that)

infix fun <A, B> A.and(that: B): Pair<A, B> = Pair(this, that)

fun parametersOf(vararg parameters: Pair<*, *>): List<Array<*>> =
    parameters.map { it.toList().toTypedArray() }

fun parametersOf(vararg parameters: Triple<*, *, *>): List<Array<*>> =
    parameters.map { it.toList().toTypedArray() }
