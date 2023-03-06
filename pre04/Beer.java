import java.io.*;
import java.util.*;

public class Beer{

  public static void song(string verse){
    System.out.println("x bottle of beer on the wall");
    System.out.println("x bottles of beer");
    System.out.println("Take on down, pass it around");
    System.out.println("x bottle of beer on the wall");
  }
  public static void countDown(int beers){
    if(beers == 0){
      System.out.println("NO beer left");
    } else{
      //countDown(beers - 1); //why is this increasing count not decreasing?
      System.out.println(beers);
    }
  }
  
  public static void main(String[] args){
    countDown(99);
  }
}