@file:Suppress("NOTHING_TO_INLINE")

package com.fleshgrinder.junit.jupiter

import org.junit.jupiter.api.TestFactory

/**
 * Tests each [case][T] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline infix fun <T> Iterator<T>.test(noinline test: (T) -> Unit): Tests =
    DynamicTestIterator(this, test)

/**
 * Tests each [case][T] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline infix fun <T> Iterable<T>.test(noinline test: (T) -> Unit): Tests =
    iterator().test(test)

/**
 * Tests each [case][T] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline infix fun <T> Sequence<T>.test(noinline test: (T) -> Unit): Tests =
    iterator().test(test)

/**
 * Tests each [case][T] from [cases] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline fun <T> test(vararg cases: T, noinline test: (T) -> Unit): Tests =
    cases.iterator().test(test)

/**
 * Tests each [case][T] from [cases] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline fun <T> test(noinline cases: suspend SequenceScope<T>.() -> Unit, noinline test: (T) -> Unit): Tests =
    iterator(cases).test(test)

/**
 * Tests each [case][E] with the given [test].
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline infix fun <reified E : Enum<E>> E.test(noinline test: (E) -> Unit): Tests =
    enumValues<E>().iterator().test(test)

/**
 * Tests each [case][V] with the given [test] while using each [key][K] as the
 * name for the case it is associated with.
 *
 * Note that [TestCase.name]s are ignored with this invocation. Only the key
 * acts as the source for the name. This can be used to use a different test
 * display name while passing down some informational text to the test itself.
 *
 * @return [Tests] to execute with a [@TestFactory][TestFactory].
 */
@DynamicTestApi
public inline infix fun <K, V> Map<K, V>.test(noinline test: (V) -> Unit): Tests =
    DynamicTestIterator(iterator(), { test(it.value) }, { name(it.key) })
