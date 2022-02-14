package infosys.demo.withstaticdemo3;

import java.util.Scanner;

public class EmployeeMain {

	// We need to store the details of two employees who are from infosys
	public static void main(String[] args) {
		   
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int numberOfEmployees=scan.nextInt();
		
		Employee employee[]=new Employee[numberOfEmployees];
        for(int i=0;i<employee.length;i++)
        {   employee[i]=new Employee();
        	System.out.println("Enter the id for the employee");
        	employee[i].setId(scan.nextInt());
        	System.out.println("Enter the name of the employee");
        	employee[i].setName(scan.next());
         }
        
        // Can we initialise the static method within the class Employee?
        // ans Yes with the help of static block 
        // static {
        
	//}
	      // We are accessing static member with
        // static method
        for(Employee emp : employee)
        {
        	System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+Employee.getCompanyName());
        }

	}

}
