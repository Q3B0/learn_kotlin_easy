package variable

fun main(){
//   1. 完整方式定义变量
//    var 变量名:数据类型 = 值
    var x:Int = 100
    println("x:$x")
//   2. 定义与赋值分开
    var y:Int
    y = 200
    println("y:$y")
//  3. 最常用方式
    var z = 300
    println("z:$z")
//  4. 定义无法被修改的变量，《可用于声明对象》
//  注意:
//  val声明变量必须在声明时进行赋值
//  val 变量名:数据类型 = 值
//  简化 val 变量名 = 值
    val cx:Int = 100
    val cy = 200
//    ！！！声明时不赋值会报错
//    val cz
//    ！！！重新赋值会报错
//    cx = 200
    println("cx:$cx")
    println("cy:$cy")
}