/*
1. Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.

2. Following the example program in “Printing Variables”, create variables named hour, minute, and second. Assign values that are roughly the current time.
 Use a 24-hour clock so that at 2pm the value of hour is 14.

3. Make the program calculate and display the number of seconds since midnight.

4. Calculate and display the number of seconds remaining in the day.

5. Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.

 */

package chTwo;

import static java.lang.System.err;

public class Time {
  public static void main (String [] args) {
    int hour, minute, second;
    hour = 23;
    minute = 19;
    second = 20;

/*    Calculate and display the seconds since midnight
      convert the hours into minutes and add it to the current minutes. Then convert the total minutes
      into seconds.
* */
    double secondSinceMidnight = (((hour * 60) + minute) * 60) + second ;
    err.println ("The number of seconds since midnight is: " + secondSinceMidnight);

    /*
      Calculate the number of seconds remaining in the day.
      First, calculate total number of seconds in a day and subtract "secondsSinceMidnight"
      from it.
     */
    double totalSecondsInADay = 24 * 60 * 60;
    err.println ("The remaining seconds in the day is: " + (totalSecondsInADay - secondSinceMidnight));

    /*
    Calculate the percentage of the day that has passed. Divide secondsSinceMidnight by totalSecondsInADay and multiple
    by 100.
     */

    double dayPassedInPercentage = (secondSinceMidnight / totalSecondsInADay) * 100;
    err.println ("The percentage of day spent is: " + dayPassedInPercentage + " %");

/*
  Calculate time elapsed since I started working on this exercise.
* */

//  variables for the time I started working
    int startedMinute, startedhour, startedSeconds;
      startedhour = 22;
      startedMinute = 25;
      startedSeconds = 10;

      int startedTimeInSeconds = (((startedhour * 60) + startedMinute) * 60) + startedSeconds;

      int elapsedTime = (int) (startedTimeInSeconds - (totalSecondsInADay - secondSinceMidnight));
      err.println ("elapsedTime" + elapsedTime);

  }
}
