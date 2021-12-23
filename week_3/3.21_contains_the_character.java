import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numWords = scnr.nextInt();
      String[] userString = new String[numWords];
      int i;
      int j;
      
      
      for (i = 0; i < userString.length; i++) { //getting the individual words
         userString[i] = scnr.next();
      }
      char checkLetter = scnr.next().charAt(0); //getting the letter to check at the end
      for (i = 0; i < userString.length; i++) { //first loop
         boolean match = false; //boolean match to proceed
         for (j = 0; j < userString[i].length(); j++) { //second loop to check individual characters
            if (userString[i].charAt(j) == checkLetter) { //if so, flip match 
               match = true;
            }
         }
         if (match) {
            System.out.print(userString[i] + ",");
         }
         
      }
   }
}
