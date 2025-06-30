public class Time2 {

    private int hour;
    private int minute;
    private int secound;

    //configura um novo valor de tempo usando hora universal
    //lanca uma exceção se a hora, minuto ou segundo for invalido

    public void setTime(int hour,int minute,int secound)
    {
        //valida hora, minuto e segundo
        if(hour <0 ||hour >=24 ||minute <0 || minute >=60 || secound <0 || secound >=60)
            throw new IllegalArgumentException("hour, minute and/or second was out of range");

        this.hour = hour;
        this.minute = minute;
        this.secound = secound;
    }

    //converte em string no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d",hour,minute,secound);
    }

    //converte em String no formato padrao de data/hora (H:MM:SS AM OU PM)
    public String toString()
    {
           return String.format("%d:%02d:%02d %s",((hour ==0 ||hour ==12)? 12 : hour%12),
                   minute,secound,(hour < 12 ? "AM" : "PM"));
    }
}//fim da classe Time1
