package com.anatideo.kotlingofpatterns.creational.prototype

/**
 * The prototype pattern is used when the type of objects to create is determined by a prototypical
 * instance, which is cloned to produce new objects. 
 *
 * One way of achieving it in Kotlin is declaring your class as a 'data class' which provides some 
 * standard functionality and utility functions such as 'copy()', what is useful to the case that 
 * we need to copy an object altering some of its properties but keeping the rest unchanged
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
