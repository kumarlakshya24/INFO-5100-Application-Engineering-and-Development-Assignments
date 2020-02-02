import java.util.ArrayList;

/**
 * @author Lakshya
 *
 */
public class Course { 
	
	private int numberofStudents = 0;
	int intake = 10;
	private String CourseName;
	private ArrayList<Student> students;

	Course(String name, int no)
	{
		this.students = new ArrayList<Student>();
		this.CourseName = name;
		this.numberofStudents = no;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void registerStudent(Student student) {
			if (!isFull()) {
				students.add(student);
				this.numberofStudents++;
				System.out.println("Course name is "+this.CourseName+" number of students already registered are "+this.numberofStudents+"\n");
			}
		}
	
	public int getnumberofStudentsinCourse() {
		return numberofStudents;
	}
	
	public void getStudents() {
		for(Student s1: students)
		System.out.println(s1.getStudentName()+ " " + s1.getStudentID());
		}
	
	
	public boolean isFull() {
		if (numberofStudents > intake)
		{
			return true;
		}
		
		
		else {
			return false;
		}
	}
}
