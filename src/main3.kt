// fun main() {
//   val names = listOf("Mat", "Sarah", "Mat", "Mark", "Mat", "Tim", "Rory", "Lissy")
//
//   for(name in names){
//     if (name.length == 3)
//       println(name)
//     }
//   }
// }

fun main() {
  val names = listOf("Mat", "Sarah", "Bill", "Mark", "Steve", "Tim", "Rory", "Lissy")

    for (i in names.indices step 2) {
      println(names[i])
    }
  }
