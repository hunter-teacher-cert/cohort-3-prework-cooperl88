import java.io.*; //boilerplate, imports java utils
import java.util.*;
import java.util.Scanner;

public class Guess{
  public static void main(String[] args){
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    
    System.out.print("Welcome to the number guessing game!");
    System.out.print("I'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?\n");

    int guess;
    Scanner in = new Scanner(System.in);
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.print("Your guess is: " + guess + "\n");
    System.out.print("I was thinking of the number: " + randomNumber + "\n");
    int offCalculation = Math.abs(randomNumber - guess); //Using Math.abs to make all values positive ints
    System.out.print("You are off by: " + offCalculation + "," + " nice try though!");
    
  }
}