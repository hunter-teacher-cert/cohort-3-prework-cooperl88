import java.io.*; //boilerplate, imports java utils
import java.util.*;

public class Date{
  public static void main(String[] args){
    String day = "Monday";
    String month = "June";
    int year = 2020;
    int date = 15;
    //Display variables and American / European Date Formats
    System.out.print("The year is: " + year + ".\n");
    System.out.print("The month is: " + month + ".\n");
    System.out.print("The day of the week is: " + day + ".\n");
    System.out.print("The day of the month is the: " + date + "th" + ".\n");
    System.out.print("American Date Format: " + day + ", " + month + " " + date + "," + " " + year + "\n");
    System.out.print("European Date Format: " + day + ", " + date + " " + month + "," + " " + year);
  }
}


