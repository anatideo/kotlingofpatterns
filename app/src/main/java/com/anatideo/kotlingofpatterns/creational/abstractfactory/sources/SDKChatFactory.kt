package com.anatideo.kotlingofpatterns.creational.abstractfactory.sources

import com.anatideo.kotlingofpatterns.creational.abstractfactory.ChatFactory
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Channel
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Chat
import com.anatideo.kotlingofpatterns.creational.abstractfactory.model.Message

class SDKChatFactory: ChatFactory() {
    override fun getChat() = SDKChat()
}

class SDKChat : Chat {
    override fun getChannels(): List<Channel> {
        TODO("Not yet implemented, get it from remote")
    }

    override fun getMessages(channelId: Long): List<Message> {
        TODO("Not yet implemented, get it from remote")
    }
}