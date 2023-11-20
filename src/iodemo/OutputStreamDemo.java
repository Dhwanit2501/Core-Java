package iodemo;
import java.io.*;
public class OutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/demo/data1.txt");
			String text="Nice";
			
			byte[] myBytes=text.getBytes();
			fos.write(myBytes);
			System.out.println("Written");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
