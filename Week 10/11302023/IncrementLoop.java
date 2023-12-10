import java.util.*;

public class IncrementLoop {
   public static void main(String[] args) {
      int[] values = { 16, 12, 10, 5, 32, 0 };

      for (int i : values) {
         i++;
         System.out.println("New val: " + i);
      }

      System.out.println("Array after the loop: ");
      for (int v : values) {
         System.out.print(v + 1 + " ");
      }
   }
}