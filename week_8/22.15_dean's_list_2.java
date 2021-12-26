import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects
	private ArrayList<Student> studentList;

	public Course() {
		roster = new ArrayList<Student>();
		studentList = new ArrayList<Student>();
	}

	public ArrayList<Student> getDeansList() {
		/* Type your code here */
	   
		
		for (int i = 0; i < roster.size(); ++i) {
		   Student s = roster.get(i);
		
		   if (s.getGPA() >= 3.5) {
		      studentList.add(s);
		      //return roster;
		   }
		   
		}
	return studentList;
	}
	
	//System.out.println(roster);
	//return ArrayList<Student> roster;
   //ArrayList<Student> roster = 
   
   
	public void addStudent(Student s) {
		roster.add(s);
	}
	
}
