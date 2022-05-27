import org.junit.jupiter.api.Test

class FunctionTest {
    @Test
    fun test(){
        var func:Function = Function()
        func.printMessage("Hello")
        func.printMessageWithPrefix("Hello", "Log")
        func.printMessageWithPrefix("Hello")
        func.printMessageWithPrefix(prefix = "Log", message = "Hello")
        println(func.sum(1, 2))
        println(func.multiply(2, 4))
    }
}