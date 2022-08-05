package com.fleshgrinder.tuple

import java.io.Serializable

public interface Tuple<out E> : List<E>, Serializable {
    public companion object
}

public interface Tuple0 : Tuple<Nothing> {
    public companion object
}

public interface Tuple1<out E, out E1 : E> : Tuple<E> {
    public val e1: E1

    public companion object
}

public operator fun <E, E1 : E, E2 : E> Tuple1<E, E1>.plus(e2: E2): Tuple2<E, E1, E2> =
    TODO()

public interface Tuple2<out E, out E1 : E, out E2 : E> : Tuple<E> {
    public val e1: E1
    public val e2: E2

    public operator fun unaryMinus(): Tuple1<E, E1>

    public companion object
}

public fun f(l: List<String>) {
    val ll = l + l
}

public fun g(t: Tuple1<Any, String>) {
    val tt = t + 2
}
