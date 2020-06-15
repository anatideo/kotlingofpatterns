package com.anatideo.kotlingofpatterns.creational.singleton

/**
 * Restricts object creation for a class to only one instance.
 */
object TextSanitizer {
    private val FORBIDDEN_CHARS = listOf("%", "$", "3")

    fun removeForbiddenChars(text: String): String {
        FORBIDDEN_CHARS.forEach { text.replace(it, "") }
        return text
    }
}