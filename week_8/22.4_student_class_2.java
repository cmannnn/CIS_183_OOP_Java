// Simple class to hold student information
 public class Student {
   private String name = "Louie";
   private double gpa = 1.0;
   
   
   // FIXME: define two private member fields
   public Student() {
      this.name = name;
      this.gpa = gpa;
   }
    
   public void setName(String n) {
       //FIXME: assign parameter to instance field  
       name = n;
   }
   
   // FIXME: Add three more methods
   public void setGPA(double g) {
      gpa = g;
   }
   
   public String getName() {
      return name;
   }
   
   public double getGPA() {
      return gpa; 
   }
}
