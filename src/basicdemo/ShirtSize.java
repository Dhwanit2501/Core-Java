package basicdemo;

import java.util.Scanner;

public class ShirtSize {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Value for N : ");
		n=s.nextInt();
		s.close();
		
		while(i<=n) // 1-5
		{
			sum+=i;
			i++;
		}
		System.out.println("The Sum of Series is : "+sum);

	}

}
