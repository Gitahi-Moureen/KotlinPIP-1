//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   println(sentence("Kibaki was the second president of Kenya"))
    greetings("Moureen")
    println(greet("Gitahi"))
    println(numbers(20,30,70,80))
    println(digits(100,134))
    fact("I love singing")
    println(myFacts("I can cook"))
    println(myStatement("Gitahi",22))
    println(statement("I love Akirachix"))
}

//Write a Kotlin function that changes the value of Kibaki to ruto in this sentence
//“Kibaki was the second president of Kenya”

fun sentence(sentence:String):String{
    return(sentence.replace("Kibaki","Ruto "))
}

//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g given “Ada” it will print out “Hello Ada”
fun greetings (name: String){
    println("Hello  $name")
}

//same above question now we return
fun greet(name: String):String{
    return ("Hello $name")
}

//Create and invoke  function that returns the sum of any given 4 numbers
fun numbers (num1:Int, num2:Int, num3:Int, num4:Int):Int{
    return(num1 + num2 + num3 + num4)
}
//Write a function that takes two integers as parameters and returns their sum.
fun digits(num1: Int, num2: Int):Int{
    return(num1 + num2)
}

//Create and invoke a function that prints out an interesting fact about yourself
fun fact(name: String){
    println("Interesting fact about me $name")

}

//Same as above but return
fun myFacts(name:String):String{
    return("Interesting fact about me $name")
}
//Write a function that takes in 2 parameters, name and age and returns a String with this structure
// "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively.
fun myStatement(name:String,age:Int):String{
    return("Hi,my name is $name  and I am $age years old")
}

fun statement(name:String):Int{
    return(name.length)
}