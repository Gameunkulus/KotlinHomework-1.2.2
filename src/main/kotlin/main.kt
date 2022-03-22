fun main() {
    val likes = 15;
    if (likes > 21)

        if (likes % 10 > 1 && likes % 10 < 5)
            println("Проголосовало ${likes} человека")
        else if(likes % 10 === 1)
            println("Проголосовало ${likes} человек")
        else
            println("Проголосовало ${likes} людей")
    else if (likes > 1 && likes < 5)
        println("Проголосовало ${likes} человека")
    else
        println("Проголосовало ${likes} человек")
}