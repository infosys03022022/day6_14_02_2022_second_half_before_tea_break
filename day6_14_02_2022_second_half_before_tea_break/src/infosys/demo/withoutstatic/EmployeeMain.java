package infosys.demo.withoutstatic;

import java.util.Scanner;

public class EmployeeMain {

	// We need to store the details of two employees who are from infosys
	public static void main(String[] args) {
		   
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int numberOfEmployees=scan.nextInt();
		// In the below line , we are creating an array of reference variables
		// This step is similar to the step when we create reference variable
		// for single object
		// Employee employee=null;
		// So in the above line we created a reference which is currently not
		// pointing to any object
		Employee employee[]=new Employee[numberOfEmployees];
        for(int i=0;i<employee.length;i++)
        {   employee[i]=new Employee();
        	System.out.println("Enter the id for the employee");
        	employee[i].setId(scan.nextInt());
        	System.out.println("Enter the name of the employee");
        	employee[i].setName(scan.next());
        	System.out.println("Enter the name of the company");
        	employee[i].setCompanyName(scan.next());
        }
	
        for(Employee emp : employee)
        {
        	System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getCompanyName());
        }

	}

}
