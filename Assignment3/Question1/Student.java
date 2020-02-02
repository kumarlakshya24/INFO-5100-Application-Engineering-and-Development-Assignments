/**
 * @author Lakshya
 *
 */
public class Student{
	private String name;
	private int studentID;
	
	Student(String name, int id)
	{
		this.name = name;
		this.studentID = id;		
	}
	
	public String getStudentName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}

}
