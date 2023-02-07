package reloj

class test:reloj() {

    fun buclesegundo(){
        val sigue=true
        while (sigue==true){
            segundo+=1000
            println(display())
        }
    }
}