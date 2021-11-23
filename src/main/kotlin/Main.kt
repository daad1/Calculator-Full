import java.lang.Exception

  fun main() {

      // First compiler will enter inside while loop
      while (true) {

          // Ask to user enter first number
          print("Enter your first number: ")
          val numberOne = readLine()!!

          // After user enter number the compiler will go to function 'checkDivided' see if user enter number
          // else user enter word will ask the user enter number only
          // after that ask user enter operator they have several options if user enter operator will print first number and operator

          if (checkDivided(numberOne)) {
              println(numberOne)
              print("Enter operator: ")
              val operator = readLine()

              if (operator == "+" || operator == "-" || operator == "/" || operator == "*") {
                  println(numberOne + operator)

                  // Ask to user enter second number

                  print("Enter your second number: ")
                  val numberTwo = readLine()!!

                  //Here if user enter operator divide and Second number Zero will show to user cannot divide by 0
                  if (checkDivided(numberTwo)) {
                      if (numberTwo.toFloat() == 0f && operator == "/") {
                          println("You cannot divide by 0")

                          // else call 'first Number', 'operator', 'Second Number'  and function 'equation'
                      } else {
                          "$numberOne $operator $numberTwo = ${
                              equation(
                                  numberOne.toFloat(),
                                  operator[0],
                                  numberTwo.toFloat()
                              )
                          }"
                          break
                      }
                  }
                  //else user enter by mistake ask them to enter valid operator.
              } else {
                  println("please enter valid operator")
              }
          }

      }
  }


 //The function have two number and one operator
  fun equation(numberOne: Float,  oper: Char , numberTwo: Float) {
     //enter instead loop and wait to user enter any operator and show that
     when (oper) {
         '+' -> println("$numberOne + $numberTwo = " + (numberOne + numberTwo))
         '-' -> println("$numberOne - $numberTwo = " + (numberOne - numberTwo))
         '*' -> println("$numberOne * $numberTwo = " + (numberOne * numberTwo))
         else -> println("$numberOne / $numberTwo = " + (numberOne / numberTwo))
     }
 }


    // This function if user enter anything except number will return false and show them must enter number.
   fun checkDivided(number: String): Boolean {
        try {
            number.toFloat()
            return true
        } catch (e: Exception) {
            println("Please Enter numbers only.")

        }
        return false

    }





