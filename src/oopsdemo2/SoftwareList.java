package oopsdemo2;

import com.ey.training.oracle.*;
import com.ey.training.microsoft.*;
public class SoftwareList {

	public static void main(String[] args) {

		OperatingSystem os1=new OperatingSystem();
		os1.listSoftware();
		System.out.println("\n");
		Database d1 = new Database();
		d1.printSoftware();
	}

}
