import java.awt.BufferCapabilities

fun main(){
    var gari=Car("toyota","nissan","red",4)
    gari.indentity()
    println(gari.CalculateParking(4))
    gari.carry(8)
    gari.carry(3)
    var nk= Bus("uba","altima","black",8)
    println(nk.maxTripFare(200.00))
    println(nk.CalculateParking(3))
    println(nk.capacity)





}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates and returns the

//parking fees by multiplying the hours by 20(1 point)
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.points)
//The bus’calculateParkingFees method returns the product of hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
 open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var y = people - capacity
        if (capacity >= people)
            println("carrying $people passengers ")
        else
            println("over capacity by $y people")
    }

    fun indentity() {
        println("I am a $color $make $model")
    }

   open fun CalculateParking(hours: Int): Int {
        var park = hours * 20
        return park
    }
}
class Bus(make: String, model: String, color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var x=fare*capacity
        return x
    }

    override fun CalculateParking(hours: Int): Int {
        var z=hours*capacity
        return z
    }



}
