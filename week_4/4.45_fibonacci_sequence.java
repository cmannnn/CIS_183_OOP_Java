import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if (n < 0) {
         return -1;
      }
      if (n < 2) {
         return n; 
      }
      else {
         return fibonacci(n - 1) + fibonacci(n - 2);   
      }   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
