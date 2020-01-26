/**
 * @author Lakshya
 *
 */
public class Employee{
		
		 private String name;
		 private int employeeID;
		 private int age;
		 double salary;
				
	Employee(String name, int empid, int age, double sal)
		{
			this.name = name;
			this.employeeID =empid;
			this.age = age;
			this.salary = sal;
		}
		
		public int getemployeeID(){
			return employeeID;
		}	
		
		public int getage() {
			return age;
		}
		
		public String getname(){
			return name;
		}
		
		public double getsalary(){
			return salary;
		}
		
	}
