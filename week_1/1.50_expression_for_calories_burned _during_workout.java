import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      double age;
      double weight;
      double heartRate;
      double time;
      double womenCalories; // calculating womens calories
      double menCalories;   // calculating mens calories
      
      age = scnr.nextDouble();
      weight = scnr.nextDouble();
      heartRate = scnr.nextDouble();
      time = scnr.nextDouble();

      womenCalories = ((age * 0.074) - (weight * 0.05741) + 
                      (heartRate * 0.4472) - 20.4022) * time / 4.184;
      
      menCalories =   ((age * 0.2017) + (weight * 0.09036) + 
                      (heartRate * 0.6309) - 55.0969) * time / 4.184;
       

      System.out.print("Women: ");
      System.out.printf("%.2f", womenCalories);
      System.out.println(" calories");
      System.out.print("Men: ");
      System.out.printf("%.2f", menCalories);
      System.out.println(" calories");
   }
} 
