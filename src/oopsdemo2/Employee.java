package oopsdemo2;

public class Employee {
	
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	void display() {
		System.out.println("----- Emp Details -----");
		System.out.println("Employee id : "+empId);
		System.out.println("Employee Name : "+name);
	}
}
