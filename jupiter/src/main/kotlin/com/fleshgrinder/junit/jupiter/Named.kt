@file:Suppress("NOTHING_TO_INLINE")

package com.fleshgrinder.junit.jupiter

@PublishedApi
internal fun <T> name(it: T): String =
    it.toString().ifBlank { "blank" }.ifEmpty { "empty" }

@DynamicTestApi
public inline infix fun <T> Iterator<T>.named(noinline name: (T) -> String): NamedIterator<T> =
    NamedIterator(this, name)

@DynamicTestApi
public inline infix fun <T> Iterable<T>.named(noinline name: (T) -> String): NamedIterator<T> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun <T> Sequence<T>.named(noinline name: (T) -> String): NamedIterator<T> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun <T> Array<out T>.named(noinline name: (T) -> String): NamedIterator<T> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun ByteArray.named(noinline name: (Byte) -> String): NamedIterator<Byte> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun CharArray.named(noinline name: (Char) -> String): NamedIterator<Char> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun ShortArray.named(noinline name: (Short) -> String): NamedIterator<Short> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun IntArray.named(noinline name: (Int) -> String): NamedIterator<Int> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun LongArray.named(noinline name: (Long) -> String): NamedIterator<Long> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun FloatArray.named(noinline name: (Float) -> String): NamedIterator<Float> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun DoubleArray.named(noinline name: (Double) -> String): NamedIterator<Double> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun BooleanArray.named(noinline name: (Boolean) -> String): NamedIterator<Boolean> =
    iterator().named(name)

@DynamicTestApi
public inline infix fun <reified E : Enum<E>> E.named(noinline name: (E) -> String): NamedIterator<E> =
    enumValues<E>().named(name)
