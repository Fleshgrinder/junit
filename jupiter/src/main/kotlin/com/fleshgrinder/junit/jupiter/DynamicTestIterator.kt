package com.fleshgrinder.junit.jupiter

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest

@DynamicTestApi
public class DynamicTestIterator<out T> @PublishedApi internal constructor(
    private val supplier: Iterator<T>,
    private val test: (T) -> Unit,
    private val name: (T) -> String = ::name,
) : Tests {
    override fun hasNext(): Boolean =
        supplier.hasNext()

    override fun next(): DynamicTest =
        supplier.next().let {
            dynamicTest(name(it)) {
                test(it)
            }
        }
}
