package com.anatideo.kotlingofpatterns.creational.singleton

class SingletonUsage(
    private val message: String
) {
    fun getMessage(): String {
        /**
         * It not works because it's not possible to create a new singleton instance
         * Singleton in Kotlin implementation create your instance on a high-level abstraction
         * and always returns same instance created in first time
         */
//        val singletonInstance = TextSanitizer()

        /**
         * It works but you initialize another value with the same point of memory
         */
        val singletonInstance = TextSanitizer

        /**
         * Usages of singleton instance
         */
//        return singletonInstance.removeForbiddenChars(message)
        return TextSanitizer.removeForbiddenChars(message)
    }
}