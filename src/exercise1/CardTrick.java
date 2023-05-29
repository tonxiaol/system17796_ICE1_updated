package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random ran = new Random();        

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(ran.nextInt(13)+1);
            card.setSuit(Card.SUITS[ran.nextInt(3)+1]);
            hand[i] = card;
        }

        // code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        int guessedCardNumber = 0;
        int guessedCardSuit = 0;

        //ask the user to enter values
        try (Scanner number = new Scanner(System.in)){
            
            // ask the user to enter card value
            System.out.println("Pick a card!");
            System.out.println("What's your card number (enter a number from 1 to 13): ");
            guessedCardNumber = number.nextInt();  // Read user input
            
            // ask the user to enter card suit
            System.out.println("What's your card suit (enter a number from 1 to 4): ");
            guessedCardSuit = number.nextInt();  // Read user input
        }
        
        // Compare user's guess to 7 cards in hand. If the guess is successful, invoke the printInfo() method below.
        boolean isMatched = false;
        for (Card hand1 : hand) {
            if (hand1.getValue() == guessedCardNumber && hand1.getSuit().equals(Card.SUITS[guessedCardSuit-1])) {
                isMatched = true;
            }
        }
        if(isMatched) {
            printInfo();
        }else {
            System.out.println("Your card is not in the hand");
        }
    }
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    
    // I’m done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Xiaoling Tong");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a software engineer");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Watching movies");
        System.out.println("-- Playing tennis");

        System.out.println();
        
    
    }

}
