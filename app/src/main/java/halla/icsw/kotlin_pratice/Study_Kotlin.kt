package halla.icsw.kotlin_pratice

fun main() {
    list()
}

// 함수 선언
fun hello(): String {
    return "Hello World!"
}

fun add(a: Int, b: Int) {
    var c: Int = a + b
    return println(c)
}

// String 템플릿
fun whoRU(firstname: String, lastName: String, age: Int) {
    var firstName: String = firstname
    var lastName: String = lastName
    var age: Int = age

    println("My name is ${firstName + " " + lastName}, i'm $age")
}

// 반복문 예제

fun ifGrade(score: Int) {
    if (score in 90..100)
        println("A")
    else if (score in 80..89)
        println("B")
    else
        println("C")
}

fun whenGrade(score: Int) {
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        else -> println("C")
    }
}

//collection
fun list() {
    var list = listOf("a", "b", "c")
    println(list[0])
    println(list[1])
    println(list[2])

    var list2 = arrayListOf("1", 2, "3")
    println(list2[0])
    println(list2[1])
    println(list2[2])

    var array = Array<Int>(10, {0}) // size가 10이고, 각 인덱스에 0을 넣은 배열 선언
    for (num in array){
        println(num)
    }

    //집합인 set, 키-값 쌍인 map 또한 같다.
    //mutable : 변경 가능 immutable : 변경 불가능
}

// 반복문 예제
fun for_Pratice() {
    var names = arrayListOf<String>("LEE", "KIM", "PARK")
    for ((index, name) in names.withIndex()) {
        println("${index + 1}번째 : ${name}")
    }


    var result = 0
    for (num in 1..100) { // step n : n씩 건너뛰며 , 10 downTo 1 : 10에서 1로 , 1 until 100 : 100미만까지
        result += num
    }
    println(result)
}

fun while_pratice() {
    var num = 1
    var result = 0
    while (num <= 100) {
        result += num
        num++
    }
    println(result)
}

