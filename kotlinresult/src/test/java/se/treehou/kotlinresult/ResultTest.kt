package se.treehou.kotlinresult

import org.junit.Test

import org.junit.Assert.*
import java.lang.NumberFormatException

class ResultTest {
    @Test
    fun result_unwrapSuccess() {
        val (value, throwable) = Result.Success("Success")

        assertEquals("Success", value)
        assertEquals(null, throwable)
    }

    @Test
    fun result_unwrapFailure() {
        val exception = NumberFormatException()
        val (value, wrappedThrowable) = Result.Failure<String>(exception)

        assertEquals(null, value)
        assertEquals(exception, wrappedThrowable)
    }
}