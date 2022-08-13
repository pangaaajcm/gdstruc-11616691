import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Random rand = new Random();
        Random randChoice = new Random();
        Scanner pauser = new Scanner(System.in);

        CardStack deck = new CardStack(30);
        CardStack pile = new CardStack(30);
        CardStack hand = new CardStack(30);

        deck.push(new Card(1, "Alpha"));
        deck.push(new Card(2,"Bravo"));
        deck.push(new Card(3,"Charlie"));
        deck.push(new Card(4,"Delta"));
        deck.push(new Card(5,"Echo"));
        deck.push(new Card(6,"Foxtrot"));
        deck.push(new Card(7,"Golf"));
        deck.push(new Card(8,"Hotel"));
        deck.push(new Card(9,"India"));
        deck.push(new Card(10,"Juliet"));
        deck.push(new Card(11,"Kilo"));
        deck.push(new Card(12,"Lima"));
        deck.push(new Card(13,"Mike"));
        deck.push(new Card(14,"November"));
        deck.push(new Card(15,"Oscar"));
        deck.push(new Card(16,"Papa"));
        deck.push(new Card(17,"Quebec"));
        deck.push(new Card(18,"Romeo"));
        deck.push(new Card(19,"Sierra"));
        deck.push(new Card(20,"Tango"));
        deck.push(new Card(21,"Uniform"));
        deck.push(new Card(22,"Victor"));
        deck.push(new Card(23,"Whiskey"));
        deck.push(new Card(24,"Xray"));
        deck.push(new Card(25,"Yankee"));
        deck.push(new Card(26,"Zulu"));
        deck.push(new Card(27,"Ace"));
        deck.push(new Card(28,"Queen"));
        deck.push(new Card(29,"King"));
        deck.push(new Card(30,"Joker"));


        int n = rand.nextInt(5) + 1;
        int randChoiceInt = rand.nextInt(3);
        Card handCard = deck.pop();
        int deckCounter = 30;
        int pileCounter = 0;
        int handCounter = 0;

        do {
            System.out.println("Press Enter to Continue...");
            pauser.nextLine();

            System.out.println("Draw Cards: ");
            if (!deck.isEmpty()) {
                for (int i = 0; i < n; i++) {
                    System.out.println(deck.pop());
                    hand.push(handCard);
                    handCounter++;
                }
            }
            if (n == 5)
            {
                deckCounter = deckCounter - n;
            }
            else if (n == 4)
            {
                deckCounter = deckCounter - n;
            }
            else if (n == 3)
            {
                deckCounter = deckCounter - n;
            }
            else if (n == 2)
            {
                deckCounter = deckCounter - n;
            }
            else
            {
                deckCounter--;
            }

            System.out.println("HAND CARD: " + handCard);
            System.out.println("Number of Cards on Deck: " + deckCounter);
            System.out.println("Number of Cards on Hand: " + handCounter);

            if (deckCounter <= 2)
            {
                System.out.println("Low Number of Cards on Deck, GAME FINISH!");
                break;
            }

            if (deckCounter <= 0)
            {
                System.out.println("No more Cards on Deck, GAME FINISH!");
                break;
            }

        } while (true);
    }
}