import java.util.*;

public class Lab5
{
	public static void main (String[] args)
	{
		int x;

		Scanner input = new Scanner(System.in);

		System.out.println("Please type in an interger");
		x = input.nextInt();
		System.out.println("");

		while (x > 0)
		{	
			x = x/10;
			System.out.println(x);
		}


	}
}