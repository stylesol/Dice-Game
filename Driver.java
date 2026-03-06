import java.util.Scanner;
/**
 * Write a description of class driver here.
 *
 * @author Olivia
 * @version 4/03/26
 */
public class Driver
{
    
    public static void main(String[] args) {
        
        // A lot of variables here, you prob doin't need them all
        int player1 = 0; // person
        int player2 = 0 ; // computer
        int round = 0;
        
        System.out.println("Welcome to the dice game");
        System.out.println("");
        System.out.println("Round " + round);
        
        
        // create dice to flip
        dice myDice = new dice();
        dice myDice2 = new dice();
        dice myDice3 = new dice();
        dice myDice4 = new dice();
        
        //getting dice to flip
        myDice.roll();
        myDice2.roll();
        
        // gives us the numbers
        System.out.println("Dice 1 rolled: " + myDice.getRoll()); 
        System.out.println("Dice 2 rolled: " + myDice2.getRoll()); 

        player1 = myDice.getRoll() + myDice2.getRoll();
        System.out.println("The players total is: " + player1);
        
        // Get the dice totals - add to play total
        
        
        
        // Roll dice again
        myDice3.roll();
        myDice4.roll();
        
        System.out.println("Dice 1 rolled: " + myDice3.getRoll()); 
        System.out.println("Dice 2 rolled: " + myDice4.getRoll());
        
        // Get the dice totals - add to comp total
        player2 = myDice3.getRoll() + myDice4.getRoll();
        System.out.println("The computers total is: " + player2);
        // check which total is higher announce the winner
        
        if (player1 > player2) {
            System.out.println("You win! ");
        } else if (player1 < player2) {
            System.out.println("Computer wins! ");
        } else{
            System.out.println("It is a tie! ");
        }

        //for loop for dice class
    }
}