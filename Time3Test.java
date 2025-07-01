public class Time3Test {
    public static void main(String[] args) {

        Time3 t1 = new Time3();// 00:00:00
        Time3 t2 = new Time3(2);//02:00:00
        Time3 t3 = new Time3(21, 34);//21:34:00
        Time3 t4 = new Time3(12, 25, 42);// 12:25:42
        Time3 t5 = new Time3(t4);// 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        //tenta iniciar t6 com valores invalidos
        try {
            Time3 t6 = new Time3(27, 74, 99);

        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }
        //exibe objeto Time3  nos formatos de 24 horas e 12 horas
        private static void displayTime(String header,Time3 t){
            System.out.printf("%s%n  %s%n  %s%n ",header, t.toUniversalString(),t.toString());
        }
    }

