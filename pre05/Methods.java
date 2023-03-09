/**Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.**/

import java.io.*;
import java.util.*;

public class Methods{

  /**Using mod to get a remainder, a remainder indicates indivisble / odd**/
  public static boolean isDivisible(int n, int m){ 
    if(n % m == 0){
      return true;
    } else{
      return false;
    }
  }

/**If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.

Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.**/
  public static boolean isTriangle(int stickOne, int stickTwo, int stickThree){

    if((stickOne + stickTwo) < stickThree){
      System.out.println("case 1");
      return false;
    } else if((stickOne + stickThree) < stickTwo){
      System.out.println("case 2");
      return false;
    } else if((stickTwo + stickThree)  < stickOne){
      System.out.println("case 3");
      return false;
    } else{
      System.out.println("case 4");
      return true;
    }
  }
  

  public static void main(String[] args){
    System.out.println(isDivisible(9, 4)); //must prinln to see returns
    System.out.println(isTriangle(1, 3, 1));
  }
}

