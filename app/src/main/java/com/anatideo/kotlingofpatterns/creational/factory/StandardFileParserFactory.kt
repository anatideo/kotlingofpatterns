package com.anatideo.kotlingofpatterns.creational.factory

import java.lang.IllegalArgumentException

/**
 * The factory’s goal is to deliver a ready-to-use object to its client. The factory hides the
 * complexity of creating and selecting the right object for the job.
 */
class StandardFileParserFactory : FileParserFactory {
    override fun createFromFileName(fileName: String): FileParser {
        return when (fileName.fileExtension()) {
            FileType.XML.name -> XmlFileParser()
            FileType.JSON.name -> JsonFileParser()
            else -> throw IllegalArgumentException("$fileName hasn't a known file extension")
        }
    }

    private fun String.fileExtension(): String {
        return toUpperCase().substringAfterLast(".")
    }

    private enum class FileType {
        XML,
        JSON
    }
}