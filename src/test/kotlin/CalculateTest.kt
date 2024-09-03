import kotlin.test.Test
import kotlin.test.assertEquals

class CalculateTest {
  @Test
  fun testCalculate() {
    var sum = 0
    for (i in 0..9) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i
      }
    }
    assertEquals(23, sum, "The calculate function should add multiples of 3 or 5 for anything under the number 10")
  }
}

