import java.security.SecureRandom;


public class DeckOfCards {
    private Card[] deck;//array de objetos Card
    private int currentCard;//inde de próxima Card a ser distribuída (0.51)
    private static final int NUMBER_OF_CARDS = 52; //número constante de Cards

    //gerador de número aleatório
    private static  final SecureRandom ramdomNumbers = new SecureRandom();

    //construtor preenche baralho de Cartas


    public DeckOfCards() {
        String []faces = {"Ace","Deuce","Three","Four","Five","Six",
        "Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String []suits = {"Hearts","Diamonds","Clubs","Spades"};
        deck = new Card[NUMBER_OF_CARDS]; //Cria array de objetos Card
        currentCard = 0; //a primeira Card a ser distribuída será o deck[0]

        //preenche baralho com objetos Card
        for(int count=0;count<deck.length;count++)
            deck[count] = new Card(faces[count%13],suits[count/13]);

    }

    public void shuffle()
    {
        //a próxima chamada para o metodo dealCard deve começar no deck[0] novamente
        currentCard=0;

        //para cada Card, seleciona outra Card aleatória (0-51) e as compara
        for(int first=0; first < deck.length;first++){
            //seleciona um número aleatorio entre 0 e 51
            int secound = ramdomNumbers.nextInt(NUMBER_OF_CARDS);

            //Compara Card atual com a Card alealatoriamente selecionada
            Card temp = deck[first];
            deck[first] = deck[secound];
            deck[secound] = temp;

        }

    }
    public Card dealCard(){
        if(currentCard <deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
