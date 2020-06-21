package com.anatideo.kotlingofpatterns.creational.factory

import com.anatideo.kotlingofpatterns.creational.factory.fileparser.base.FileParser

interface FileParserFactory {
    fun createFromFileName(fileName: String): FileParser
}