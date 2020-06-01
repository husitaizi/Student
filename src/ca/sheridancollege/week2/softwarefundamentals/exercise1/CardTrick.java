/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Chuantai Hu Student ID:991602827
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         c.setValue((int) (Math.random() * 13));
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(c.SUITS[(int) (Math.random() * 3)]);
         magicHand[i] = c;
      }
      Card cUser = new Card();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a card suit:(\"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\" ");
      cUser.setSuit(scan.nextLine());
      System.out.println("Enter a card value: ");
      cUser.setValue(scan.nextInt());

      //insert code to ask the user for Card value and suit, create their card
      for (int i = 0; i < magicHand.length; i++) {
         if (cUser == magicHand[i]) {
            System.out.println("Good luck this time! ");
         }
         System.out.println("Sorry, no luck.");
      }
       // and search magicHand here
      //Then report the result here
// Specify a lucky card and search in the randomly created card array to check the luck. 
      Card luckyCard = new Card();
      luckyCard.setSuit("Hearts");
      luckyCard.setValue(8);
      for (int i = 0; i < magicHand.length; i++) {
         if (cUser == magicHand[i]) {
            System.out.println("Good luck this time! ");
         }
         System.out.println("Sorry, no luck.");
      }
     
   }

}
