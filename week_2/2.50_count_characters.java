import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char searchChar;
      String userInput;
      int totalCharacters = 0;
      int i;
      
      userInput = scnr.nextLine();
      searchChar = userInput.charAt(0);
      
      for (i = 2; i < userInput.length(); i++) {
         if (userInput.charAt(i) == searchChar) {
            totalCharacters++;
         }
      }
      if (totalCharacters == 1) {
         System.out.println(totalCharacters + " " + searchChar); 
      }
      else {
         System.out.println(totalCharacters + " " + searchChar + "'s");
      }
   }
}
