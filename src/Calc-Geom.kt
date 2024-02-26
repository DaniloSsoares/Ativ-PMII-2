import kotlin.math.sqrt
import kotlin.math.PI
import kotlin.math.pow
class TipoCalc{
    fun AreaTrianEsca(a: Float, b: Float, c: Float): Float {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
    fun AreaTrianIsos(a: Float, b: Float): Float {
       return (a*b)/2
    }
    fun AreaTrianEquila(lado: Float): Float {
        return (sqrt(3.0) / 4.0 * lado * lado).toFloat()
    }
    fun Area_Reta(alt:Float, bas:Float):Float{
        return alt*bas
    }
    fun Area_circ(raio:Double):Double{
        return PI * raio.pow(2)
    }
    fun AreaLosa(d1: Double, d2: Double): Double {
        return (d1 * d2) / 2
    }
    fun AreaTrap(B: Double, b: Double, h: Double): Double {
        return ((B + b) * h) / 2
    }
}

fun main(){
    println("Bem-vindo!")
    println("Para Começar digite o tipo de calculo ")
    println("TS para Area Triangulo Escaleno")
    println("TI para Area Triangulo Isoceles")
    println("TE para Area Triangulo Equilatero ")
    println("AR para Area do Retângulo")
    println("AC para Area do Círculo")
    println("AL para Area do Losangulo")
    println("AT para Area do Trapézio")

    var Operador= readLine()
    val operadores = TipoCalc()

    if(Operador == "TS" ){
        println("Digite o Valor do lado 1")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor do lado 2")
        val b = readLine()?.toFloatOrNull()
        println("Digite o Valor do lado 3")
        val c = readLine()?.toFloatOrNull()

        if (a != null && b != null && c != null && a + b > c && a + c > b && b + c > a) {
            println("Resultado: ${operadores.AreaTrianEsca(a, b, c)}")
        } else {
            println("Por favor, digite valores válidos para os lados ou valores que formem um Triângulo")
        }
    }
    else if(Operador == "TI" ){
        println("Digite o Valor da Base")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor para Altura")
        val b = readLine()?.toFloatOrNull()

        if (a != null && b != null ) {
            println("Resultado: ${operadores.AreaTrianIsos(a, b)}")
        } else {
            println("Por favor, digite valores válidos para o que se pede.")
        }
    }
    else if(Operador == "TE" ){
        println("Digite o Valor do Lado")
        val a = readLine()?.toFloatOrNull()

        if (a != null ) {
            println("Resultado: ${operadores.AreaTrianEquila(a)}")
        } else {
            println("Por favor, digite valores válidos para o que se pede.")
        }
    }
    else if(Operador == "AR" ){
        println("Digite o Valor da Base")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor para Altura")
        val b = readLine()?.toFloatOrNull()
        if (a!= null && b != null) {
            if (a > b) {
                println("O valor para altura não pode ser maior que o valor da base. Por favor, digite valores válidos.")
            } else {
                println("Resultado: ${operadores.Area_Reta(a, b)}")
            }
        } else {
            println("Por favor, digite valores válidos para o que se pede.")
        }
    }
    else if(Operador == "AC" ){
        println("Digite o Valor do Raio")
        val Raio = readLine()?.toDoubleOrNull()

        if (Raio != null  ) {
            println("Resultado: ${operadores.Area_circ(Raio)}")
        } else {
            println("Por favor, digite valores válidos para o que se pede.")
        }
    }
    else if(Operador == "AL" ){
        println("Digite o Valor da Diagonal 1")
        val d1 = readLine()?.toDoubleOrNull()
        println("Digite o Valor da Diagonal 2")
        val d2 = readLine()?.toDoubleOrNull()

        if (d1 != null && d2 != null) {
            println("Resultado: ${operadores.AreaLosa(d1,d2)}")
        } else {
            println("Por favor, digite valores válidos para o que se pede.")
        }
    }
    else if(Operador == "AT" ){
        println("Digite o Valor da Base Maior")
        val B = readLine()?.toDoubleOrNull()
        println("Digite o Valor do Base Meno")
        val b = readLine()?.toDoubleOrNull()
        println("Digite o Valor da Altura")
        val h = readLine()?.toDoubleOrNull()

        if (B != null && b != null && h != null) {
            println("Resultado: ${operadores.AreaTrap(B , b, h)}")
        } else {
            println("Por favor, digite valores válidos para os lados.")
        }
    }
    else{
        println("Erro!")
        println("Digite novamente o tipo de calculo que você quer realizar!")
    }
}