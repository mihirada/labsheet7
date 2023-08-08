object question1 {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    // Use the filter method with a lambda function to filter even numbers
    numbers.filter(number => number % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterEvenNumbers(inputList)
    println(outputList) // Output: List(2, 4, 6, 8, 10)
  }

}
