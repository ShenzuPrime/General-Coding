import java.util.*;
public class Lab12
{

public static void main(String[] args)
  {
    int x;
    System.out.println("x     f(x)");
    for(x=1;x<=10;x++)
    {
      System.out.println(x+"      "+f(x));
    }
  }
public static int f(int x)
  {
    return (x*x)-16;
  }
}
