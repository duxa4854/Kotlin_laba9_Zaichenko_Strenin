package example
import resources.OutpostResource
import resources.ResourceManager
interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("Останавливаемся...")
    }
}
class Car(
    override val model: String,
    override val number: String
) : Movable {
    override var speed =60
    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft(
    override val model: String,
    override val number: String
) : Movable{
    override var speed=600

    override fun move() {
        println("летим на самолете со скоростью $speed км/ч")
    }
    override fun stop() = println("Приземляем")
}

fun travel(obj: Movable) = obj.move()
fun main (){
    val car = Car("Lada","134LAD")
    val aircraft = Aircraft("Boeing","727")
    aircraft.move()
    travel(car)
    travel(aircraft)
    val pavel = WorkingStudent("Pavel")
    pavel.work()
    pavel.study()
    val player = MediaPlayer()
    player.play()


}
interface Worker{
    fun work()

}
interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker,Student{
    override fun work() {
        println("$name работает")
    }

    override fun study() {
        println("$name учится")
    }
}
interface VideoPlayable{
    fun play() = println("Play video")
}
interface  AudioPlayable {
    fun play() = println("Play audio")
}
class  MediaPlayer : VideoPlayable, AudioPlayable{
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}