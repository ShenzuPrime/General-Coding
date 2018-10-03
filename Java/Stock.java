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
 *  Problem: 9.2 (The Stock Class)
 *  Description:
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *
 *  Visible methods:
 *
 *   Remarks
 *   -------
 *************************************************************************/
public class Stock{
  //declaring data
  String symbol;
  String name;
  double previousClosingPrice;
  double currentPrice;
  //creating the constructor
  Stock(){}
  Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
    this.symbol = symbol;
    this.name = name;
    this.previousClosingPrice = previousClosingPrice;
    this.currentPrice = currentPrice;
  }
  //method to obtain the percent change
  double getChangePercent(){
    return (currentPrice/previousClosingPrice);
  }
  //method to set the new current price
  void setCurrentPrice(double currentPrice){
    this.currentPrice = currentPrice;
  }
  public static void main(String[] args){
    //creating the object
    Stock a = new Stock("ORCL","Oracle Corporation",34.5,0);
    a.setCurrentPrice(34.35);
    //printing the price change perctange
    System.out.println("The price-change perctange for the stock is: "+(a.getChangePercent()*100)+"%");
  }
}
