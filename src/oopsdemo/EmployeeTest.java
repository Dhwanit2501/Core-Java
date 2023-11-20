package oopsdemo;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();

		
		e1.inputEmployeeDet();
		e1.calculateNetSalary();
		e1.dispEmployeeDetails();
		
		e2.inputEmployeeDet();
		e2.calculateNetSalary();
		e2.dispEmployeeDetails();
		
		e3.inputEmployeeDet();
		e3.calculateNetSalary();
		e3.dispEmployeeDetails();
	}

}
