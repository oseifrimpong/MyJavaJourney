
package chFour;

import java.util.Scanner;

public class Pet {
  public static void zoo1 (int petAge, String petName, String nameOfStreet) {
    System.out.printf ("The age of %s is %d . It grew up on the %s street." ,petName, petAge,nameOfStreet);

  }

  public static void main (String [] args) {
    int age = 11;
    String petName = "Scooby";
    String nameOfStreet = "Papaya Close";
    zoo1 (age, petName, nameOfStreet);
  }
}