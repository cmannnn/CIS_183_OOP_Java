import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      String password;
      
      password = scnr.next();
      
      for (i = 0; i < password.length(); ++i) {
         if (Character.isLetter(password.charAt(i))) {
               
               
               password = password.replace("i", "1");
               password = password.replace("a", "@");
               password = password.replace("m", "M");
               password = password.replace("B", "8");
               password = password.replace("s", "$");
         }
      
      }
      System.out.println(password + "!");
   }
}
