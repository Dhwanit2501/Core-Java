package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  try {
			  result = a / b;  
				 
				 System.out.println("Result = " + result);
		  }
		  catch(ArithmeticException e) {
			  System.out.println("Divide by zero - Enter non-zero value");
			  System.err.println("Exception Description:"+e.getMessage());
			  System.err.println("Exception Name & Description:"+e.toString());
			  e.printStackTrace();

		  }
		  finally {
				 input.close();
		  }
	}

}
