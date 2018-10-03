import java.util.*;
public class Lab9
{
  public static void main (String[] args)
  {
    int[] grade = new int[100];
    int x;
    int i;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int f = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("How many students are in the class?");
    x = input.nextInt();

    for (i=0;i<x;i++)
    {
      System.out.println("What Grade did student "+(i+1)+" recieve?");
      grade[i] = input.nextInt();

      if (grade[i] >= 90)
      a++;
      else if (grade[i] >= 80)
      b++;
      else if (grade[i] >= 70)
      c++;
      else if (grade[i] >= 60)
      d++;
      else
      f++;
    }
    System.out.println(a+" Students got above a 90");
    System.out.println(b+" Students got above a 80");
    System.out.println(c+" Students got above a 70");
    System.out.println(d+" Students got above a 60");
    System.out.println(f+" Students got below a 60 and need to improve");
  }
}
