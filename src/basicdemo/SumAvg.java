package basicdemo;

import java.util.Scanner;

/*
 * to find sum and avg for 3 nos using scanner input
 */
public class SumAvg {

	public static void main(String[] args) {
		
		int a,b,c;
		float avg,marks;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter yr name: ");
		name= s.next();
		System.out.println("Enter yr marks: ");
		marks=s.nextFloat();
		
		System.out.println("Enter 3 nos: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		avg= (float)(a+b+c)/3;
		System.out.println("Sum= "+(a+b+c)+"\n"+"Avg= "+avg);
		System.out.println("Hello "+name+".\nYou scored "+marks+" Marks.");
		s.close();
		

	}

}
