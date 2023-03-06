import java.io.*;
import java.util.*;

public class Beer{
  //prints beer song and subtracts 1 from numberOfBeers when finished
  public static void song(int numberOfBeers){
    System.out.println(numberOfBeers + " bottles of beer on the wall,");
    System.out.println(numberOfBeers + " bottles of beer,");
    System.out.println("Take on down, pass it around,");
    System.out.println(numberOfBeers - 1 + " bottle of beer on the wall\n");
  }
  //recursive method & conditionals to subtract beer amount and finish conditon
  public static void countDown(int beers){
    if(beers == 0){
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    } else{
      song(beers);          // calls the beer song
      countDown(beers - 1); //decrements beers argument
    }
  }
  
  public static void main(String[] args){
    countDown(99);
  }
}