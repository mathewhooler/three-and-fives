fun main(){
  var sum = 0
  for (i in 0..999) {
    if (i % 3 == 0 || i % 5 == 0){
      sum += i
    }
  }
  println("Total is $sum")
}

// fun sum3or5(): Int{
//
// }
