/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators: None
   References: Java API

   Homework: 01
   Problem: 4,5,6
   Description: Homework 1 to answear questions 4a,4b,5,6

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:


   Visible methods:
   distance(int i, int j, int[] a)


    Remarks
    -------
    5. The worst case running time of Big-O of my distance method is 0(N) so there is only 1 variable being the loop.

    6. In the Distance method there is an intializon of sum which takes 1 operation, a loop which takes N amount of operations until completed with only one operation inside of the loop and then a return function which is one operation.
    In the main method there are a total of 7 basic operations ( assigning variables and printing out messages and 1 loop with N amount of iterations only doing 1 operation of assigning variables to places in the array.)




  *************************************************************************/
  import java.util.*;
  public class Highway{
    //Distance method to determine distance from I to J using the array
    public static int distance(int i, int j, int[] a){
      //int sum will hold the total distance
      int sum = 0;
      //Loop without intilization because dont need one. Maybe a while loop could be better but eh
      for (; i < j; i++){
        sum += a[i];
      }
      return sum;
    }
    //Main method to ask user how many exits and which to exits to find the distance inbetween
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Asks user how many exits then generates an array and the distance of those exits using random numbers
      System.out.print("How many exits are there on the highway?:");
      int q = input.nextInt();
      int[] a = new int[q];
      for (int x = 0; x < a.length; x++){
        a[x] = (int)(Math.random()*11);
      }
      //Prompts the user to give start and end exits for the highway
      System.out.println("At which exit would you like to begin?: ");
      int i = input.nextInt();
      System.out.println("At which exit would you like to end?: ");
      int j = input.nextInt();
      //Shove it all in the method and magically pops out numbers.
      System.out.println("The distance in miles between exit "+i+" and exit "+j+" is "+ distance(i,j,a) +" miles.");
    }
  }
