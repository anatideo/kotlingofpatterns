package com.anatideo.kotlingofpatterns.creational.prototype

class PrototypeUsage {
    fun main() {
        val card = Card(
            name = "Kyle Wayne",
            number = "5148 1949 5226 0373",
            cardStatus = Card.CardStatus.ACTIVE
        )

        /**
         * Imagine an already created data structure which is updated but only one of its fields
         * needs to change. Then all you have to do is overwrite it using its copy member
         */
        val updatedCard = card.copy(cardStatus = Card.CardStatus.BLOCKED)

        println("Initial card values: $card")
        println("Card after it was updated: $updatedCard")

        /**
         * updatedCard expected output:
         *
         * name: "Kyle Wayne"
         * number: "5148 1949 5226 0373"
         * cardStatus: CardStatus.BLOCKED
         */
    }
}