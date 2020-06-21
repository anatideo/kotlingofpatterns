package com.anatideo.kotlingofpatterns.creational.abstractfactory.sources

import com.anatideo.kotlingofpatterns.creational.abstractfactory.ChatFactory
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Channel
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Chat
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Message
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.User

class FakeChatFactory : ChatFactory() {
    override fun getChat() = FakeChat()
}

class FakeChat : Chat {
    override fun getChannels(): List<Channel> {
        return listOf(
            Channel(
                id = 1,
                name = "First Channel",
                users = listOf(User.Self, User.Other("Alice"))
            )
        )
    }

    override fun getMessages(channelId: Long): List<Message> {
        return listOf(
            Message(id = 1, text = "Hello, stranger"),
            Message(id = 2, text = "I'm Larry, the doctor")
        )
    }
}