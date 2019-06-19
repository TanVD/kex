package tanvd.kex

fun Boolean?.orTrue() = this ?: true
fun Boolean?.orFalse() = this ?: false


fun <T> Boolean.ifTrue(body: () -> T): T? = if (this) {
    body()
} else {
    null
}

fun <T> Boolean.ifFalse(body: () -> T): T? = if (!this) {
    body()
} else {
    null
}
