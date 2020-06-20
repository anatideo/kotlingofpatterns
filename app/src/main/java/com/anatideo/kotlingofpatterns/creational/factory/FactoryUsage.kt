package com.anatideo.kotlingofpatterns.creational.factory

class FactoryUsage(
    private val standardFileParserFactory: StandardFileParserFactory = StandardFileParserFactory()
) {
    fun readFile(): FileParser {
        return standardFileParserFactory.createFromFileName("filename.xml")
    }
}