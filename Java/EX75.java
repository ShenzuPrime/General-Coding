/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Computer Organization and Programming
 *
 *  Course: CPS 2231-02
 *  Author: Ian Brugal
 *  References: Intro To Java
 *
 *  Problem: 7.5
 *  Description: Write a program that reads in ten numbers and displays
 *  distinct numbers (i.e., if a number appears multiple times, it is displayed only
 *  once).
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  public static void main(String[] args)
 *  public static boolean linearSearch(int[] a, int key)
 *
 *   Remarks
 *   -------
 *
 *  PUT ALL NON-PROGRAMMING ANSWERS HERE
 *
 *************************************************************************/
import java.util.*;
public class EX75{
  public static void main(String[] args){
    int[] numbers = new int[10];
    int i;
    int x;
    int count = 0;

    Scanner input = new Scanner(System.in);

    //Prompts user to input 10 numbers
    System.out.println("Please input 10 numbers");
    for (i = 0;i < 10; i++){
      x = input.nextInt();
      /* Searches the array if the number is inside the array
         if not then puts the numberin the array */
      if (linearSearch(numbers,x,count) == false){
        numbers[count] = x;
        count++;
      }
    }
    System.out.println("There are "+count+" distinct numbers");
    System.out.print("The distinct numbers are: ");
    for (i = 0; i < count; i++){
      System.out.print(numbers[i]+" ");
    }
    System.out.println();
  }
  /* Search method used to see if a number was already used*/
  public static boolean linearSearch(int[] a, int key, int count){
    for (int i = 0; i < count; i++){
      if (a[i] == key) return true;
    }
    return false;
  }
}
