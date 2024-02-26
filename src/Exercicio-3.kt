fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()
    for(e in lista ){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}
fun ComTresLetras(nome:String): Boolean{
    return nome.length == 3
}
fun main(){
    val nomes = listOf("Ana","Pedro","Bia","Gui","Rebeca.Dan")
    println(filtrar(nomes, ::ComTresLetras))
}