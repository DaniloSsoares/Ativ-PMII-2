class Operadores{
    fun somar(a:Int,b:Int):Int{
        return a+b
    }
    fun sub(a:Int,b:Int):Int{
        return a-b
    }
    fun mult(a:Int,b:Int):Int{
        return a*b
    }
    fun divi(a:Int,b:Int):Int{
        return a/b
    }

 }

fun main() {
    println("Digite o valor para A")
    val a= readLine()?.toIntOrNull()
    println("Digite o valor para B")
    val b= readLine()?.toIntOrNull()

    if (a != null && b != null) {
        println("Agora digite o tipo de calculo")
        println("+ para soma")
        println("- para subtrair")
        println("* para multiplicar")
        println("/ para divisão")
        val operacao = readLine()
        val operadores = Operadores()

        when (operacao) {
            "+" -> println("Resultado: ${operadores.somar(a, b)}")
            "-" -> println("Resultado: ${operadores.sub(a, b)}")
            "*" -> println("Resultado: ${operadores.mult(a, b)}")
            "/" -> if (b == 0) {
                println("Divisão por zero não é permitida!")
            } else {
                println("Resultado: ${operadores.divi(a, b)}")
            }

            else -> println("Operação inválida!")
        }
    }
    else {
        println("Um ou ambos os valores são inválidos!")
    }
}