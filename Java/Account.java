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
 *  Problem: The Account Class
 *  Description:
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  Do i really need to put all of the below?
 *
 *  Visible methods:
 *  There is just so many look at it yourself! asking for so much from me!
 *
 *   Remarks
 *   -------
 *************************************************************************/
import java.util.*;
public class Account{
  //Data Fields for those feeling resourceful
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  //Those Constructors because everyone loves them
  Account(){};
  Account(int id,double balance){
    this.id = id;
    this.balance = balance;
    dateCreated = new Date();
  }
  //All of these beautiful Accessor and Mutator methods that everyone loves
  int getID(){
    return id;
  }
  double getBalance(){
    return balance;
  }
  double getAnnualInterestRate(){
    return annualInterestRate;
  }
  void setID(int id){
    this.id = id;
  }
  void setBalance(double balance){
    this.balance = balance;
  }
  void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
  }
  String getDateCreated(){
    return "dateCreated";
  }
  double getMonthlyInterestRate(){
    return annualInterestRate/12;
  }
  double getMonthlyInterest(){
    return balance*(annualInterestRate/12);
  }
  void withdraw(double a){
    this.balance = balance - a;
  }
  void deposit(double a){
    this.balance = balance + a;
  }
  //Print method used to print out what the program wants at the end
  void print(){
    System.out.println("The Balance is "+getBalance());
    System.out.println("The Monthly interest is "+getMonthlyInterest());
    System.out.println("The Account was made on "+dateCreated);
  }
  //Moving onto the the main course
  public static void main(String[] args){
    //importing all of the things
    Scanner input = new Scanner(System.in);
    //Making that object
    Account money = new Account(1122, 20000);
    //setting the interest rate
    money.setAnnualInterestRate(.045);

    //Doing what the program says, withdrawing and and depositing
    money.withdraw(2500);
    money.deposit(3000);

    //invoking that fancy print method from earlier instead of righting S.o.P's
    money.print();
  }
}
