/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Computer Organization and Programming
 *
 *  Course: CPS 2231-02
 *  Author: Ian Brugal
 *  References: Intro To Java (9th)
 *
 *  Problem: 6.4 (9th)
 *  Description: Write a program that reads an unspecified number of scores and
 *  determines how many scores are above or equal to the average and how many
 *  scores are below the average. Enter a negative number to signify the end of the
 *  input. Assume that the maximum number of scores is 100.
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  COPY SIGNATURE OF VISIBLE METHODS HERE
 *
 *
 *   Remarks
 *   -------
 *
 *  PUT ALL NON-PROGRAMMING ANSWERS HERE
 *
 *************************************************************************/
import java.util.*;
public class Exercise1{
  public static void main(String[]args){
    int[] myArray = new int[100];
    int sum = 0;
    int count = 0;
    int i = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Input 100 numbers please.");
    int item = 0;
    do{
      item = input.nextInt();
      if(item >= 0){
        myArray[count] = item;
        count++;
      }
    }while(item >= 0);

    for(i=0; i<count;i++){
      sum = sum + myArray[i];
    }
    double avg = (double)sum/(double)(count+1);

    int above = 0;
    int below = 0;
    for(i=0;i<count;i++){
      if(myArray[i] >= avg) above++;
      else below++;
    }
    System.out.println("There are "+above+" numbers above or equal to "+avg+" and "+below+" numbers below the "+avg+".");


  }
}
