package reloj

class relojAlarma:reloj() {
    var horaAlarma : Int = 0
        get():Int{
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
    var minutoAlarma = 0
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor <= 59) {
                field = valor
            }
            else {
                hora+= valor/60
                minuto+= valor%60
            }
        }
    fun setAlarm(){
        println("Establezca la hora de la alarma:")
        val nuevahora = readln().toInt()
        horaAlarma = nuevahora
        println("Establezca minutos de la alarma:")
        val nuevomin = readln().toInt()
        minutoAlarma = nuevomin
    }
    fun compararAlarmas() {
        if (this.horaAlarma == hora && this.minutoAlarma==this.minuto){
            println("ALARMA")
        }


    }
}