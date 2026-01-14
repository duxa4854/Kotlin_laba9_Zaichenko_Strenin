package resources
import resources.OutpostResource
import resources.ResourceManager
data class OutpostResource(
    val id: Int,
    val name: String,
    var amount: Int
){
    override fun toString(): String {
        return "Ваш ресурс: $id | Имя: $name | Количество: $amount"
    }
}
fun main() {
    val gas = OutpostResource(1, "Gas", 100)
    val mineral = OutpostResource(2, "Minerals", 250)
    println("Успех! Вы добыли дополнительное количество минералов: ${mineral.amount + 50}")
    val bounusMineral = mineral.copy(3,"Minerals Bonus", amount
    =mineral.amount + 50)
    println(gas.toString())
    println(mineral.toString())
    println(bounusMineral.toString())

}