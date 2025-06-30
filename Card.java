public class Card {
    private final String face; //face da carta ("Ace","Deuce",...)
    private final String suit; //naipe da carta "Hearts","Diamonds",...

    public Card(String cardFace,String cardSuit)
    {
        this.face = cardFace; //inicializa face da carta
        this.suit = cardSuit; // inicializa naipe da carta
    }

    public String toString(){
       return face +"of"+suit;
    }

}
