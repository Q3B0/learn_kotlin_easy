class Variable {
    fun init(){
        //变量
        //使用 【var 变量名:类型 = 值】声明变量
        var x:Int = 0
        println("x:${x}")
        //简化
        var x1 = 0
        println("x1:${x1}")
        //重新赋值
        x1 = 1;
        println("x1:${x1}")
        //使用 【val 变量名:数据类型=值】
        val y1:Int = 0
        println("y1:${y1}")
        //简化
        val y = 0
        println("y:${y}")
        //val声明的变量无法重新赋值 所以也可以称为常量
        //y = 20;
    }

}