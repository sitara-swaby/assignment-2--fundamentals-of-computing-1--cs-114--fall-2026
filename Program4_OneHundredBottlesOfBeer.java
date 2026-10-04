import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("How many verses would you like to print? (0-100):");
    int songVerses = scan.nextInt();

    while (songVerses < 0 || songVerses > 100)
    {
      System.out.println("Please only enter a number between 0 and 100.");
      songVerses = scan.nextInt();
    }

    for (int bottles = 100; bottles > 100 - songVerses; bottles--)
    {
      System.out.println(bottles + " bottles of beer on the wall");
      System.out.println(bottles + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println((bottles - 1) + " bottles of beer on the wall");
      System.out.println();
    }

  }
}
