import java.io.*; //boilerplate, imports java utils
import java.util.*;
import java.util.Scanner;

public class Celsius{
  public static void main(String[] args){
    double celsius;
    Scanner in = new Scanner(System.in); //create new scanner variable
    System.out.print("Celsius Value: "); //Prompt for value
    celsius = in.nextDouble(); //method that stores the value from the prompt
    double celsiusToFarenheit = (celsius * 9/5) + 32;
    System.out.printf("Your Celsius Temperature in Fahrenheit is: %.1f", celsiusToFarenheit); //uses format string to set decimal for float
  }
}