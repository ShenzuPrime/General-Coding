import java.util.*;
public class testGrade
{
  public static void main (String[]args)
  {
    int[] student = new int[20];
    int[] score1 = new int[20];
    int[] score2 = new int[20];
    int[] score3 = new int[20];
    int[]  avg = new int[20];
    int i = 0;

    Scanner input = new Scanner(System.in);

    for (i=0;i<=19;i++)
    {
      student[i] = i+1;
      System.out.println("What are the test scores for student " + student[i] + " (test1, test2, test3)");

      score1[i] = input.nextInt();
      score2[i] = input.nextInt();
      score3[i] = input.nextInt();
      avg[i] = (score1[i]+score2[i]+score3[i])/3;
    }

    System.out.println("");
    System.out.println("Student     Score1     Score2     Score3     Average");

    for (i=0;i<=19;i++)
    {
      System.out.println(student[i]+"             "+score1[i]+"          "+score2[i]+"          "+score3[i]+"          "+avg[i]);
    }
  }
}
