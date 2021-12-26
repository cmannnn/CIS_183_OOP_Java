import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

/*Hint: Format the exception outputs using the getMessage() 
method from the exception object. Do not hard code the exception messages.
*/

		index = scnr.nextInt();
      try {
         if (index < 0) {
           throw new Exception("Ryley");
         }
         if (index >= 10) {
            throw new Exception("Johnny");
         }
         //if (index == 10) {
         //   System.out.println("Name: " + "Johnny"); 
         //}
         else {
            System.out.println("Name: " + names[index]);
         }
      }
      
      
      
      
      catch (Exception excpt) {
         //System.out.println(excpt.getMessage());
         System.out.println("Exception! Index " + index + " out of bounds for length 10");
         System.out.println("The closest name is: " + excpt.getMessage());
      }
   }
}
