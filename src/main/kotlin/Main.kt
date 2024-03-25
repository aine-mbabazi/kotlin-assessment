fun main() {
arithmetic(arrayOf(10,20,30))
    volumeOfSphere()
}
//Invoke a function that when given  the string "Barnie bakes brown bagels and buns" prints out a list of all the other words and characters making up the string excluding occurences of the letter b.
fun excludeB(){
    var sentence = "Barnie bakes brown bagels and buns"


}
fun arithmetic(numbers:Array<Int>):Int{

    var sum = numbers.sum()
    numbers.count()
    var average = sum/3
    println(sum)
    println(numbers.count())
    println(average)
    return sum
}

//volume of sphere
fun volumeOfSphere(){
    var pie = 3.14159
    var r = 2
    var v = 4/3*pie*r*r*r
    println(v)
}
//A palindrome is a string that reads the same forward and backwards eg madam,wow,kayak.
//Write and invoke a function theat returns true or false depending on whether the word is a palindrome
fun isPalindrome(word:String):Boolean{
    var palindrome = "madam"
    if{word==palindrome
        (println(message = true))}
    else{
        println(false)
    }
    return false
}