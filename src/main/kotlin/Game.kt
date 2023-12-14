fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
    /**updateArray(options)
    println(options[1])
    println(gameChoice)
    */
}

fun getUserChoice(optionsParam: Array<String>): String {
       var isValidChoice = false
       var userChoice = ""
       //Loop until the user enters a valid choice
       while (!isValidChoice) {
           //Ask the user for their choice
           print("Please enter one of the following:")
           for (item in optionsParam) print(" $item")
           println(".")
           //Read the user input
           val userInput = readLine()
           //Validate the user input
           if (userInput != null && userInput in optionsParam) {
               isValidChoice = true
               userChoice = userInput
           }
           //If the choice is invalid, inform the user
           if (!isValidChoice) println("You must enter a valid choice.")
       }
       return userChoice
   }

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

/**fun updateArray(updateArray: Array<String>): Unit {
       updateArray[1] = "Spock"
*/

fun printResult(userChoice: String, gameChoice: String) {
       val result: String
       //Figure out the result
       if (userChoice == gameChoice) result = "Tie!"
       else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
               (userChoice == "Paper" && gameChoice == "Rock") ||
               (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
       else result = "You lose!"
       //print the result
       println("You chose $userChoice. I chose $gameChoice. $result")
   }

   /**fun getUserChoice(optionsParam: Array<String>): String {
       // println("Please enter one of the following: Rock Paper Scissors.")
       print("Please enter one of the following")
       for (item in optionsParam) print(" $item")
       println(".")
       //Read the user input
       val userInput = readLine()
   */


