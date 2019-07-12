/*
1. Create a new program named Date.java. Copy or type in something like the hello world program and make sure you can compile and run it.

2. Following the example in “Printing Variables”, write a program that creates variables named day, date, month, and year.
The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th).
What type is each variable? Assign values to those variables that represent today’s date.

3. Display (print out) the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far.
Compile and run your program before moving on.

4. Modify the program so that it displays the date in standard American format, for example: Thursday, July 16, 2015.

5. Modify the program so it also displays the date in European format. The final output should be:
                  American format:
                  Thursday, July 16, 2015
                  European format:
                  Thursday 16 July 2015
 */
package chTwo;

public class Date {
  public static void main (String [] args){
    System.out.println ("Hello, World!");

    String day, month, date;
    int year;

    date = "6th";
    day = "Saturday";
    month ="July";
    year = 2019;

    System.out.println ("American Format:");
    System.out.println (day + ", " + month + " " + date + ", " + year);
    System.out.println ("European Format:");
    System.out.println (day + " " + date + " " + month + " " + year);

  }
}
