import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int change;
      
      change = scnr.nextInt();
      
      if (change == 0) {
         System.out.println("No change");
      }
      
      int dollars = Math.round(change / 100);
      change = change % 100;
      
      int quarters = Math.round(change / 25);
      change = change % 25;
      
      int dimes = Math.round(change / 10);
      change = change % 10;
      
      int nickels = Math.round(change / 5);
      change = change % 5;
      
      int pennies = Math.round(change / 1);
      
      if (dollars != 0) {
         if (dollars > 1) {
            System.out.println(dollars + " Dollars");
         }
         else {
            System.out.println(dollars + " Dollar");
         }
      }
      
      if (quarters != 0) {  
         if (quarters > 1) {
            System.out.println(quarters + " Quarters");
         }
         else {
            System.out.println(quarters + " Quarter");
         }
      }
   
      if (dimes != 0) {
         if (dimes > 1) {
            System.out.println(dimes + " Dimes");
         }
         else {
            System.out.println(dimes + " Dime");  
         }
      }
         
      if (nickels != 0) {
         if (nickels > 1) {
            System.out.println(nickels + " Nickels");
         }
         else {
            System.out.println(nickels + " Nickel");
         }
      }
      
      if (pennies != 0) {
         if (pennies > 1) {
            System.out.println(pennies + " Pennies");
         }
         else {
            System.out.println(pennies + " Penny");  
         }
      }
   }
}
