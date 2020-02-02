/**
 * @author Lakshya
 *
 */
public class Test{
	public static void main(String[] args) {
		System.out.println("Student registration:\n");  
		Course course = new Course("AED 5100", 0);
		Student s1 = new Student("A", 1);
		Student s2 = new Student("B", 2);
		Student s3 = new Student("C", 3);
		course.registerStudent(s1);
		course.registerStudent(s2);
		course.registerStudent(s3);
		System.out.println("Names of student registered for the course: "+course.getCourseName());
	    course.getStudents();
		}
	}


