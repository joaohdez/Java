public class Time3
{
    private int hour; // 0-23
    private int minute;//0-59
    private int second; //0-59

    //construtor se argumento Time3
    //inicializa cada variavel de instancia com zero

    public Time3()
    {
        this(0,0,0); //invoca o construtor com 3 argumentos
    }

    //construtor Time3: hora fornecida, minuto e segundo parametrizados com zero

    public Time3(int hour)
    {
        this(hour,0,0); // invoca o construtor de 3 argumentos
    }

    //construtor Time3: hora e minuto fornecidos, segundo parametrizado com zero
    public Time3(int hour, int minute)
    {
        this(hour,minute,0);//invoca o construtor de 3 argumentos
    }

    public Time3(int hour,int minute,int secound)
    {
        if(hour <0 || hour >=24)
            throw  new IllegalArgumentException("hour must be 0-23");

        if(minute <0 || minute >=60)
            throw new IllegalArgumentException("minute must b 0-59");

        if(secound <0 || secound >=60)
            throw new IllegalArgumentException("secound must b 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = secound;
    }

    //construtor Time3: outro objeto Time3 fornecedo

    public Time3(Time3 time)
    {
        //invoca o construtor com tres parametros
        this(time.getHour(),time.getMinute(),time.getSecound());
    }

    //Metodos set
    //Configura um novo valor de tempo usando hora universal;
    //valida os campos

    public void setTimne(int hour, int minute,int second)
    {
        if(hour <0 ||hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
             throw new IllegalArgumentException("minute must be 0-59");

         if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

         this.hour = hour;
         this.minute = minute;
         this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
             throw new IllegalArgumentException("minute must be 0-59");
        this.minute = minute;
    }

    public int getSecound() {
        return second;
    }

    public void setSecound(int secound) {
        if (second < 0 || second >= 60)
             throw new IllegalArgumentException("second must be 0-59");
        this.second = secound;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {

        if (hour < 0 || hour >= 24)
             throw new IllegalArgumentException("hour must be 0-23");
        this.hour = hour;
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d %s",
                ((getHour()==0||getHour()==12)? 12 :getHour()%12),
                getMinute(),getSecound(),(getHour() <12 ?"AM":"PM"));
    }
}//Fim da classe Time3
