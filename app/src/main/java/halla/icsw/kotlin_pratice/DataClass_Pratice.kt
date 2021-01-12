package halla.icsw.kotlin_pratice

data class ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class ticketClass(val companyName : String, val name : String, var date : String, var seatNumber : Int)


fun main(){
    val ticketA = ticket("koreana", "LEE", "02-21", 65)
    val ticketB = ticketClass("koreana", "LEE", "02-21", 65)

    println(ticketA)
    println(ticketB)
}