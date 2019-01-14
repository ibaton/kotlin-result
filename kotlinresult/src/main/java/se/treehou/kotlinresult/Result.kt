package se.treehou.kotlinresult

/**
 * Wrapper for operations that can success or fail.
 */
sealed class Result<out T> {

    /**
     * Successful operation
     */
    class Success<out T>(val value: T): Result<T>(){
        override operator fun component1(): T? = value
        override operator fun component2(): Throwable? = null

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Success<*>

            if (value != other.value) return false

            return true
        }

        override fun hashCode(): Int {
            return value?.hashCode() ?: 0
        }
    }

    /**
     * Failed operation
     */
    class Failure<out T>(val throwable: Throwable): Result<T>(){
        override operator fun component1(): T? = null
        override operator fun component2(): Throwable = throwable

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Failure<*>

            if (throwable != other.throwable) return false

            return true
        }

        override fun hashCode(): Int {
            return throwable.hashCode()
        }


    }

    abstract operator fun component1(): T?
    abstract operator fun component2(): Throwable?
}