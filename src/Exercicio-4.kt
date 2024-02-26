inline fun transacao(funcao: () -> Unit){
    print("abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}
fun main(){
    transacao {
        println("Executando 1 SQL ...")
        println("Executando 2 SQL...")
        println("Executando 3 SQL...")
        println("Executando 4 SQL...")
    }
}
