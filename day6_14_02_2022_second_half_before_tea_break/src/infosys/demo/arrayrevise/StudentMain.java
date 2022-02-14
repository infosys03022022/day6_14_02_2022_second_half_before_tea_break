package infosys.demo.arrayrevise;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student students[]=new Student[2];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student();
			System.out.println("Enter the roll number");
			students[i].setRoll(scan.nextInt());
			System.out.println("Enter the name");
			students[i].setName(scan.next());
			String subjects[]=new String[3];
			for(int j=0;j<subjects.length;j++)
			{
				System.out.println("Enter the subject");
				subjects[j]=scan.next();
			}// end of loop for subject input
			students[i].setSubjects(subjects);
			int marks[]=new int[3];
			for(int j=0;j<marks.length;j++)
			{
			  System.out.println("Enter the marks for "+subjects[j]);
			  marks[j]=scan.nextInt();
			} // end of loop for marks input
			students[i].setMarks(marks);
		} // end of loop for student details input

		 for(int k=0;k<students.length;k++) {
			 System.out.print(students[k].getRoll()+" "+students[k].getName()+"\n");
			 String subjects[]=students[k].getSubjects();
			 int marks[]=students[k].getMarks();
			 for(int l=0;l<subjects.length;l++)
			 {
				 System.out.println(subjects[l]+"\t"+marks[l]);
			 }// end of loop for subjects and marks display
			 
			 
		 }// end of loop for student display
			 
	
	
	}  // end of method

} // end of class
