package collectionhandel

import org.junit.Assert
import org.junit.Test

/**
 * Created by bdiao on 16/11/18.
 */
fun containsEven(collection:Collection<Int>):Boolean=collection.any{it%2==0}

class TestLambdas() {
    @Test fun contains() {
        Assert.assertTrue("The result should be true if the collection contains an even number", containsEven(listOf(1, 2, 3, 126, 555)))
    }

    @Test fun notContains() {
        Assert.assertFalse("The result should be false if the collection doesn't contain an even number", containsEven(listOf(43, 33)))
    }
}