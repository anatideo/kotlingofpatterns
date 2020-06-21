package com.anatideo.kotlingofpatterns.creational.abstractfactory

import com.anatideo.kotlingofpatterns.creational.abstractfactory.sources.FakeChat

class AbstractFactoryUsage {
    fun main() {
        ChatFactory.create<FakeChat>().getChat().getChannels().also { print(it) }
    }
}