package dataclass

import org.junit.Assert
import org.junit.Test

/**
 * Created by bdiao on 16/11/18.
 */
data class User(val name: String, var age: Int) {}

fun getPeople(): Set<User> {
    return setOf(User("Alice", 29), User("Alice", 29))
}

class TestDataClasses {
    @Test fun testListOfPeople() {
        Assert.assertEquals("[User(name=Alice, age=29)]", getPeople().toString())
    }
}