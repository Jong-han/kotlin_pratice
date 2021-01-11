package halla.icsw.kotlin_pratice

open class Human (var name : String = "NoName", var age : Int = 0){

    init {
        println("new human!!")
    }
    open fun introduce(){
        println("My name is ${name}, ${age}years old.")
    }
    open fun singing(){
        println("LALALAL")
    }
}

class korean(var name1 : String, var age1 : Int, var con : String) : Human() {
    override fun introduce(){
        println("제 이름은 ${name1}이고, ${age1}살 입니다. ${con}인 입니다.")
    }
    override fun singing(){
        println("라라라")
    }
}

fun main(){
    var human1 = Human()
    human1.introduce()
    human1.singing()

    var human2 = korean("철수", 18, "한국")
    human2.introduce()
    human2.singing()
}