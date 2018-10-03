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
 *  Problem: Check Password
 *  Description: Write a program that prompts the user to enter a password
 *  and displays Valid Password if the rules are followed or Invalid Password
 *  otherwise.
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *
 *  Visible methods:
 *  public static boolean checkAll(String input)
 *  public static boolean check1(String input)
 *  public static boolean check2(String input)
 *  public static boolean check3(String input)
 *
 *   Remarks
 *   -------
 *************************************************************************/
import java.util.*;
public class CheckPassword{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    //Inform of the rules and ask for a password
    System.out.println("Please enter a password that:");
    System.out.println("~ Is at least 8 characters long.");
    System.out.println("~ Consists of only letters and numbers.");
    System.out.println("~ Contains at least 2 digits.");
    System.out.println("Please enter a password now:");
    String password = input.nextLine();

    //check to see if password meets criteria
    if (checkAll(password) == true){
      System.out.println("The password is valid.");
    }
    else System.out.println("The password is invalid");

  }
  //combines all the rule checks into one to save space when calling the methods
  public static boolean checkAll(String input){
    if(check1(input) == true && check2(input) == true && check3(input) == true)
      return true;
    else return false;
  }
  //checks to see if greater or equal to 8
  public static boolean check1(String input){
    if(input.length() >= 8) return true;
    else return false;
  }
  //checks to see if 2 digits are used
  public static boolean check2(String input){
    int count = 0;
    for(int i=0; i<input.length(); i++){
      if(Character.isDigit(input.charAt(i)) == true) count++;
    }
    if(count >= 2) return true;
    else return false;
  }
  //checks to see if only numbers and letters are used
  public static boolean check3(String input){
    for(int i=0; i<input.length(); i++){
			if(Character.isLetterOrDigit(input.charAt(i)) == false) return false;

    }
    return true;
  }
}
