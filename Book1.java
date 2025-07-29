public enum Book1 {
    // declara constantes do tipo enum
    JHTP("Java How to Program","2015"),
    CHTP("C How to Program","2013"),
    IW3HTP("Internet & World Wide Web How to Program","2012"),
    CPPHTP("C++ How to Program","2014"),
    VBHTP("Visual Basic How to Program","2014"),
    CSHARPHTP("Visual C# How to Program","2014");

    //campos de instancia
    private final String title; //titulo do livro
    private final String copyrightYear; //anos dos direitos autorais


    Book1(String title,String copyrightYear ){
        this.title = title;
        this.copyrightYear = copyrightYear;

    }

    public String getTitle(){
        return title;
    }


public String getCopyrightYear(){
        return copyrightYear;
}

}
