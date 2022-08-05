package com.fleshgrinder.junit.jupiter

import kotlin.annotation.AnnotationRetention.BINARY
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION

@DslMarker
@MustBeDocumented
@Retention(BINARY)
@Target(CLASS, FUNCTION)
public annotation class DynamicTestApi
