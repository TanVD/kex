package tanvd.kex

import java.io.File

object Resources {
    fun getFile(file: String) = File(this::class.java.classLoader.getResource(file).file)
    fun getStream(file: String) = getFile(file).inputStream()

    fun getText(file: String) = getFile(file).readText()
    fun getBytes(file: String) = getFile(file).readBytes()
}
