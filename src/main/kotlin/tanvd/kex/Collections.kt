package tanvd.kex

typealias LinkedSet<T> = LinkedHashSet<T>

//builders

fun <T> buildList(body: MutableList<T>.() -> Unit): List<T> {
    val result = ArrayList<T>()
    result.body()
    return result
}

fun <T> buildSet(body: MutableSet<T>.() -> Unit): Set<T> {
    val result = LinkedSet<T>()
    result.body()
    return result
}

fun <T, E> buildMap(body: MutableMap<T, E>.() -> Unit): Map<T, E> {
    val result = HashMap<T, E>()
    result.body()
    return result
}

//util methods
/** Get first element, which evaluated to not null value. Otherwise, null. */
inline fun <T, E : Any> Iterable<T>.untilNotNull(func: (T) -> E?): E? {
    for (element in this) {
        val value = func(element)
        if (value != null) {
            return value
        }
    }
    return null
}
