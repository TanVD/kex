package tanvd.kex

import java.util.*

fun ByteArray.encodeBase64(): String = Base64.getEncoder().encodeToString(this)
fun String.decodeBase64(): ByteArray = Base64.getDecoder().decode(this)
