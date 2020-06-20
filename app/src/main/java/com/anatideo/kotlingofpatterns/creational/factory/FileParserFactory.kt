package com.anatideo.kotlingofpatterns.creational.factory

interface FileParserFactory {
    fun createFromFileName(fileName: String): FileParser
}