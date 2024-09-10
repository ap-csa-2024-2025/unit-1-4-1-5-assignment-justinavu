public class Problem0
{
    public static void main(String[] args)
  {
    double x = 0.0;
    double x2 = 1.5;
    int y = 2;
    x = y;
    y = (int) x2; // y = x2 is an error, can't store double in int, convert double to int
    System.out.println("x: " + x + " y: " + y);
  }
}
// Int -> Double works (double can just make an int value into an int.0), but Double -> Int does not work (int cannot store the decimal value), but you can convert to an int first 
