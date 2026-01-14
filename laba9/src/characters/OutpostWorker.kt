package characters
import resources.OutpostResource
import resources.ResourceManager
class OutpostWorker(val name: String) {
    var maxEnergy: Int = 100
        private set
    var energy: Int = maxEnergy
        set(value) {
            field = value.coerceIn(0, maxEnergy)
        }
    var mood: Int = 50
        get() = field + (energy/10)
    var level: Int = 1
        private set
    fun work(){
        println("$name Выполняет работу...")
        energy -= 15
        if (energy <20) println("$name устал!")
    }
    fun rest(){
        println("$name отдыхает...")
        energy += 20
    }
    fun levelUp(){
        level++
        maxEnergy += 20
        energy = maxEnergy
        println("$name повышает уровень: $level Максимальная энергия увеличена до: $maxEnergy")

    }


}
fun main (){
    val worker = OutpostWorker("Андрей")
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.work()
    worker.work()
    worker.work()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.rest()
    worker.energy = 150
//    worker.level = 5
    worker.levelUp()
    val sword = Item(1, "Sword",1)
    val betterSword = sword.copy(quantity = 2)
    println(sword.toString())
    println(betterSword.toString())
    Item(1, "Sword",1)
    Item(1, "Sword",2)
    val(id, name, quantity) = betterSword

}
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int,
) {
    override fun toString(): String {
        return "Id предмета: $id\n Имя: $name\n Количество: $quantity\n"
    }
}

