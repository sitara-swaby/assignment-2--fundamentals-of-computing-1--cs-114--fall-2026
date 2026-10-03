public class Program3_TheTwelveDaysOfChristmas
{
  public static void main(String[] args)
  {
    for (int day = 1; day <=12 ; day++)
    {
      System.out.println("On the ");

      switch(day)
      {
        case 1:
          System.out.print("1st");
          break;

        case 2:
          System.out.print("2nd");
          break;

        case 3:
          System.out.print("3rd");
          break;

        default:
          System.out.print(day + "th");
          break;

        System.out.println(" day of Christmas, my true love sent to me");
      }
    }
  }
}
