package modules
import resources.OutpostResource
import resources.ResourceManager
class ResearchLab: OutpostModule(
    "Исследовательская лаборатория"
){
    override fun performAction(manager: ResourceManager) {
        var minerals =manager.get("Minerals")
        if (minerals == null || minerals.amount<30){
            println("Недостаточно минералов для исследования")
            return
        }
        else {
            minerals.amount -= 30

        }
    }
}