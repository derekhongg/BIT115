import java.util.Scanner;

public class MethodExample {
   public static void main (String[] args) {
      int x = 0;
      int y = 0;
      add(x, y);
      subtract(x, y);
      multiply(x, y);
   }
   public static void add(int x, int y) {
      System.out.println("Give me two numbers to add together");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();  
      y = in.nextInt();
      System.out.println(x + y);    
   }
   public static void subtract(int x, int y) {
      System.out.println("Give me two numbers to subtract");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();  
      y = in.nextInt();
      System.out.println(x - y);   
   }
   public static void multiply(int x, int y) {
      System.out.println("Give me two numbers to multiply together");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();  
      y = in.nextInt();
      System.out.println(x * y);   
   }
}