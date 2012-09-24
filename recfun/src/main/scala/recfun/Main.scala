package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  }
  /*
  def pascal(c: Int, r: Int): Int = {

    def factor(x: Int): Int = if (x == 0) 1 else x * factor(x - 1)

    factor(r) / (factor(c) * factor(r - c))

  }
*/
  /**
   * Exercise 2
   */

  def balance(chars: List[Char]): Boolean = {
    var balancing = 0;
    def iterate(chars: List[Char], counter: Int): Int = {
      if (chars.isEmpty || balancing <0 )balancing else{
        if (chars.head == '(') {
          balancing = balancing + 1
        } else if (chars.head == ')') {
          balancing = balancing - 1
        }
      iterate(chars.tail, balancing)
      }
    }
    iterate(chars, balancing) == 0
  }

  /*
   def balance(chars: List[Char]): Boolean = {

   def innerBalance(index: Int, innerChars: List[Char]): Int = {
     if (index < 0 || innerChars.isEmpty) index else {
       var head = innerChars.head
       var tail = innerChars.tail
       var change = 0
       if (head.equals('(')) change = 1
       else if (head.equals(')')) change = -1
       innerBalance(index + change, tail)
     }
   }

   print((chars) + " => ")
   if (0 == innerBalance(0, chars)) true else false

 }

  */

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
