import java.util.*;
public class Lab11
{
  public static void main(String[] args)
  {
    int x = 0;
    int[] tempDay = new int[7];
    String[] dayOfWeek = new String[7];
    int avg;
    int highTemp;
    int lowTemp;

    Scanner input = new Scanner(System.in);

    //Naming the Days of the Week
    dayOfWeek[0] = "Monday";
    dayOfWeek[1] = "Tuesday";
    dayOfWeek[2] = "Wednesday";
    dayOfWeek[3] = "Thursday";
    dayOfWeek[4] = "Friday";
    dayOfWeek[5] = "Saturday";
    dayOfWeek[6] = "Sunday";

    for (x=0;x<7;x++)
    {
      System.out.println("What was the temperature on "+dayOfWeek[x]+"?");
      tempDay[x] = input.nextInt();
    }

    avg = (tempDay[0]+tempDay[1]+tempDay[2]+tempDay[3]+tempDay[4]+tempDay[5]+tempDay[6])/7;

    for (x=0;x<7;x++)
    {
      if (tempDay[x] > highTemp)
      highTemp
    }
  }
}
