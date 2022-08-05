package com.fleshgrinder.junit.jupiter.examples

import com.fleshgrinder.junit.jupiter.case
import com.fleshgrinder.junit.jupiter.named
import com.fleshgrinder.junit.jupiter.test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestFactory

/**
 * The dynamic test extensions allow us to build tests at runtime with minimal
 * overhead and type safety. This is very different to the heavy weight and type
 * unsafe annotation based approach of core JUnit. Keep in mind that there are
 * also good reasons to use the annotations. They allow for special processing
 * through frameworks, something that is not the case with the extensions
 * provided here. This is also where the speed difference comes from. Hence, it
 * is not a good vs bad thing, it really is a question of what you need in your
 * tests.
 */
private class DynamicTestExampleTest {
    /**
     * We have to use [@TestFactory][TestFactory] for tests that we create at
     * runtime. Be sure to read about it, as it has some special behavior that
     * you might not be familiar with.
     *
     * Almost any kind of type that can be iterated somehow can be turned into
     * dynamic tests via the [test] extension functions. In this case we use an
     * int progression to perform a trivial assertion on each element.
     */
    @TestFactory fun `simple test`() =
        (0..10 step 2) test {
            assertEquals(0, it % 2)
        }

    /**
     * Similarly we can make use of [named] to generate a display name for all
     * the test cases.
     */
    @TestFactory fun `simple name test`() =
        ('a'..'z' step 2) named {
            "ASCII `$it` is odd"
        } test {
            assertEquals(1, it.code % 2)
        }

    /**
     * Test cases can also be named by using a map whose keys are the names of
     * the cases. This works great for scalar values (like here) as well as
     * [Pair]s, and maybe even [Triple]s. For anything more complex …
     */
    @TestFactory fun `individual naming through map keys`() =
        mapOf(
            "null" to null,
            "empty" to "",
            "space" to " ",
        ) test {
            assertTrue(it.isNullOrBlank())
        }

    /**
     * … [case] can be used.
     */
    @TestFactory fun `individual naming through named`() =
        mapOf(
            "first" to case("p1", "p2", "p3", "p4", "p5"),
            "second" to case("p10", "p20", "p30", "p40", "p50"),
        ) test {
            val (p1, p2, p3, p4, p5) = it
            assertAll(
                { assertEquals(1, p1.substring(1).toInt() % 2) },
                { assertEquals(0, p2.substring(1).toInt() % 2) },
                { assertEquals(1, p3.substring(1).toInt() % 2) },
                { assertEquals(0, p4.substring(1).toInt() % 2) },
                { assertEquals(1, p5.substring(1).toInt() % 2) },
            )
        }

    /**
     * [case] is generally very versatile.
     */
    @TestFactory fun `case versatility`() =
    // Here we use a lazy iterator to generate the test cases. This is ideal
        // whenever the cases are heavy.
        iterator {
            // A case does not need a name, in which case either the parameters
            // joined by a comma and space (`, `) is used for the name, or the
            // display name generator (`named` extension function).
            yield(case(1, 2))

            // A fixed name can be given through the String extension function
            // case. It needs to be an extension function, because otherwise
            // there would be overload ambiguity.
            yield("fixed name".case(3, 4))

            // Lastly we can create complex names with a callback that is called
            // with the test right after it has been created. Note that the
            // name property of the case can be destructured and accessed at
            // this stage, but it always returns null. It will be assigned its
            // actual value after the callback has been called.
            yield(case(5, 6) { (a, b, name) ->
                "dynamic name ($a, $b, $name)"
            })
        } named {
            "unnamed"
        } test { (a, b, name) ->
            // Another nice thing about using case is that the name can be
            // accessed in the test itself as well. This allows the construction
            // of more meaningful assertions, since the name can be included in
            // their messages.
            //
            //   Multiple Failures (2 failures)
            //     org.opentest4j.AssertionFailedError: a=1 of null should be odd ==> expected: <false> but was: <true>
            //     org.opentest4j.AssertionFailedError: b=2 of null should be even ==> expected: <true> but was: <false>
            assertAll(
                { assertFalse(a % 2 == 0, "a=$a of $name should be odd") },
                { assertTrue(b % 2 == 0, "b=$b of $name should be even") },
            )
        }
}
