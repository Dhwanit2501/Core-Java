package basicdemo;

import java.util.Scanner;

public class MulNo {

	public static void main(String[] args) {
		int num,mul,i;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		num=scan.nextInt();
		scan.close();
		
		System.out.println("*********** Multiplication Table : "+num +" **************");
		
		for(i=1;i<=10;i++){
			mul= num*i;
			System.out.println(num+" * "+i+" = "+mul);
		}

	}

}
