package se.treehou.kotlinresult

/**
 * Wrapper for operations that can success or fail.
 */
sealed class Result<out T> {

    /**
     * Successful operation
     */
    data class Success<out T: Any>(val value: T): Result<T>(){
        override fun unwrap(): Pair<T?, Throwable?> = Pair<T?, Throwable?>(value, null)
    }

    /**
     * Failed operation
     */
    data class Failure<out T: Any>(val throwable: Throwable): Result<T>(){
        override fun unwrap(): Pair<T?, Throwable?> = Pair<T?, Throwable?>(null, throwable)
    }

    /**
     * Unwraps result into a pair of (value, throwable).
     */
    abstract fun unwrap(): Pair<T?, Throwable?>
}