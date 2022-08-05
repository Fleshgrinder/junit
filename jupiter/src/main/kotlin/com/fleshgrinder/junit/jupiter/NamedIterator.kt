package com.fleshgrinder.junit.jupiter

import org.junit.jupiter.api.Named

public class NamedIterator<out T> @PublishedApi internal constructor(
    private val supplier: Iterator<T>,
    private val name: (T) -> String,
) : Iterator<Named<out T>> {
    override fun hasNext(): Boolean =
        supplier.hasNext()

    override fun next(): Named<out T> =
        supplier.next().let {
            val name = when (it) {
                is TestCase -> it.name ?: name(it)
                else -> name(it)
            }
            Named.of(name, it)
        }

    @DynamicTestApi
    public infix fun test(test: (T) -> Unit): Tests =
        DynamicTestIterator(this, { test(it.payload) }, Named<out T>::getName)
}
