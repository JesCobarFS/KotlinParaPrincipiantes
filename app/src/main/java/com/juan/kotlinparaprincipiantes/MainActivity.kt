package com.juan.kotlinparaprincipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Lección 1
        //  variablesYconstantes();

        //  Lección 2
        //  tiposDeDatos();

        //  Lección 3
        //  sentenciaIf();

        //  Leccion 4
        //  sentenciaWhen()

        //  Leccion 5
        //  arrays()

        //  Leccion 6
        //  maps()

        //  Leccion 7
        //  loops()

        // Leccion 8
        //  nullSafety()

        // Leccion 9
        //  funciones()

        // Leccion 10
        clases()

    }
    /*
   Aqui vamos a hablar de variables y contstantes
     */
    private fun variablesYconstantes(){

        // Variables

        var myFirstVariable = "Hola Juan.!"
        var myFirstNumber = 1;

        println(myFirstVariable);

        myFirstVariable = "Bienvenidos a Mexico"

        println(myFirstVariable);

        // No podemos asignar un tipo int a una variable tipo string
        //myFirstVariable = 1

        var mySecondVariable = "Suscribete"

        println(mySecondVariable);

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "Ya te has suscrito?"

        println(myFirstVariable)

        //Constantes

        val myFirstConstant = "¿Te gusta el tutorial?"

        println(myFirstConstant)

        // Una constante no puede modificar su valor
        // myFirstConstant = "Si te ha gustado, dale like"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)



    }

    /*
    Aqui vamos hablar de tipos de datos (data types)
     */
    private fun tiposDeDatos(){

        // String

        val myString: String = "Hola juan"
        val myString2 = "Bienvenido a Mexico"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, short, Int, Long)

        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt +myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1   // En realidad este es Int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    /*
    Aqui vamos a hablar de la sentencia If
     */
    private fun sentenciaIf(){
        val myNumber = 71

        // operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdat
        // != desigualdad

        // Operadores logicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if((myNumber <= 10 && myNumber > 5) || myNumber == 53){
            //sentencia if
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
        }else if (myNumber == 60){
            println("$myNumber es igual a 60")
        }else if (myNumber != 70){
            println("$myNumber no es igual a 70")
        }else{
            //sentencia else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }

    /*
    Aqui vamos hablar de la sentencia when
     */
    private fun sentenciaWhen(){

        // When con String
        val country = "EEU"

        when (country){
            "España", "Mexico", "Peru", "Colombia","Argentina"    ->{
                println("El idioma es español")
            }

            "EEUU" ->{
                println("El idioma es ingles")
            }
            "Francia" ->{
                println("El idioma es frances")
            }
            else ->{
                println("No conocemos el idioma")
            }
        }

        // wHEN CON int
        val age = 100

        when (age){
            0,1,2 ->{
                println("Eres un bebe")
            }in 3 .. 10 ->{
                println("Eres un niño")
            }in 11 .. 17 ->{
                println("Eres un adolecente")
            }in 18 .. 69 ->{
                println("Eres un adulto")
            }in 70 .. 99 ->{
                println("Eres un anciano")
            }else->{
                println("😱")
            }

        }



    }

    /*
    Aqui vamos a hablar de arrays o arreglos
     */
    private fun arrays(){
        val name = "Juan"
        val surname = "Escobar"
        val company = "Rak"
        val age = "23"

        // Creacion de un array

        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir un confunto de datos

        myArray.addAll(listOf("Hola", "Bienvenido a Mexico"))

        println(myArray)

        // Acceder a adatos

        val myCompany = myArray[1]

        println(myCompany)

        // Modificacion de datos

        myArray[5] = "Suscribete"

        println(myArray)

        // Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos

        myArray.forEach{
            println(it)
        }

        // Optras operaciones

       // Cuenta los elementos
        println(  myArray.count())

        myArray.clear() // Eliminar elementos

        println(myArray.count())

        myArray.first() // Obtiene el primer elemento
        myArray.last()  // Otiene el ultimo elemento

        myArray.sort()  // Ordenar los elementos en orden alfabetico


    }

    /*
    Aqui vamos a hablar de mapas tambien llamados diccionarios
     */
    private fun maps(){

        //sintaxis
        var myMap : Map<String,Int> = mapOf()
        println(myMap)

        // Añadir elementos
        myMap = mutableMapOf("Brasil" to 1, "Pedro" to 2,"Juan" to 3)
        println(myMap)

        // Añadir un soslo valor
        myMap["Ana"] = 7
        myMap.put("Mariana",8)
        println(myMap)

        // Acceso a un dato
        println(myMap["Brasil"])

        // Borrado de datos
        myMap.remove("Brasil")
        println(myMap)


    }

    /*
    Aqui vamos a hablar de loops, tambien llamados bucles
    */
    private fun loops(){

        //  Bucles
        val myArray:List<String> = listOf("Hola", "Bienvenidos al tutorial", "suscribete")
        val myMap = mutableMapOf("Brsil" to 1, "Pedro" to 2, "sara" to 5)

        // For

        for (myStrin in myArray ){
            println(myStrin)
        }

        for(myElemnt in myMap){
            println("${myElemnt.key}-${myElemnt.value} ")
        }

        for(x in 0..10){
            println(x)
        }

        for(x in 9 until 30){
            println(x)
        }

        for(x in 0..10 step 2){
            println(x)
        }

        for(x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray){
            println(myNum)
        }

        // While
        var x = 0

        while (x < 10){
            println(x)
            x += 1
        }

    }

    /*
    Aqui vamo a hablar de seguridad contra nulos (Null Safety)
     */
    private fun nullSafety(){
    var myString = "Juan"
        // myString = null Esto daria un error de compilacion
        println(myString)

        var mySafetyString:String? ="Juan null afety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Jose"
        //println(mySafetyString)

        //println(mySafetyString!!)

        /*if(mySafetyString != null ){
            println(mySafetyString!!)
        }else{
            println(mySafetyString)
        }

         */

        //safe call

        println(mySafetyString?.length)

        mySafetyString?.let{
            println(it)
        }?:run {
            println(mySafetyString)
        }


    }

    /*
        Aqui vamos a hablar de funciones
     */
    fun funciones(){
       sayHello()
        sayHello()
        sayHello()

        saveMyName("Pedro")
        saveMyName("Juan")

        saveMyNameAndAge("Jose", 23)

        val sumResult = sumTwoNumbers(2,4)
        println(sumResult)
        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))


    }

    //Funcio simple
    fun sayHello(){
        println("hola")
    }

    // Funciones con un parametro de entrada
    fun saveMyName(name:String){
        println("Hola, mi nombre es ${name}")
    }

    // Funciones con un parametro de entrada
    fun saveMyNameAndAge(name:String, age:Int){
        println("Hola, mi nombre es ${name} y mi edad es ${age}")
    }

    // Funciones con un valor de retorno
    fun sumTwoNumbers(fistNumber: Int, secondNumber:Int):Int{

        val sum = fistNumber + secondNumber
        return sum

    }

    /*
       Aqui vamos a hablar de las clases
     */
    fun clases(){

        val juan = Programmer("Juan",23, arrayOf(Programmer.Languaje.JAVA,Programmer.Languaje.KOTLIN))
        println(juan.name)

        juan.age=50
        juan.code()

        val sara = Programmer("sara",35, arrayOf(Programmer.Languaje.JAVA), arrayOf(juan))
        println("${sara.friends?.first()?.name} es amigo de ${sara.name}");
    }


}