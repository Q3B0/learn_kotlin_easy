class Function {
    //函数使用 fun 进行声明
    //主要的函数声明形式

    /**
     * 标准的函数
     * 有一个String类型的参数
     * 返回类型为Unit（没有返回值）
     */
    fun printMessage(msg:String) : Unit {
        print(msg);
    }

    /**
     * 包含两个参数的函数，其中一个有默认值
     * 默认值参数必须在参数列表最后
     */
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    /**
     * 有两个整数类型的参数
     * 返回值为整数类型
     */
    fun sum(x: Int, y: Int): Int {                                          // 3
        return x + y
    }

    /**
     * 函数表达式 函数体只有一行可以使用
     * 简化函数编写 省略了返回类型和大括号
     */
    fun multiply(x: Int, y: Int) = x * y

}