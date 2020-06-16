package com.anatideo.kotlingofpatterns.creational.builder

import android.location.Location

class BuilderUsage {
    fun getDummyPlace(): Place {
        /**
         * As you can see, It's not possible to create an instance of Place without using
         * its Builder because its constructor is private
         */
//        val place = Place(
//            name = "My home",
//            location = LOCATION
//        )

        return Place
            .Builder()
            .name("My home")
            .location(LOCATION)
            .interestingStuff("It contains some cute cats")
            .build()
    }

    companion object {
        private val LOCATION = Location("dummyProvider").also {
            it.latitude = -18.38643
            it.longitude = 145.34212
        }
    }
}