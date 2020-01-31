/**
 * @author Lakshya
 *
 */
public class Student extends Course{
	private String name;
	private int studentID;
	
	Student(String name, int id)
	{
		super(name, id);
		this.name = name;
		this.studentID = id;		
	}
	
	public String getStudentName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentName(String newName) {
		this.name =  newName;
	}
	
	public void setStudentID(int newStudentID) {
		this.studentID = newStudentID;
	}
		
}
