import java.util.*;

public class GradingTest1
{
  public static void main (String[] args)
  {
    int x;
    int y;
    int z;

    Scanner input = new Scanner(System.in);

    x = 1;
    y = 1;
    z = 1;

    while ( (x+y+z) < 999999999)
    {
      x = x+1;
      y = y+2;
      z = z+3;
      System.out.print(x+y+z);
    }
  }
}
