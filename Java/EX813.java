/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Computer Organization and Programming
 *
 *  Course: CPS 2231-02
 *  Author: Ian Brugal
 *  References: Intro To Java, http://www.tutorialspoint.com/java/number_parseint.htm
 *
 *  Problem: 8.13
 *  Description: (Locate the largest element) Write the following method that returns the location
 *  of the largest element in a two-dimensional array.
 *  public static int[] locateLargest(double[][] a)
 *  The return value is a one-dimensional array that contains two elements. These
 *  two elements indicate the row and column indices of the largest element in the
 *  two-dimensional array. Write a test program that prompts the user to enter a twodimensional
 *  array and displays the location of the largest element in the array.
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  public static void main(String[] args)
 *  public static int[] locateLargest(double[][] a)
 *
 *   Remarks
 *   -------
 *  I researched on how to make the formatting closer to how it was in the book example.
 *  I came upon http://www.tutorialspoint.com/java/number_parseint.htm with such efforts
 *  and used the String to Int/Double conversion within the code I also looked up the String split.
 *************************************************************************/
import java.util.*;
public class EX813{
  public static int[] locateLargest(double[][] a){
    int x;
    int y;
    double biggestNumber = 0;
    int[] largestPoint = new int[2];

    //Searches the Array for a number greater than the previous biggest number and then replaces it if found
    // Also saves the position if a number is found that is bigger
    for (x = 0; x < a.length; x++){
      for (y = 0; y < a[x].length; y++){
        if (biggestNumber < a[x][y]){
          biggestNumber = a[x][y];
          largestPoint[0] = x;
          largestPoint[1] = y;
        }
      }
    }
    return largestPoint;
  }
  public static void main(String[] args){
    int i;
    int j;
    int size1;
    int size2;

    Scanner input = new Scanner(System.in);

    //User enters the size of the array
    System.out.print("Please enter the number of rows and columns: ");
    String sizeA = input.nextLine();

    //The numbers get converted into integers and make the array
    String[] sizeB = sizeA.split(" ");
    size1 = Integer.parseInt(sizeB[0]);
    size2 = Integer.parseInt(sizeB[1]);
    double[][] userArray = new double[size1][size2];

    //User enters in the desired array row by row, its a string then gets converted into double
    System.out.println("Please enter the array, enter the first row and then press the 'enter' key to move onto the following row:");
    for (i = 0; i < userArray.length; i++){
      sizeA = input.nextLine();
      sizeB = sizeA.split(" ");
      for (j =0; j < userArray[i].length; j++){
        userArray[i][j] = Double.parseDouble(sizeB[j]);
      }
    }

    //Call upon the method to find the largest double then returns the x,y cords and puts it into an array
    int[] location = locateLargest(userArray);
    System.out.println("The Location of the largest element is at: ("+location[0]+", "+location[1]+")");
  }
}
