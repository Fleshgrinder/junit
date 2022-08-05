@file:Suppress("NOTHING_TO_INLINE")

package com.fleshgrinder.junit.jupiter

public sealed class TestCase {
    public abstract val name: String?
    public companion object
}

/** @see TestCase */
public class TestCase1<P1> : TestCase {
    @JvmField public val p1: P1
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        name: (TestCase1<P1>) -> String,
    ) : super() {
        this.p1 = p1
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1"

    public operator fun component1(): P1 = p1
    public operator fun component2(): String? = name
}

/** @see TestCase */
public inline fun <P1> case(
    p1: P1,
): TestCase1<P1> =
    TestCase1(p1, null)

/** @see TestCase */
public inline fun <P1> case(
    p1: P1,
    noinline name: (TestCase1<P1>) -> String,
): TestCase1<P1> =
    TestCase1(p1, name)

/** @see TestCase */
public inline infix fun <P1> String.case(
    p1: P1,
): TestCase1<P1> =
    TestCase1(p1, this)

/** @see TestCase */
public class TestCase2<P1, P2> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        name: (TestCase2<P1, P2>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2> case(
    p1: P1,
    p2: P2,
): TestCase2<P1, P2> =
    TestCase2(p1, p2, null)

/** @see TestCase */
public inline fun <P1, P2> case(
    p1: P1,
    p2: P2,
    noinline name: (TestCase2<P1, P2>) -> String,
): TestCase2<P1, P2> =
    TestCase2(p1, p2, name)

/** @see TestCase */
public inline fun <P1, P2> String.case(
    p1: P1,
    p2: P2,
): TestCase2<P1, P2> =
    TestCase2(p1, p2, this)

/** @see TestCase */
public class TestCase3<P1, P2, P3> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        name: (TestCase3<P1, P2, P3>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3> case(
    p1: P1,
    p2: P2,
    p3: P3,
): TestCase3<P1, P2, P3> =
    TestCase3(p1, p2, p3, null)

/** @see TestCase */
public inline fun <P1, P2, P3> case(
    p1: P1,
    p2: P2,
    p3: P3,
    noinline name: (TestCase3<P1, P2, P3>) -> String,
): TestCase3<P1, P2, P3> =
    TestCase3(p1, p2, p3, name)

/** @see TestCase */
public inline fun <P1, P2, P3> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
): TestCase3<P1, P2, P3> =
    TestCase3(p1, p2, p3, this)

/** @see TestCase */
public class TestCase4<P1, P2, P3, P4> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        name: (TestCase4<P1, P2, P3, P4>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
): TestCase4<P1, P2, P3, P4> =
    TestCase4(p1, p2, p3, p4, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    noinline name: (TestCase4<P1, P2, P3, P4>) -> String,
): TestCase4<P1, P2, P3, P4> =
    TestCase4(p1, p2, p3, p4, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
): TestCase4<P1, P2, P3, P4> =
    TestCase4(p1, p2, p3, p4, this)

/** @see TestCase */
public class TestCase5<P1, P2, P3, P4, P5> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        name: (TestCase5<P1, P2, P3, P4, P5>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
): TestCase5<P1, P2, P3, P4, P5> =
    TestCase5(p1, p2, p3, p4, p5, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    noinline name: (TestCase5<P1, P2, P3, P4, P5>) -> String,
): TestCase5<P1, P2, P3, P4, P5> =
    TestCase5(p1, p2, p3, p4, p5, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
): TestCase5<P1, P2, P3, P4, P5> =
    TestCase5(p1, p2, p3, p4, p5, this)

/** @see TestCase */
public class TestCase6<P1, P2, P3, P4, P5, P6> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        name: (TestCase6<P1, P2, P3, P4, P5, P6>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
): TestCase6<P1, P2, P3, P4, P5, P6> =
    TestCase6(p1, p2, p3, p4, p5, p6, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    noinline name: (TestCase6<P1, P2, P3, P4, P5, P6>) -> String,
): TestCase6<P1, P2, P3, P4, P5, P6> =
    TestCase6(p1, p2, p3, p4, p5, p6, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
): TestCase6<P1, P2, P3, P4, P5, P6> =
    TestCase6(p1, p2, p3, p4, p5, p6, this)

/** @see TestCase */
public class TestCase7<P1, P2, P3, P4, P5, P6, P7> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        name: (TestCase7<P1, P2, P3, P4, P5, P6, P7>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
): TestCase7<P1, P2, P3, P4, P5, P6, P7> =
    TestCase7(p1, p2, p3, p4, p5, p6, p7, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    noinline name: (TestCase7<P1, P2, P3, P4, P5, P6, P7>) -> String,
): TestCase7<P1, P2, P3, P4, P5, P6, P7> =
    TestCase7(p1, p2, p3, p4, p5, p6, p7, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
): TestCase7<P1, P2, P3, P4, P5, P6, P7> =
    TestCase7(p1, p2, p3, p4, p5, p6, p7, this)

/** @see TestCase */
public class TestCase8<P1, P2, P3, P4, P5, P6, P7, P8> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        name: (TestCase8<P1, P2, P3, P4, P5, P6, P7, P8>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
): TestCase8<P1, P2, P3, P4, P5, P6, P7, P8> =
    TestCase8(p1, p2, p3, p4, p5, p6, p7, p8, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    noinline name: (TestCase8<P1, P2, P3, P4, P5, P6, P7, P8>) -> String,
): TestCase8<P1, P2, P3, P4, P5, P6, P7, P8> =
    TestCase8(p1, p2, p3, p4, p5, p6, p7, p8, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
): TestCase8<P1, P2, P3, P4, P5, P6, P7, P8> =
    TestCase8(p1, p2, p3, p4, p5, p6, p7, p8, this)

/** @see TestCase */
public class TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        name: (TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
): TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9> =
    TestCase9(p1, p2, p3, p4, p5, p6, p7, p8, p9, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    noinline name: (TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9>) -> String,
): TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9> =
    TestCase9(p1, p2, p3, p4, p5, p6, p7, p8, p9, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
): TestCase9<P1, P2, P3, P4, P5, P6, P7, P8, P9> =
    TestCase9(p1, p2, p3, p4, p5, p6, p7, p8, p9, this)

/** @see TestCase */
public class TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        name: (TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
): TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
    TestCase10(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    noinline name: (TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>) -> String,
): TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
    TestCase10(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
): TestCase10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
    TestCase10(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, this)

/** @see TestCase */
public class TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        name: (TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
): TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
    TestCase11(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    noinline name: (TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>) -> String,
): TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
    TestCase11(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
): TestCase11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
    TestCase11(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, this)

/** @see TestCase */
public class TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        name: (TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
): TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
    TestCase12(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    noinline name: (TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>) -> String,
): TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
    TestCase12(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
): TestCase12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
    TestCase12(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, this)

/** @see TestCase */
public class TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        name: (TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
): TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
    TestCase13(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    noinline name: (TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>) -> String,
): TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
    TestCase13(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
): TestCase13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
    TestCase13(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, this)

/** @see TestCase */
public class TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        name: (TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
): TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
    TestCase14(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    noinline name: (TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>) -> String,
): TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
    TestCase14(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
): TestCase14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
    TestCase14(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, this)

/** @see TestCase */
public class TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        name: (TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
): TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
    TestCase15(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    noinline name: (TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>) -> String,
): TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
    TestCase15(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
): TestCase15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
    TestCase15(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, this)

/** @see TestCase */
public class TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        name: (TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
): TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> =
    TestCase16(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    noinline name: (TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16>) -> String,
): TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> =
    TestCase16(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
): TestCase16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> =
    TestCase16(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, this)

/** @see TestCase */
public class TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        name: (TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
): TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> =
    TestCase17(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    noinline name: (TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17>) -> String,
): TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> =
    TestCase17(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
): TestCase17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> =
    TestCase17(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, this)

/** @see TestCase */
public class TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        name: (TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
): TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> =
    TestCase18(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    noinline name: (TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18>) -> String,
): TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> =
    TestCase18(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
): TestCase18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18> =
    TestCase18(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, this)

/** @see TestCase */
public class TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        name: (TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
): TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> =
    TestCase19(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    noinline name: (TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19>) -> String,
): TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> =
    TestCase19(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
): TestCase19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19> =
    TestCase19(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, this)

/** @see TestCase */
public class TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        name: (TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
): TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> =
    TestCase20(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    noinline name: (TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20>) -> String,
): TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> =
    TestCase20(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
): TestCase20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20> =
    TestCase20(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, this)

/** @see TestCase */
public class TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        name: (TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
): TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> =
    TestCase21(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    noinline name: (TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21>) -> String,
): TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> =
    TestCase21(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
): TestCase21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21> =
    TestCase21(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, this)

/** @see TestCase */
public class TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        name: (TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
): TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> =
    TestCase22(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    noinline name: (TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22>) -> String,
): TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> =
    TestCase22(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
): TestCase22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22> =
    TestCase22(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, this)

/** @see TestCase */
public class TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        name: (TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
): TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> =
    TestCase23(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    noinline name: (TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23>) -> String,
): TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> =
    TestCase23(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
): TestCase23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23> =
    TestCase23(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, this)

/** @see TestCase */
public class TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        name: (TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
): TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> =
    TestCase24(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    noinline name: (TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24>) -> String,
): TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> =
    TestCase24(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
): TestCase24<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24> =
    TestCase24(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, this)

/** @see TestCase */
public class TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        name: (TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
): TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> =
    TestCase25(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    noinline name: (TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25>) -> String,
): TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> =
    TestCase25(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
): TestCase25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> =
    TestCase25(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, this)

/** @see TestCase */
public class TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        name: (TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
): TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> =
    TestCase26(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    noinline name: (TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26>) -> String,
): TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> =
    TestCase26(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
): TestCase26<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26> =
    TestCase26(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, this)

/** @see TestCase */
public class TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        name: (TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
): TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> =
    TestCase27(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    noinline name: (TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27>) -> String,
): TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> =
    TestCase27(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
): TestCase27<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27> =
    TestCase27(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, this)

/** @see TestCase */
public class TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    @JvmField public val p28: P28
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        name: (TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27, $p28"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): P28 = p28
    public operator fun component29(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
): TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> =
    TestCase28(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    noinline name: (TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28>) -> String,
): TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> =
    TestCase28(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
): TestCase28<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28> =
    TestCase28(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, this)

/** @see TestCase */
public class TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    @JvmField public val p28: P28
    @JvmField public val p29: P29
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        name: (TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27, $p28, $p29"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): P28 = p28
    public operator fun component29(): P29 = p29
    public operator fun component30(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
): TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> =
    TestCase29(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    noinline name: (TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29>) -> String,
): TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> =
    TestCase29(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
): TestCase29<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29> =
    TestCase29(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, this)

/** @see TestCase */
public class TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    @JvmField public val p28: P28
    @JvmField public val p29: P29
    @JvmField public val p30: P30
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        name: (TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27, $p28, $p29, $p30"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): P28 = p28
    public operator fun component29(): P29 = p29
    public operator fun component30(): P30 = p30
    public operator fun component31(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
): TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> =
    TestCase30(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    noinline name: (TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30>) -> String,
): TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> =
    TestCase30(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
): TestCase30<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30> =
    TestCase30(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, this)

/** @see TestCase */
public class TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    @JvmField public val p28: P28
    @JvmField public val p29: P29
    @JvmField public val p30: P30
    @JvmField public val p31: P31
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        p31: P31,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.p31 = p31
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        p31: P31,
        name: (TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.p31 = p31
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27, $p28, $p29, $p30, $p31"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): P28 = p28
    public operator fun component29(): P29 = p29
    public operator fun component30(): P30 = p30
    public operator fun component31(): P31 = p31
    public operator fun component32(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
): TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> =
    TestCase31(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
    noinline name: (TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31>) -> String,
): TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> =
    TestCase31(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
): TestCase31<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31> =
    TestCase31(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, this)

/** @see TestCase */
public class TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> : TestCase {
    @JvmField public val p1: P1
    @JvmField public val p2: P2
    @JvmField public val p3: P3
    @JvmField public val p4: P4
    @JvmField public val p5: P5
    @JvmField public val p6: P6
    @JvmField public val p7: P7
    @JvmField public val p8: P8
    @JvmField public val p9: P9
    @JvmField public val p10: P10
    @JvmField public val p11: P11
    @JvmField public val p12: P12
    @JvmField public val p13: P13
    @JvmField public val p14: P14
    @JvmField public val p15: P15
    @JvmField public val p16: P16
    @JvmField public val p17: P17
    @JvmField public val p18: P18
    @JvmField public val p19: P19
    @JvmField public val p20: P20
    @JvmField public val p21: P21
    @JvmField public val p22: P22
    @JvmField public val p23: P23
    @JvmField public val p24: P24
    @JvmField public val p25: P25
    @JvmField public val p26: P26
    @JvmField public val p27: P27
    @JvmField public val p28: P28
    @JvmField public val p29: P29
    @JvmField public val p30: P30
    @JvmField public val p31: P31
    @JvmField public val p32: P32
    override val name: String?

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        p31: P31,
        p32: P32,
        name: String? = null,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.p31 = p31
        this.p32 = p32
        this.name = name
    }

    @PublishedApi internal constructor(
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
        p16: P16,
        p17: P17,
        p18: P18,
        p19: P19,
        p20: P20,
        p21: P21,
        p22: P22,
        p23: P23,
        p24: P24,
        p25: P25,
        p26: P26,
        p27: P27,
        p28: P28,
        p29: P29,
        p30: P30,
        p31: P31,
        p32: P32,
        name: (TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32>) -> String,
    ) : super() {
        this.p1 = p1
        this.p2 = p2
        this.p3 = p3
        this.p4 = p4
        this.p5 = p5
        this.p6 = p6
        this.p7 = p7
        this.p8 = p8
        this.p9 = p9
        this.p10 = p10
        this.p11 = p11
        this.p12 = p12
        this.p13 = p13
        this.p14 = p14
        this.p15 = p15
        this.p16 = p16
        this.p17 = p17
        this.p18 = p18
        this.p19 = p19
        this.p20 = p20
        this.p21 = p21
        this.p22 = p22
        this.p23 = p23
        this.p24 = p24
        this.p25 = p25
        this.p26 = p26
        this.p27 = p27
        this.p28 = p28
        this.p29 = p29
        this.p30 = p30
        this.p31 = p31
        this.p32 = p32
        this.name = name(this)
    }

    override fun toString(): String =
        name ?: "$p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $p9, $p10, $p11, $p12, $p13, $p14, $p15, $p16, $p17, $p18, $p19, $p20, $p21, $p22, $p23, $p24, $p25, $p26, $p27, $p28, $p29, $p30, $p31, $p32"

    public operator fun component1(): P1 = p1
    public operator fun component2(): P2 = p2
    public operator fun component3(): P3 = p3
    public operator fun component4(): P4 = p4
    public operator fun component5(): P5 = p5
    public operator fun component6(): P6 = p6
    public operator fun component7(): P7 = p7
    public operator fun component8(): P8 = p8
    public operator fun component9(): P9 = p9
    public operator fun component10(): P10 = p10
    public operator fun component11(): P11 = p11
    public operator fun component12(): P12 = p12
    public operator fun component13(): P13 = p13
    public operator fun component14(): P14 = p14
    public operator fun component15(): P15 = p15
    public operator fun component16(): P16 = p16
    public operator fun component17(): P17 = p17
    public operator fun component18(): P18 = p18
    public operator fun component19(): P19 = p19
    public operator fun component20(): P20 = p20
    public operator fun component21(): P21 = p21
    public operator fun component22(): P22 = p22
    public operator fun component23(): P23 = p23
    public operator fun component24(): P24 = p24
    public operator fun component25(): P25 = p25
    public operator fun component26(): P26 = p26
    public operator fun component27(): P27 = p27
    public operator fun component28(): P28 = p28
    public operator fun component29(): P29 = p29
    public operator fun component30(): P30 = p30
    public operator fun component31(): P31 = p31
    public operator fun component32(): P32 = p32
    public operator fun component33(): String? = name
}

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
    p32: P32,
): TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> =
    TestCase32(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, null)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
    p32: P32,
    noinline name: (TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32>) -> String,
): TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> =
    TestCase32(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, name)

/** @see TestCase */
public inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> String.case(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
    p16: P16,
    p17: P17,
    p18: P18,
    p19: P19,
    p20: P20,
    p21: P21,
    p22: P22,
    p23: P23,
    p24: P24,
    p25: P25,
    p26: P26,
    p27: P27,
    p28: P28,
    p29: P29,
    p30: P30,
    p31: P31,
    p32: P32,
): TestCase32<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25, P26, P27, P28, P29, P30, P31, P32> =
    TestCase32(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, this)
