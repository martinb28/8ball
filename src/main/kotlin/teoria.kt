fun main(args: Array<String>) {
    /*
    val nombre = ""


    if(nombre.isNotEmpty()) {
        println("El largo de nuestra variale nombre es ${nombre.length}")
    }else{
        println("error la variable esta vacia")
    }

    val mensaje : String = if(nombre.length > 4) {
        "Tu nombre es largo"
    } else if(nombre.isEmpty()) {
        "no pusiste nombre"
    }
    else{
        "tienes un nombre corto"
    }
    println(mensaje)
     */
    /*======WHEN======
    val nombreColor = "Carmesi"

    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo", "Carmesi" -> println("El ${nombreColor} simboliza calor")
        else -> println("Error, no tengo informacion del color")
    }

    val code = 501
    when(code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500  -> println("Algo ha fallado")
        else -> println("fuera de rango")
    }

    val tallaDeZapatos = 41
    val mensaje = when (tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,43 -> "casi no nos quedan"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en talle 41,42,43,44 y 45"
    }
    println(mensaje)

     */
    /*=======WHILE===
    var contador = 10
    while(contador > 0){
        println("el valor del contador es $contador")
       contador--
    }

    do {
        println("Generando numero aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("el numero generado es $numeroAleatorio")
    }while(numeroAleatorio > 50)
     */
    /*=====CICOS=====
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for(fruta in listaDeFrutas) println("Hoy voy a comer una fruta llamada $fruta")
    listaDeFrutas.forEach{fruta -> println("Hoy voy a comer una fruta nueva se llamada $fruta")}
    
    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
     */
    /*====NULL===
    var nombre : String? = null
    try{
        throw NullPointerException("referencia nula")
    }catch(excepcion: NullPointerException){
        println("estas colocando un nulo")
    }finally {
        println("finalizando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {primerValor / segundoValor} catch(exception: Exception) {0}
    println(resultado)
    */
    /*=====ELVIS OPERATOR=====
    var nombre: String? = null
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)
    */
    /*=====LISTAS=====
    /* lista inmutable*/
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    /* lista mutable*/
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)
    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3}
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("nuestro array $myArray")
    println("array como lista ${myArray.toList()}")

     */
    /*=====ORDENAR LISTAS=====
    val numerosDeLoteria = listOf(11,22,46,56,78,66)
    val numerosSorted= numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

     */
    /*=====MAPS=====
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    val edadSuperHeroesMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutables)

    edadSuperHeroesMutables.put("Wolverine", 45)
    println(edadSuperHeroesMutables)

    edadSuperHeroesMutables["Storm"] = 30
    println(edadSuperHeroesMutables)

    val edadIronman = edadSuperHeroesMutables["Ironman"]
    println(edadIronman)

    edadSuperHeroesMutables.remove("Wolverine")
    println(edadSuperHeroesMutables)

    println(edadSuperHeroesMutables.keys)
    println(edadSuperHeroesMutables.values)

     */
    /*=====SETS=====
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u","a", "e", "i", "o", "u")
        println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    println(numerosFavoritos)
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull {numero -> numero > 2}
    println(valorDelSet)
    */
    /*=====FUNCIONES=====
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
    imprimirNombre( nombre="Martin", apellido="Bugao")
     */
    /*=====LAMBDAS=====
    val myLambda: (String) -> Int = {valor -> valor.length}
    val lambdaEjecutada = myLambda("hola")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
     */
    /*====HIGH ORDER FUNCTIONS=====
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") {valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda = funcionInception("Carlitos")
    val valorLambda: String = lambda()
    println(valorLambda)
     */
    /*=====LET=====
    var nombre : String? = null
    nombre?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }
    nombre = "Martin"
    nombre?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }

     */
    /*=====WITH=====
    val colores = listOf("Azul", "amarillo", "Rojo")
    with(colores) {
        println("nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
    */
    /*=====RUN=====
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi A3")
        .run{
            removeIf{movil -> movil.contains("Google")}
            this
        }
    println(moviles)
    */
    /*=====APPLY=====
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi A3").apply {
        removeIf{movil -> movil.contains("Google")}
    }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo", "azul", "rojo")
    colores?.apply{
        println("Nuestros colores son $this")
        println("la cantidad de colores es $size")
    }
    */
    /*=====ALSO=====
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi A3").also{
        lista -> println("el valor original de la lista es $lista")
    }.asReversed()
    println(moviles)*/



}


/*
fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es $frase")
}
fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String){
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}

 */
/*fun superFuncion(valorInicial : String, block: (String) -> Int): Int{
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}
 */