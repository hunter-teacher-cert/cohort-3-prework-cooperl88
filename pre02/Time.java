import java.io.*; //boilerplate, imports java utils
import java.util.*;

public class Time{
  public static void main(String[] args){
    int clock = 24;
    int hour =  14;
    int minute = 30;
    int seconds = 25;
    int currentTimeinSeconds = 61200; //5pm
    int timeStarted = 57600; //4pm  
    //Had to convert all calcs to doubles to avoid integer division issues
    double clockSeconds = clock * 3600; //converting clock hours to seconds for calc
    double timeInSeconds = (hour * 3600) + (minute * 60) + seconds;
    double midnightCalc = clockSeconds - timeInSeconds;
    double timeElapsed = (currentTimeinSeconds - timeStarted) / 60;

    //rounded % for clarity
    double timePercentage =  Math.round((timeInSeconds / clockSeconds) * 100);
      
    System.out.print("There are " + midnightCalc + " seconds until midnight.\n");
    System.out.print("Your day is: " + timePercentage + "% " + "over!\n");
    System.out.print("Time Elapsed: " + timeElapsed + " minutes.\n");
  }
}