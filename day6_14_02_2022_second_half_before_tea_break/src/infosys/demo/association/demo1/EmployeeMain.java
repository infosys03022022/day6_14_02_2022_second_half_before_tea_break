package infosys.demo.association.demo1;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Employee emp=new Employee();
		Address address=new Address();
		System.out.println("Enter the emp id");
		emp.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter the employee's name");
		emp.setName(scan.nextLine());
		System.out.println("Enter the details for the address");
		System.out.println("Enter the house number");
		address.setHno(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter the locality name");
		address.setLocality(scan.nextLine());
	    System.out.println("Enter the city name");
	    address.setCity(scan.next());
	    scan.nextLine();
		System.out.println("Enter the state ");
		address.setState(scan.nextLine());
		emp.setAdress(address);
		System.out.println("The details are");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		address=emp.getAdress();
		System.out.println(address.getHno());
		System.out.println(address.getLocality());
		System.out.println(address.getCity());
		System.out.println(address.getState());
	

	}

}
