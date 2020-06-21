package com.anatideo.kotlingofpatterns.creational.abstractfactory

import com.anatideo.kotlingofpatterns.creational.abstractfactory.sources.FakeChat
import com.anatideo.kotlingofpatterns.creational.abstractfactory.sources.FakeChatFactory
import com.anatideo.kotlingofpatterns.creational.abstractfactory.sources.SDKChat
import com.anatideo.kotlingofpatterns.creational.abstractfactory.sources.SDKChatFactory
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Chat

/**
 * This class implement the Abstract Factory Pattern which intent is to provide an interface to
 * create families of related or dependent objects without specify their concrete classes.
 *
 * This example provide different chat sources what could be useful when we have to start an
 * integration on client without having the backend solution done in first place. It also makes
 * possible separate the actual concrete implementation of concrete classes. So knowing the app
 * requirements we'll be able to switch between SDKs keeping same expected behavior.
 */
abstract class ChatFactory {
    abstract fun getChat(): Chat

    companion object {
        inline fun <reified T : Chat> create(): ChatFactory =
            when (T::class) {
                SDKChat::class -> SDKChatFactory()
                FakeChat::class -> FakeChatFactory()
                else -> throw IllegalArgumentException()
            }
    }
}