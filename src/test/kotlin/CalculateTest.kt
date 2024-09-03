
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumTest {

  @Test
  fun testCalculate() {
    val sum = Sum()
    val result = sum.calculate()
    assertEquals(233168, result, "The calculate function should add multiples of 3 or 5 for anything under the number 1000")
  }
}

