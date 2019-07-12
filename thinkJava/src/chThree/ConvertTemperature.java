/*
* Write a program that converts a temperature from Celsius to Fahrenheit.
* It should
* (1) prompt the user for input,
* (2) read a double value from the keyboard,
* (3) calculate the result, and
* (4) format the output to one decimal place. For example,
* it should display "24.0 C = 75.2 F".
* */
package chThree;

import java.util.Scanner;

public class ConvertTemperature {
  public static void main (String [] args) {

    double inputCelciusTemperature;
    final double OPERATOR_TWO, OPERATOR_THREE;
    OPERATOR_TWO = 1.8;
    OPERATOR_THREE = 32;
    double newTemperatureInFahrenheit;

    Scanner in = new Scanner (System.in);
    System.out.println ("Enter temperature in Celsius: ");
    inputCelciusTemperature = in.nextDouble ();
    newTemperatureInFahrenheit = inputCelciusTemperature * OPERATOR_TWO + OPERATOR_THREE;

    System.out.printf("The new temperature in fahrenheit is: %.1f" , newTemperatureInFahrenheit);

  }
}
