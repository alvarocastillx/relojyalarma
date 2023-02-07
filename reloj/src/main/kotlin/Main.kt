package reloj

fun main() {
    /*
    var reloj = reloj()
    reloj.hora=1
    reloj.minuto=0
    */

    val alarma = relojAlarma()
    alarma.setTime()
    alarma.setAlarm()
    var i = 0
    while (i<60){
        alarma.tictac()
        i+=1
        alarma.compararAlarmas()
    }



}