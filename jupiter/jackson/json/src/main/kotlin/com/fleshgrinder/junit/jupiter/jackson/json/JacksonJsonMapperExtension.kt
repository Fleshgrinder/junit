package com.fleshgrinder.junit.jupiter.jackson.json

import com.fasterxml.jackson.databind.json.JsonMapper
import java.util.*
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ExtensionContext.Namespace
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver

public class JacksonJsonMapperExtension : ParameterResolver {
    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean =
        parameterContext.parameter.type::class.java == JsonMapper::class.java

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Any =
        extensionContext.root.getStore(Namespace.GLOBAL).getOrComputeIfAbsent(JsonMapper::class.java.canonicalName) {
            JsonMapper.builder().findAndAddModules().defaultLocale(Locale.ROOT).build()
        }
}
