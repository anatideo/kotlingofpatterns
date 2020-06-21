package com.anatideo.kotlingofpatterns.creational.abstractfactory.model

sealed class User {
    object Self: User()
    class Other(val name: String): User()
}