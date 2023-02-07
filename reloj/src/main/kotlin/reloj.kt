package reloj

open class reloj {
    var hora = 0
        get():Int {
            return field

        }
        set(valor:Int){
            if (valor <= 23) {
                field = valor
            }
            when (valor){
                24 -> field=0
            }
        }
    var minuto = 0
        get():Int {

            return field

        }
        set(valor:Int){
            if (valor <= 59) {
                field = valor
            }
            else {
                hora+= valor/60
                minuto= valor-60
            }

        }
    var segundo = 0
        get():Int {

            return field

        }
        set(valor:Int){
            if (valor <= 59) {
                field = valor
            }
            else {
                minuto += valor / 60
                segundo= valor - 60
            }
        }

    fun setTime() {
        println("Establezca la hora actual:")
        val nuevahora = readln().toInt()
        hora = nuevahora
        println("Establezca minutos actuales:")
        val nuevomin = readln().toInt()
        minuto = nuevomin
        println("Establezca segundos actuales:")
        val nuevoseg = readln().toInt()
        segundo = nuevoseg
    }
    fun tictac(){
        segundo+=1
        println("Número de segundos incrementado en uno")

    }
    fun display():String {
        return "La hora actual es: $hora:$minuto:$segundo"
    }



}