package me.seoly.utils.common

object ArrayUtils {

    fun <T> fullFlatten(list: List<Any>): List<T> {
        val result = mutableListOf<T>()

        for (element in list) {
            if (element is List<*>) {
                @Suppress("UNCHECKED_CAST")
                result.addAll(fullFlatten(element as List<Any>))
            } else {
                @Suppress("UNCHECKED_CAST")
                result.add(element as T)
            }
        }

        return result
    }
}