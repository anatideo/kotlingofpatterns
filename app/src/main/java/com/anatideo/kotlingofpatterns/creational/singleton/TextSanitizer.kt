package com.anatideo.kotlingofpatterns.creational.singleton

/**
 * It class is an implementation of a Singleton which restricts object creation for a class
 * to only one instance.
 */
object TextSanitizer {
    private val FORBIDDEN_CHARS = listOf("%", "$", "3")

    fun removeForbiddenChars(text: String): String {
        FORBIDDEN_CHARS.forEach { text.replace(it, "") }
        return text
    }
}