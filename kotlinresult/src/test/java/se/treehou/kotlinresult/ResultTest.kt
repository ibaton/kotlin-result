package se.treehou.kotlinresult

import org.junit.Test

import org.junit.Assert.*
import java.lang.NumberFormatException

class ResultTest {
    @Test
    fun result_unwrapSuccess() {
        val (value, throwable) = Result.Success("Success").unwrap()

        assertEquals("Success", value)
        assertEquals(null, throwable)
    }

    @Test
    fun result_unwrapFailure() {
        val exception = NumberFormatException()
        val (value, throwable) = Result.Failure<String>(exception).unwrap()

        assertEquals(null, value)
        assertEquals(exception, throwable)
    }
}