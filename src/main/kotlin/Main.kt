/**
 * A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
 * Find the time it will take to move a distance of 5km
 * Hint - acceleration = speed/time, speed = distance/time
 */
fun main(){
    //This program calculates the time it takes to move a distance of 5km at a speed of 1000m/s
    val s = 1000
    val d = 5000 //(5km = 5000m)
    val t = d/s
    print("Time is $t seconds")
}
