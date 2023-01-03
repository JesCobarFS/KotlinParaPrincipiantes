package com.juan.kotlinparaprincipiantes

class Programmer(val name:String,
                 var age:Int,
                 val languajes:Array<Languaje>,
                 val friends: Array<Programmer>? = null
                ) {

    enum class Languaje{
        KOTLIN,
        JAVA,
        JAVASCRIPT
    }

    fun code(){
        for (languajes in languajes){
            println("Estoy programando en ${languajes}")
        }
    }
}