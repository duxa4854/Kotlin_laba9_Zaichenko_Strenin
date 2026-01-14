package example
import resources.OutpostResource
import resources.ResourceManager
//var age: Int = 18
//    set(value) {
//        if ((value > 0)and (value < 110))
//            field = value
//    }
//
//fun characters.example.example.resources.main() {
//    println(age)
//    age = 45
//    println(age)
//    age = -345
//    println(age)
//}

//class Hero(val name: String){
//    var health: Int = 100
//        set(value) {
//            field = value.coerceIn(0, 100)
//        }
//    var stamina : Int = 50
//        get() = field + 10
//    var level: Int = 1
//        private set
//    fun levelUp() {
//        level++
//        println("$name Повысил уровень до $level!")}
//}

//fun characters.example.example.resources.main() {
//    val hero = Hero("Утер")
//    hero.health = 150
//    println(hero.health)
//    println(hero.stamina)
////    hero.level = 10
//    hero.levelUp()
//}

abstract class  Human(val name: String){
    abstract var age: Int
    abstract fun hello()
}

class Person(name: String, override var age: Int): Human(name) {
    override fun hello() {
        println("My name is $name")
    }
}
fun main(){
    val denis: Person = Person("Denis",20)
    val maksim: Human = Person("Maksim",19)
}

abstract class Figure{
    abstract fun perimeter(): Float
    abstract fun area(): Float
}

class Rectangle(val width: Float, val height: Float): Figure(){
    override fun perimeter(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}
