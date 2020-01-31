/*1. (score: 5) Design a simple registration system that allows Student to register in a
course using 2 classes: class Student & class Course. Implement the scenarios in class
Test’s main method.
Each student has a name and an id variable. Each object of class Student is initialized
using values of name and id passed to constructor. Class Student has accessor methods
for its instance variables.
Each Course has a name, and a variable numberOfStudent representing the number of
registered students. A course can have a maximum number of 10 students registered in
it. Class Course store the registered students in students which is an array of type
Student.
When a student register in a course, he is added to the array. Each object of class Course
is initialized using the title.
Class Course has the following methods:
method getStudents(): return the array of registered students;
method boolean isFull(): return true if the course is full, accessor method for the title
and numberOfStudent field;
method registerStudent (Student student): if the course is not full, register a student in
course.*/

/**
 * @author Lakshya
 *
 */
import java.util.*;
public class Test extends Student{
	
	Test(String name, int id) {
		super(name, id);
	}
	
	public void Start() {
			System.out.println("1. Add a Student");
			System.out.println("2. Add a Course");
			System.out.println("3. Register Student for a Course");
			System.out.println("4. View Student enrollment status");
			System.out.print("Enter the number of preference: ");
			Scanner sc = new Scanner(System.in);
			String s  = sc.nextLine();
			switch (s) {
			case "1":
				addStudent();
				break;
			case "2":
				addCourse();
				break;
			case "3":
				Student student;
				registerStudent(student);
				break;
			case "4":
				viewStudentStatus();
				break;
			default:
				break;
			}
		}
	}

	
	public void addStudent() {
	System.out.println("Enter the Name of the Student");
	Scanner sc = new Scanner(System.in);
	String stud = sc.next();
	setStudentName(stud);
	}

	public static void main(String[] args) {
		System.out.println("Course 1: ");
		Scanner sc = new Scanner(System.in);
		int size = 0;
		size = sc.nextInt();
		sc.close();
		System.out.println(""+size);
		}

}
