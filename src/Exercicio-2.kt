class Operacoes {
    fun somar(a: Int, b: Int):Int
    {
        return a + b
    }
    fun sub(a: Int, b: Int): Int {
        return a - b
    }
    fun mult(a:Int, b:Int):Int{
        return a * b
    }
    fun divi(a: Int, b: Int):Int{
        return a / b
    }

}


fun somar(a:Int, b:Int):Int{
    return a+b
}

fun calc(a:Int,b:Int, funcao: (Int, Int)-> Int):Int{
    return funcao(a,b)
}
fun main(){
    println("Bem vindo!")
    println (calc(2,3,Operacoes()::somar ))
    println (calc(2,3, Operacoes()::sub))
    println (calc(2,3,Operacoes()::mult))
    println (calc(2,3,Operacoes() ::divi))
    println(calc( 2,3,::somar))
}