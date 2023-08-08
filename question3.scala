object question3 {
    def calculateSquare(numbers: List[Int]): List[Int] = {
      // Use the map method with a lambda function to calculate the square of each number
      numbers.map(number => number * number)
    }

    def main(args: Array[String]): Unit = {
      val inputList = List(1, 2, 3, 4, 5)
      val outputList = calculateSquare(inputList)
      println(outputList) // Output: List(1, 4, 9, 16, 25)
    }
  }


