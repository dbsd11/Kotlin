package runs

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

/**
 * Created by bdiao on 16/11/17.
 */
fun getRuns(a: IntArray): Int {
    if (a.none()) {
        return 0;
    }
    var runs = 1;
    var before = a[0]
    for (i in a.indices) {
        if (before.compareTo(a[i]) != 0) {
            runs++
            before = a[i]
        }
    }
    return runs;
}

class Tests {

    @Test fun testRuns1() {
        test(0)
    }

    @Test fun testRuns2() {
        test(1, 1)
    }

    @Test fun testRuns3() {
        test(3, 1, 2, 3)
    }

    @Test fun testRuns4() {
        test(3, 1, 2, 2, 3)
    }

    @Test fun testRuns5() {
        test(3, 1, 1, 2, 3)
    }

    @Test fun testRuns6() {
        test(1, 1, 1, 1, 1)
    }

    @Test fun testRuns7() {
        test(3, 1, 1, 1, 0, 1, 1)
    }

    @Test fun testRuns8() {
        test(3, 1, 1, 1, 0, 1)
    }

    @Test fun testRuns9() {
        test(5, 1, 0, 1, 0, 1)
    }
}

fun test(expected: Int, vararg data: Int) {
    assertEquals(expected, getRuns(data), "\ndata = ${Arrays.toString(data)}")
}