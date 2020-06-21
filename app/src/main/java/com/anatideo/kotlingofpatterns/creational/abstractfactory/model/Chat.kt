package com.anatideo.kotlingofpatterns.creational.abstractfactory.model

interface Chat {
    fun getChannels(): List<Channel>
    fun getMessages(channelId: Long): List<Message>
}