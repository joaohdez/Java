public class Time1 {
private int hour;
private int minute;
private int secound;

/*configura o novo valor de tempo uando a data universal
lança uma exceção se a hora,minuto e segundo  for inválido

 */
public void setTime(int hour,int minute,int secound){
    //valida hora, minuto e segundo
    if(hour < 0 ||hour >=24 || minute <0 || minute >=60 ||secound <0 ||secound >=60){
        throw new IllegalArgumentException("hour, minute, and/or secound out of range");
    }

    this.hour = hour;
    this.minute = minute;
    this.secound = secound;
}

 //converte em string no formato padrão de hora/data(H:MM:SS AM OU PM)
    public String toString(){

    return String.format("%d:%02d:%02d %s",((hour==0 || hour==12)? 12:hour % 12),
            minute,secound,(hour < 12 ? "AM" : "PM"));
    }
}


