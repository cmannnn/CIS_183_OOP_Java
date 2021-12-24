import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
   public static void printNumPattern(int num1, int num2) {
      System.out.print(num1 + " ");
      if (num1 <= 0) {
         return;
      }
      else {
         printNumPattern(num1 - num2, num2);
      }
      
      System.out.print(num1 + " ");
  }
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 
