
/*
* Write a program to guess the randomly generated number and show the difference between both numbers.*/
package chThree;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
  public static void main (String [] args) {
    Random random = new Random ();
    int randomNumber = random.nextInt (100) + 1; // added the 1 to yield both 100 and 1 in the randomization
    System.out.print ("I'm thinking of a number between 1 and 100\n" +
            "(including both). Can you guess what it is? \n");
    Scanner in = new Scanner (System.in);
    System.out.print("Type a number: ");
    int inputNumber = in.nextInt ();
    System.out.println ("Your guess is: " + inputNumber);
    System.out.println ("The number I was thinking of is: " + randomNumber);
    int difference = randomNumber - inputNumber;
    System.out.println ("You were off by: " + difference);
  }
}
