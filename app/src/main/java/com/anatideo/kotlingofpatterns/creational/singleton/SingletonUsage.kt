package com.anatideo.kotlingofpatterns.creational.singleton

class SingletonUsage(
    private val message: String
) {
    fun getMessage(): String {
        /**
         * It doesn't works because isn't possible to create a new singleton instance
         * Singleton implementation in Kotlin create your instance on a high-level abstraction
         * and always returns same instance created in first time
         */
//        val singletonInstance = TextSanitizer()

        /**
         * It works but doing that you initialize another value with same point of memory, what
         * could be useless
         */
//        val singletonInstance = TextSanitizer

        /**
         * Usages of singleton instance
         */
//        return singletonInstance.removeForbiddenChars(message)
        return TextSanitizer.removeForbiddenChars(message)
    }
}