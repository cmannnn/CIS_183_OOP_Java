import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      VendingMachine vendingStatus = new VendingMachine();
      
      int userDrinks = scnr.nextInt();
      int userBottles = scnr.nextInt();
      
      vendingStatus.purchase(userDrinks);
      vendingStatus.restock(userBottles);
      
      vendingStatus.report();
   }
}
