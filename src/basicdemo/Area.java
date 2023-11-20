package basicdemo;

import java.util.Scanner;
/*
 * Area of circle
 */
public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float r,a;
		final float PI= 3.14f; // const declaration
		System.out.println("Enter radius of a circle: ");
		r=s.nextFloat();
		a=(PI*r*r);
		System.out.println("The Area of a circle is: "+a);
		System.out.format("%.2f",a);
		s.close();


	}

}
