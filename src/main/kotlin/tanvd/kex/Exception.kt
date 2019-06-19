package tanvd.kex

inline fun <T> tryRun(body: () -> T): T? = try {
    body()
} catch (e: Exception) {
    null
}
