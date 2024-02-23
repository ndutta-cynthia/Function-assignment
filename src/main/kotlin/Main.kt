fun main(){
    theName("Cynthia")
    sum(13,6)
    sum(26,32, 16,32)
    aFact("I love gymnastics")
}
fun theName(name:String){
    println("Hello $name")


}

fun sum(num1:Int ,num2:Int):Int{
    var mod= num1 % num2
    println(mod)
    return mod
}
fun sum(num1: Int ,num2: Int ,num3:Int ,num4: Int):Int{
  var add = num1 + num2 + num3 + num4
    println(add)
    return add
}

fun aFact(name: String ):String{
   println(name)
    return name

}