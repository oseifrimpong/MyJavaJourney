/*
* Write a program that converts a total number of seconds to hours, minutes, and seconds.
* It should
* (1) prompt the user for input,
* (2) read an integer from the keyboard,
* (3) calculate the result, and
* (4) use printf to display the output.
* For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".*/
package chThree;

import java.util.Scanner;

public class ConvertSecondsToTime {
  public static void main (String [] args) {
    final int TIME_CONSTANT = 3600;
    int inputSeconds, hours, minutes, seconds;
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter total number of seconds");
    inputSeconds = in.nextInt ();

    hours = inputSeconds/TIME_CONSTANT;
    minutes = (inputSeconds%TIME_CONSTANT)/60;
    seconds = (inputSeconds%60);
    System.out.printf (" %d seconds =  %d hour(s) : %d minute(s) : %d seconds", inputSeconds, hours, minutes, seconds);
  }
}
