
fun main(){
  // var sum = 0
  // for (i in 0..10){
  //   if (i % 2 == 0){
  //     sum = sum + i
  //   }
  // }
  // println("Total is $sum")
  val sum = addDivisional2()
  println(sum)
}

// add 2 4 6 8 10 = 30

// class SumTest {
//   @test
//   fun `Sum of div 2 is 30` {
//
//   }
// }

fun addDivisional2(): Int{
  var sum = 0
  var i = 0
  while(i <= 10){
    if (i % 2 == 0){
      sum = sum + i
    }
  i++
  }
  return sum
}