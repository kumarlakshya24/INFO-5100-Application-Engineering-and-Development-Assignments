import java.util.*; 
/**
 * @author Lakshya
 *
 */
public class Course { 
	
	private int numberofStudents;
	private String CourseName;
	String students[] = new String[9];
	Scanner sc = new Scanner(System.in);
	String course[] = new String[4];
	
	Course(String name, int no)
	{
		this.CourseName = name;
		this.numberofStudents = no;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String newCourseName) {
		this.CourseName = newCourseName;
	}
	
	public void addCourse() {
		for (int i = 0; i<course.length; i++)
		{
			course[i] = sc.next();
		}
		
	}
	
	public void registerStudent(String student) {
		for (String strTemp:students) {
			System.out.println(strTemp);
		}
			
	}
	
	public int getnumberofStudentsinCourse() {
		return numberofStudents;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public boolean isFull() {
		if (students.length == 10)
		{
			return true;
			System.out.println("Course name is"+getCourseName()+"Number of Students already registered are"+getnumberofStudentsinCourse());
		}
		else {
			return false;
			System.out.println("Course"+getCourseName()+" is full");
		}
	}
}
