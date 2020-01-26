/**
 * @author Lakshya
 *
 */
public class Assignment2{
	 /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
	public double socialSecurityTax(Employee employee) 
	
	{
		double socialSecurityTax = 0;
		if (employee.getsalary() <= 8900)
		{
			socialSecurityTax = 0.062 * employee.getsalary();
		}
		else if (employee.getsalary() > 8900)
		{ 
			socialSecurityTax = 0.062 * 106800;
		}
		return socialSecurityTax;
		
	}
	/**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
	public static double insuranceCoverage(Employee employee) {
        double contribution = 0;
        if (employee.getage() < 35)
        {
        	contribution = 0.03 * employee.salary;
        }
        if (employee.getage() > 35 && employee.getage() <= 50)
        {
        	contribution = 0.04 * employee.getsalary();
        }
        if (employee.getage() > 50 && employee.getage() <= 60)
        {
        	contribution = 0.05 * employee.getsalary();
        }
        else 
        {
        	contribution = 0.06 * employee.getsalary();
        }
        return contribution;
		
    }
	/**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
	public void sortSalary(Employee e1, Employee e2, Employee e3) {
		Employee employee;
		Employee emp[] = new Employee[3];
		int len = 0, j = 0, k = 0;
		len = emp.length;
		e1 = emp[0];
		e2 = emp[1];
		e3 = emp[3];	
		for (j = 0; j < len - 1; j++)
		{
			for (k = j+1; k < len; k++)
			{
				if (emp[j].getsalary() > emp[k].getsalary())
				{
					employee = emp[j];
					emp[j] = emp[k];
					emp[k] = employee;
				}
			}
		 
		}
		
		for (int l = 0; l< len; k++)
		{
			System.out.println(emp[l].getname());
		}
	}
	
	//Extra credit
	

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer:

     In this case, the actual object is not passed as an argument rather the value of the pointer is being passed in. 
     The swap function is actually working with a copy of reference to the employee object and not the copy of employee object directly as Java passes object references to methods by value.
     
     Attached a diagram to explain better


    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);//
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }


    public static void swap(Employee x, Employee y) {
        Employee temp = x;						temp = 10; x = 10; y = 20
        x = y;									temp = 10; x = 20; y = 20
        y = temp;								temp = 10; x = 10; y = 10
    }
}
