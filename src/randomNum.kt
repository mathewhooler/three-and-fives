import kotlin.random.Random

fun main(){
  val random = Random.Default
  val randomInt = random.nextInt(100)
  println("Random Integer: $randomInt")
}

// fun main(){
//   val random = Random.Default
//   val randomInt = random.nextInt(200, 400)
//   println("Random Integer: $randomInt")
// }