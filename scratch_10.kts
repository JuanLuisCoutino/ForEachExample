var perros = arrayOf("Hungaro", "Rex", "Terry", "Chorsito", "Jack")
/*
for(i in perros.indices){
    println("El perro numero ${i+1} se llama ${perros[i]}")
}
 */

var indice = 0
perros.forEach {
    println("El perro numero ${indice+1} se llama $it")
    indice++
}