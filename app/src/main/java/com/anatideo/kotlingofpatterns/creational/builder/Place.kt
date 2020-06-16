package com.anatideo.kotlingofpatterns.creational.builder

import android.location.Location

/**
 * This class represents a Builder which constructs complex objects by separating construction
 * and representation. As Effective Java points out, constructors or factory methods with too many
 * parameters become susceptible to bugs when parameters are accidentally swapped in clients.
 *
 * Kotlin’s named parameters solve this problem in many cases because a Kotlin caller can specify
 * the name of every parameter, reducing the chance of misplacing one. However, since Java clients
 * cannot leverage named parameters, the builder pattern remains helpful when you have a large Java
 * codebase that must interact with shiny new Kotlin objects.
 */
class Place private constructor(
    val name: String,
    val location: Location,
    val interestingStuff: String?
) {
    class Builder {
        private lateinit var name: String
        private lateinit var location: Location
        private var interestingStuff: String? = null

        fun name(name: String) = apply { this.name = name }
        fun location(location: Location) = apply { this.location = location }
        fun interestingStuff(interestingStuff: String?) = apply { this.interestingStuff = interestingStuff }

        fun build() = Place(name, location, interestingStuff)
    }
}