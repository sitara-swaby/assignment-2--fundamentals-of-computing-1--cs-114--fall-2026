public class Program1_CountFlips
{
  public static void main(String[] args)
  {
    Coin coin = new Coin();

    int heads = 0;
    int tails = 0;

    for (int i = 0; i < 100; i++)
    {
      coin.flip();
      if (coin.isHeads())
      {
        heads++;
      }
      else
      {
        tails++;
      }
    }
    System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
  }
}
