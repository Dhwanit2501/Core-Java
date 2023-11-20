package basicdemo;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		String c;

			Scanner scan=new Scanner(System.in);
			
					
			System.out.println("Enter 2 NUmbers :");
			a=scan.nextInt();
			b=scan.nextInt();
		c=(a>b)?a+" is greater":b+" is greater";
		System.out.println(c);
		/*if(a>b) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(b+" is greater");
		}*/

	}

}
