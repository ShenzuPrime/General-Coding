import java.util.*;

public class Lab8
{
  public static void main (String[] args)
  {
    int x;
    int y;

    Scanner input = new Scanner(System.in);

    for (x=1;x<=5;x++)
    {
      for (y=1;y<=x;y++)
      System.out.print(y);
      System.out.println();
    }
  }
}
