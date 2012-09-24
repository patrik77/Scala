object balance {

/*
  def balance(chars: List[Char]): Boolean = {
  
   
    else
      false
  
  }
*/

	def increase(chars: List[Char], counter: Int): Int ={
		var number = 0
		if(chars.isEmpty)
			return number
		else
			if(chars.head == '(') {
			number = number + 1
		}
			
			increase(chars.tail, number)
		}                                 //> increase: (chars: List[Char], counter: Int)Int
		
		




//balance("(I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)
increase("(I told him (that it's not (yet) done).\n(But he wasn't listening)".toList, 2)
                                                  //> res0: Int = 0

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