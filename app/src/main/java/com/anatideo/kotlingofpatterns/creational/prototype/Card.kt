package com.anatideo.kotlingofpatterns.creational.prototype

/**
 * The prototype pattern is used when the type of objects to create is determined by a prototypical
 * instance, which is cloned to produce new objects. To reach this goal in Koltin all we need to do
 * is declare the class as a data class then it gives to you access to the copy() member.
 */
data class Card(
    val name: String,
    val number: String,
    val cardStatus: CardStatus
) {
    enum class CardStatus {
        ACTIVE,
        BLOCKED
    }
}