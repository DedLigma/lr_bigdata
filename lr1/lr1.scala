import scala.util.Random

object LR1 {
  def generateRandomList(size: Int, range: Int): List[Int] =
    List.fill(size)(Random.nextInt(range))
  
  def findDuplicates(numbers: List[Int]): List[Int] =
    numbers
      .groupBy(identity)                
      .filter { case (_, occurrences) => occurrences.size > 1 } 
      .keys                             
      .toList                           
    
  def main(args: Array[String]): Unit = {
      val randomNumbers = generateRandomList(size = 500, range = 600) 
      val duplicates = findDuplicates(randomNumbers)

      println(s"Случайный список: $randomNumbers ")
      println(s"Элементы, встречающиеся более одного раза: $duplicates")
  }
}
