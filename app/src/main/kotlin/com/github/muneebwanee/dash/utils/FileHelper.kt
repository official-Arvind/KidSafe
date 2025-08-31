package com.github.muneebwanee.dash.utils

import java.io.File

object FileHelper {
    fun createDirectory(path: String): Boolean {
        return try {
            File(path).mkdirs()
        } catch (e: Exception) {
            false
        }
    }
}