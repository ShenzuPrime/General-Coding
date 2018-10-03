import java.util.*;

public class Lab4
{
	public static void main (String[] args)
	{
		//Stating all of the Variables which the program will use 
		double pounds1;
		double pounds2;
		double ounces1;
		double ounces2;
		double price1;
		double price2;
		double quarts1;
		double quarts2;
		double netWeight1;
		double netWeight2;
		double pricePerWeight1;
		double pricePerWeight2;
		int type;

		Scanner input = new Scanner(System.in);

		//Prompts the user wether he wants to do a type 1 or type 2 comparison
		System.out.println();
		System.out.println("This program compares the price of two items to tell Best Value");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Compare the price of two items:");
		System.out.println("Type 1 Dry packages in Pounds and Ounces");
		System.out.println("Type 2 Liquid containers in Quarts and Ounces");
		System.out.println("---------------------------------------------------------------");
		System.out.println("What package type do you want?");
		type = input.nextInt();
			
			
				//If input for type is 1, It will progress to this part of the code and compare Pounds and Ounces
				if (type == 1)
				{
					//Prompts user for weights of the first item
					System.out.println("What Weight is the first package in pounds and ounces?");
					pounds1 = input.nextDouble();
					ounces1 = input.nextDouble();

					//Prompts user for price of the first item
					System.out.println("What is the price of the first package?");
					price1 = input.nextDouble();

					//Prompts user for weights of the second item
					System.out.println("What Weight is the second package in pounds and ounces?");
					pounds2 = input.nextDouble();
					ounces2 = input.nextDouble();

					//Prompts user for price of the second item
					System.out.println("What is the price of the second package?");
					price2 = input.nextDouble();

					//Converts the pounds and ounces into only ounces
					netWeight1 = ((pounds1*16) + ounces1);
					netWeight2 = ((pounds2*16) + ounces2);

					//Determines the price per ounce of the items
					pricePerWeight1 = price1/netWeight1;
					pricePerWeight2 = price2/netWeight2;

					//Figures out which item is less costly per ounce and then prompts the user with a message. If both prices are equal will tell the user they are equal
					if (pricePerWeight1 < pricePerWeight2)
					
						System.out.println("Item1 is a better purchase at $" + pricePerWeight1 + " per ounce compared to Item2 at $" + pricePerWeight2 + " per ounce");
					
					else if (pricePerWeight2 < pricePerWeight1)

						System.out.println("Item2 is a better purchase at $" + pricePerWeight2 + " per ounce compared to Item1 at $" + pricePerWeight1 + " per ounce");

					else

						System.out.println("Both items are the same price per ounce, choose which ever you like");
				}

				//If input for type is 2, It will progress to this part of the code and compare Quarts and Ounces
				else if (type == 2)
				{
					//Prompts user for weights of the first item
					System.out.println("What Weight is the first package in quarts and ounces?");
					quarts1 = input.nextDouble();
					ounces1 = input.nextDouble();
					
					//Prompts user for price of the first item4
					System.out.println("What is the price of the first package?");
					price1 = input.nextDouble();

					//Prompts user for weights of the second item
					System.out.println("What Weight is the second package in quarts and ounces?");
					quarts2 = input.nextDouble();
					ounces2 = input.nextDouble();

					//Prompts user for price of the second item
					System.out.println("What is the price of the second package?");
					price2 = input.nextDouble();

					//Converts the quarts and ounces into only ounces
					netWeight1 = ((quarts1*32) + ounces1);
					netWeight2 = ((quarts2*32) + ounces2);

					//Determines the price per ounce of the items
					pricePerWeight1 = price1/netWeight1;
					pricePerWeight2 = price2/netWeight2;

					//Figures out which item is less costly per ounce and then prompts the user with a message. If both prices are equal will tell the user they are equal
					if (pricePerWeight1 < pricePerWeight2)
					
						System.out.println("Item1 is a better purchase at $" + pricePerWeight1 + " per ounce compared to Item2 at $" + pricePerWeight2 + " per ounce");
					
					else if (pricePerWeight2 > pricePerWeight1)

						System.out.println("Item2 is a better purchase at $" + pricePerWeight2 + " per ounce compared to Item1 at $" + pricePerWeight1 + " per ounce");

					else

						System.out.println("Both items are the same price per ounce, choose which ever you like");
				}


				//If the user enters the wrong number for type, will tell them they committed an error and end program
				else
					System.out.println("Error, incorrect choice");

	}
}