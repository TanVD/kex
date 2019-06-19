package tanvd.kex

fun String.trimToNull(): String? = takeIf(String::isNotBlank)
