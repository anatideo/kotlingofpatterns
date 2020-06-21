package com.anatideo.kotlingofpatterns.creational.factory

import com.anatideo.kotlingofpatterns.creational.factory.fileparser.base.FileParser

class FactoryUsage(
    private val standardFileParserFactory: StandardFileParserFactory = StandardFileParserFactory()
) {
    fun parseFile(fileName: String): FileParser {
//        return standardFileParserFactory.createFromFileName("filename.xml")
        return standardFileParserFactory.createFromFileName(fileName)
    }
}