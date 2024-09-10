public class Problem3{
    public static void main(String[] args)
  {
    int dannyDay = 7168; 
    System.out.println("4 digit #: " + dannyDay);
    System.out.println("Here are the digits");
    System.out.println(dannyDay%10);
    System.out.println((dannyDay%100)/10);
    System.out.println(((dannyDay%1000) - (dannyDay%100))/100);
    System.out.println(dannyDay/1000);
}
}
