fun main(){
     school()
    modulus(5,4)
    intro("Shamsa",20)
    howLong("Shamsa")

}
fun school(){
    var shule= "CodeHive"
    println(shule[4].toString() + shule[5] + shule[6] + shule[7])
}
fun modulus(f:Int, t:Int):Int{
    println(f % t)
    return f
    return t
}


fun intro(p:String,z:Int){
    println("Hi, my name is $p and I am $z years old")


}
fun howLong(x:String):String{
    println(x.length)
    return x
}