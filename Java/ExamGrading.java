import java.util.*;
public class ExamGrading
{
		public static void main (String[] args)
		{
			int score;

			scanner input = new Scanner(System.in);

			System.out.println("");
			System.out.println("What was your score on the exam?");
			score = input.nextInt();

			System.out.println("");
			if (score>=90)
				System.out.println("Your grade is an A");
			else if (score>=80)
				System.out.println("Your grade is an B");
			else if (score>=70)
				System.out.println("Your grade is an C");
			else if (score>=60)
				System.out.println("Your grade is an D");
			else (score<60)
			{	System.out.println("Your grade is an F");
				System.out.println("You need to improve");
			}
		}
}