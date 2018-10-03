import java.util.*;

public class Lab6
{
	public static void main (String[] args)
	{
		double x;
		double y;
		double sum;

		Scanner input = new Scanner(System.in);

		x = 1;
		y = 3;
		sum = 0;
		sum = sum + (x/y);

		while (x < 97 && y < 99)
		{
			x+=2;
			y+=2;
			sum = sum + (x/y);
		}
		System.out.println(sum);
	}
}