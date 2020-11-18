fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    // Creating val array, to remain unchanged
    val gameChoice = getGameChoice(options)
    //calling function getGameChoice
    val userChoice = getUserChoice(options)
    //Calling getUserChoice function\
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]
//Function created for random choose value at start.
fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //user input uploading loop - finished when provided input is correct
    while (!isValidChoice) {
        //asking user for choice
        print("Please choose one of the option:")
        for(item in optionsParam) print(" $item")
        println(".")
        //Uploading user input
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //if chosen option is not valid
        if (!isValidChoice) println("Please choose on of available option")
    }
    return userChoice
}
fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Checking result
    if (userChoice == gameChoice) result = "Remis!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "paper")) result = "You won!"
    else result = "You lost :c"
    println("You have choose $userChoice, and I have choose $gameChoice. $result")
}