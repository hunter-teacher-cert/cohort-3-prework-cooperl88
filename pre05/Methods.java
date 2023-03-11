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
    if((stickOne + stickTwo) <= stickThree){
      return false;
    } else if((stickOne + stickThree) <= stickTwo){
      System.out.println("case 2");
      return false;
    } else if((stickTwo + stickThree)  <= stickOne){
      return false;
    } else{
      return true;
    }
  }

  /**The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:

  Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).**/

  /**public static double ack(int n, int m){
    if(m > 0 && n > 0){
      A(m, n) = A(m - 1, A(m, n-1))
    }
    
  }
  

  public static void main(String[] args){
    System.out.println(isDivisible(8, 4)); //must prinln to see returns
    System.out.println(isTriangle(1, 1, 1));
  }
}**/

