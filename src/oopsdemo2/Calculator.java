package oopsdemo2;

import java.util.Scanner;

public class Calculator implements IMath {
	
	
	Scanner kb;
	
	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Sub");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Diff of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Mul");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Div");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);		
	}
	
	public static void main (String[] args) {
		Calculator c1=new Calculator();
		System.out.println("******* Calculator Interface *********");
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();

	}
	
}
