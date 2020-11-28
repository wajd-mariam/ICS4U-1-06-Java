/*
* Copyright (c) 2020
*
* This program asks user to enter the maximum range of random generated number,
* generates a number between 1 and maximum range and prints it to the user.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/27
*/

// Imports Java Classes:
import java.util.Random;
import java.util.Scanner;

public class RollDice {
  /**
   * This function generates the random number and prints it 
   * out to the user.
   */
  public static void rollDice(int minValue, int maxValue) {
    
    // Generating a random number:
    final int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
    
    // Printing out random generated number:
    System.out.println("The random generated number is " + randomNumber);
  }

  /**
  * This function gets input from the user.
  */
  public static void main(String[] args) {
    final int minValue = 1;
    final int maxValue = 0;
    // Try Catch statement:
    try {
      // User Input:
      // Range Input
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter the maximum range of random generated number: ");
      maxValue = input1.nextInt();
        
      // Error Output:
    } catch (Exception e) {
      System.out.println();
      System.out.println("An error occurred");
    } 
    // Calling rollDice Function:
    rollDice(minValue, maxValue);
  }
}