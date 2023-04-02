package com.csecoder.imagecompressor

/**
 * Register some methods which permissions are needed.
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
annotation class Need