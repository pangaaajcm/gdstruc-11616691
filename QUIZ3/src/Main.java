import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner pauser = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(100);

        queue.add(new Player(1, "aceu", 100));
        queue.add(new Player(2, "Sinatraa", 100));
        queue.add(new Player(3, "Subroza", 95));
        queue.add(new Player(4, "ploo", 90));
        queue.add(new Player(5, "Achu", 95));
        queue.add(new Player(6, "Tenz", 97));
        queue.add(new Player(7, "Shazam", 91));
        queue.add(new Player(8, "Shroud", 98));
        queue.add(new Player(9, "Nine", 96));
        queue.add(new Player(10, "Granz", 89));
        queue.add(new Player(12, "Ainz", 100));
        queue.add(new Player(13, "Sowu", 94));
        queue.add(new Player(14, "Kokwa", 93));
        queue.add(new Player(15, "Kire", 92));
        queue.add(new Player(16, "Sisu", 98));
        queue.add(new Player(17, "Chizo", 91));
        queue.add(new Player(18, "Jizo", 96));
        queue.add(new Player(19, "Yuji", 95));
        queue.add(new Player(20, "Naruto", 84));
        queue.add(new Player(21, "Sasuke", 92));
        queue.add(new Player(22, "Boruto", 96));
        queue.add(new Player(23, "Hinata", 93));
        queue.add(new Player(24, "Sakura", 91));
        queue.add(new Player(25, "Luffy", 86));
        queue.add(new Player(26, "Zoro", 97));
        queue.add(new Player(27, "Sanji", 96));
        queue.add(new Player(28, "Jinbei", 94));
        queue.add(new Player(29, "Nami", 91));
        queue.add(new Player(30, "Franky", 96));
        queue.add(new Player(31, "Robin", 100));
        queue.add(new Player(32, "Chopper", 98));
        queue.add(new Player(33, "Brook", 84));
        queue.add(new Player(34, "Yamato", 86));
        queue.add(new Player(35, "Ussop", 99));
        queue.add(new Player(36, "Kaidou", 92));
        queue.add(new Player(37, "Shanks", 94));
        queue.add(new Player(38, "Bigmom", 86));
        queue.add(new Player(39, "Garp", 99));
        queue.add(new Player(40, "Akainu", 87));
        queue.add(new Player(41, "Dragon", 91));
        queue.add(new Player(42, "Ace", 96));
        queue.add(new Player(43, "Sabo", 100));
        queue.add(new Player(44, "Smoker", 91));
        queue.add(new Player(45, "Law", 93));
        queue.add(new Player(46, "Killer", 94));
        queue.add(new Player(47, "Hanzo", 92));
        queue.add(new Player(48, "Gaara", 97));
        queue.add(new Player(49, "Rimuru", 94));
        queue.add(new Player(50, "Tempest", 85));
        queue.add(new Player(51, "Logan", 89));
        queue.add(new Player(52, "Harry", 78));
        queue.add(new Player(53, "Suzune", 98));
        queue.add(new Player(54, "Nani", 88));
        queue.add(new Player(55, "Rush", 89));
        queue.add(new Player(56, "Gutz", 100));
        queue.add(new Player(57, "King", 100));
        queue.add(new Player(58, "Queen", 100));
        queue.add(new Player(59, "Jack", 100));
        queue.add(new Player(60, "Archer", 100));
        queue.add(new Player(61, "Spade", 100));
        queue.add(new Player(62, "Clover", 100));
        queue.add(new Player(63, "Diamond", 100));
        queue.add(new Player(64, "Julius", 100));
        queue.add(new Player(65, "Hearts", 100));
        queue.add(new Player(66, "PC", 100));
        queue.add(new Player(67, "Layer", 100));
        queue.add(new Player(68, "Three", 100));
        queue.add(new Player(69, "Ozone", 100));
        queue.add(new Player(70, "Legends", 100));
        queue.add(new Player(71, "Chico", 100));
        queue.add(new Player(72, "Loonie", 100));
        queue.add(new Player(73, "Zaito", 100));
        queue.add(new Player(74, "Dello", 100));
        queue.add(new Player(75, "Cardo", 100));
        queue.add(new Player(76, "Dalisay", 100));
        queue.add(new Player(77, "Alyana", 100));
        queue.add(new Player(78, "Coco", 100));
        queue.add(new Player(79, "Frake", 100));
        queue.add(new Player(80, "Drake", 100));
        queue.add(new Player(81, "Snoop", 100));
        queue.add(new Player(82, "Dog", 100));
        queue.add(new Player(83, "Big", 100));
        queue.add(new Player(84, "Notorious", 100));
        queue.add(new Player(85, "Sheesh", 100));
        queue.add(new Player(86, "hay", 100));
        queue.add(new Player(87, "Wala", 100));
        queue.add(new Player(88, "Na", 100));
        queue.add(new Player(89, "Ako", 100));
        queue.add(new Player(90, "Maisip", 100));
        queue.add(new Player(91, "MyOne", 100));
        queue.add(new Player(92, "Chillero", 100));
        queue.add(new Player(93, "Kantunan", 100));
        queue.add(new Player(94, "ReadPls", 100));
        queue.add(new Player(95, "HAHAHAHA", 100));
        queue.add(new Player(96, "Outsiders", 100));
        queue.add(new Player(97, "BeastCoast", 100));
        queue.add(new Player(98, "Sky", 100));
        queue.add(new Player(99, "Frye", 100));
        queue.add(new Player(100, "Stirr", 100));

        Random rand = new Random();
        int x = rand.nextInt(5) + 1;
        int players = 0;
        int games = 0;

        do {
            do {

                System.out.println("Press Enter to Continue...");
                pauser.nextLine();

                for (int i = 0; i < x; i++) {
                    System.out.println(queue.remove());
                    players++;
                    if (players == 7)
                    {
                        System.out.println("GAME START!");
                        games++;
                        players = players - 6;
                    }

                    else if (players == 6) {
                        System.out.println("GAME START!");
                        games++;
                        players = players - 5;
                    }

                    else if (players == 5) {
                        System.out.println("GAME START!");
                        games++;
                    }

                    else {
                        System.out.println(queue.remove());
                        players++;
                    }
                }

                System.out.println("Players in Game: (" + players + "/5)");
                System.out.println("GAMES PLAYING NOW: " + games);

                break;

            }while (players != 5);

        }while (games != 10);

        if (games == 10)
        {
            System.out.println("\n****GAME TERMINATING****");
        }
    }
}