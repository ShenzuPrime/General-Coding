/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators: None
   References: Java API

   Homework: 01
   Problem: 1,2,3
   Description: Homework 1 to answear questions 1a,1b,2,3

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:
   COPY DECLARATION OF VISIBLE DATA FIELDS HERE

   Visible methods:
   printFib(int x)

    Remarks
    -------

   2. The worst case running time of Big-O with respect to X in the printFib method would be 0(N)

   3.Within the main method there are 3 basic operations. The introduction of the scanner, the S.o.P to ask the for X and the intialization and asignment of X.
   This should equate to 4 units. Moving on to the method 3 operations occure  which is the assignment of Variables.
   Then we have a do while loop in where there is a basic adding operations and overwriting of variables.
   Also an If statement which houses a a return statement if true and if not true does S.o.P Statement.
   Within the Main 4 Operations Happen, And in the method 3 constant operations occure while N amount of operations occure in the loop until The method is completed.
 *************************************************************************/
import java.util.*;
public class Fibonacci{
  //Method for PrintFib()
  public static void printFib(int x){
    //Variables to hold the total and continue the fibb sequence
    int sum = 0;
    int prev = 0;
    int next = 1;
    //loop to add numbers until the Fibonacci numbers come close to X or becomes X
    do{
      sum = next + prev;
      prev = next;
      next = sum;
      //If sum becomes greater then X cuts the loop and doesnt do anything else
      if (sum > x) return;
      //else prints out the next sum
      System.out.print(sum+" ");
    } while (sum <= x);
  }
  //Main method to obtain X and use printFib()
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Asks the user for the X variable
    System.out.println("Please type in a positive integer value for X");
    int x = input.nextInt();
    //runs the given number into the printFib() method
    printFib(x);

  }
}
