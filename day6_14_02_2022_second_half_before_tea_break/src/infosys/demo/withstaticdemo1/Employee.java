package infosys.demo.withstaticdemo1;
// id and name are instance variables
// companyName is a static or class variable
// The entire code is fine because
// non static members can access static members
// but static members cannot access non static member
// without creation of object
// static members can be accessed with the class name
// we dont require objects to access static members
public class Employee {
   private int id;
   private String name;
   public static String companyName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

   
}
