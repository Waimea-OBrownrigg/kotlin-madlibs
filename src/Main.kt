fun main() {
    println("                  ==========================Generic_Studios Presents==========================")
    println("====================A Brilliantly Overwhelming Really Intelligent Nameless Generator Machine====================")
    println("                  =============================================================================")
    print("Type anything to start! ")
    readln()
    val title = get_string("Enter a title: ")
    val name = get_string("Enter a name: ")
    val pronouns = get_string("Enter that persons pronouns (his/her/their): ")
    val trait = get_string("Enter that persons trait (ending in -ness): ")
    val place_name = get_string("Enter the name of a place: ")
    val event = get_string("Enter a cataclysmic event: ")
    val something = get_string("Enter an object: ")

    println("Long ago, a $title by the name of $name ruled over the land of $place_name.")
    println("It was a time of great prosperity, untill one day, $place_name was almost destroyed by $event!")
    println("luckily through $pronouns sheer $trait, as well as the help of $pronouns $something, $name managed to save the land of $place_name and everyone in it!")
    println("")
    println("")
}

fun get_string(prompt: String):String {
    var user_input: String
    while(true) {
        print(prompt)

        user_input = readln()
        if (user_input.isNotBlank()) break
    }
    return user_input
}