public class Problem1
{
    public static void main(String[] args)
  {
    int x = 5;
   System.out.println("Initial value is " + x);
   int counter = 0;
   while (counter<4) {
    x++;
    counter++;
    System.out.println("Value is now " + x);
   }
   System.out.println("4 changes reached, beginning reversion");
   while (counter>0) {
    x--;
    counter--;
    System.out.println("Value is now " + x);
  }
}
}