package stringpattern

import org.junit.Assert
import org.junit.Test

/**
 * Created by bdiao on 16/11/18.
 */
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\s+${month}+\s\d{4}""";

class TestStringTemplates() {
    private fun testMatch(date: String) = Assert.assertTrue("The pattern should match $date", date.matches(getPattern().toRegex()))
    private fun testMismatch(date: String) = Assert.assertFalse("The pattern shouldn't match $date", date.matches(getPattern().toRegex()))

    @Test fun match() {
        testMatch("11 MAR 1952")
    }

    @Test fun match1() {
        testMatch("24 AUG 1957")
    }

    @Test fun doNotMatch() {
        testMismatch("24 RRR 1957")
    }
}