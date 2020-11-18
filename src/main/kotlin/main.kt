fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    // Creating val array, to remain unchanged
    val gameChoice = getGameChoice(options)
    //calling function getGameChoice
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]
//Function created for random choose value at start.