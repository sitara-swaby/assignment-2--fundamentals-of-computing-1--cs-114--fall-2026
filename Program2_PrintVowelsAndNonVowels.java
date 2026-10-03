import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels
 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int letterA = 0;
    int letterE = 0;
    int letterI = 0;
    int letterO = 0;
    int letterU = 0;
    int otherLetters = 0;

    System.out.print("Enter a string of letters: ");
    String letter = scanner.nextLine();

    for (int i = 0; i < letter.length(); i++)
    {
      char ch = letter.charAt(i);

      if (ch == 'a' || ch == 'A')
      {
        letterA++;
      }
      else if (ch == 'e' || ch == 'E')
      {
        letterE++;
      }
      else if (ch == 'i' || ch == 'I')
      {
        letterI++;
      }
      else if (ch == 'o' || ch == 'O')
      {
        letterO++;
      }
      else if (ch == 'u' || ch == 'U')
      {
        letterU++;
      }
      else
      {
        otherLetters++;
      }
    }

    System.out.println("number of A's: " + letterA);
    System.out.println("number of E's: " + letterE);
    System.out.println("number of I's: " + letterI);
    System.out.println("number of O's: " + letterO);
    System.out.println("number of U's: " + letterU);
    System.out.println("number of other letters: " + otherLetters);

  }
}
