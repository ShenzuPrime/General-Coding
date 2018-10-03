import java.util.*;

public class Lab7
{
  public static void main (String[] args)
  {
    int x;
    int y;

    Scanner input = new Scanner(System.in);

    for (x=5;x>=1;x--)
    {
      for (y=1;y<=x;y++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
