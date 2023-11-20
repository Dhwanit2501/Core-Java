package basicdemo;

import java.util.Scanner;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
System.out.println("*******************************************");
		
		int n,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2nd Array Size : ");
		n=s.nextInt();
		
		int num1[] =new int[n] ; // declare array & allocate memory
		
		System.out.println("Enter Array Elements :");
		for(j=0;j<n;j++)
		{
			num1[j]=s.nextInt();
		}
		

		System.out.println("********** 2nd Array Contents **********");
		for(j=0;j<num1.length;j++)
		{
			System.out.print(num1[j]+ " ");
		}
		System.out.println();
		System.out.println("Display Array contents Without Loop :");
		System.out.println(Arrays.toString(num1));

	}

}
