package exercise1;
import static exercise1.Card.SUITS;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author aumth
 * @author Aum Thakkar Jan 24, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int one =(int)(1+(Math.random()*14)); 
            card.setValue(one);
            // 
            card.setSuit(Card.SUITS[((int)(+(Math.random()*4)))]);
            String two = card.getSuit();
            hand[i]=new Card(one,two);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        Card user = new Card();
        
        System.out.print("Please choose the suits \n Hearts \n Diamonds \n Spades \n Clubs");
        System.out.println();
        String s1= k.next();
        user.setSuit(s1);
        
        System.out.print("Choose card value between 1 and 13");
        System.out.println();
        int s2 = k.nextInt();
        user.setValue(s2);
        
        for(int i=0;i<hand.length;i++){
            if(s2== hand[i].getValue() && s1.equalsIgnoreCase(hand[i].getSuit()))
               printInfo();       
        }
        
        
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Aum Thakkar Jan 24, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Aum Thakkar");
        System.out.println();
        
        System.out.println("My career ambitions are:");
        System.out.println("To become best in the Computer Science field ");
        System.out.println("To score 4 out of 4 GPA in Java ");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println(" Gaming");
        System.out.println(" Reading");
        System.out.println();
        
    
    }

}
