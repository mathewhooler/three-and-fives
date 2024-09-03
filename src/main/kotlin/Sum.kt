class Sum {
  fun calculate(): Int {
    var sum = 0
    for (i in 0..9) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i
      }
    }
    return sum
  }
}
