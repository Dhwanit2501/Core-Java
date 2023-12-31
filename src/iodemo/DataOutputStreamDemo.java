package iodemo;
import java.io.*;
public class DataOutputStreamDemo {

	public static void main(String[] args) {

		try {
			FileOutputStream fos= new FileOutputStream("c:/demo/file.txt");
			DataOutputStream dout=new DataOutputStream(fos);
			
			dout.writeDouble(2000.25);
			dout.writeInt(50);
			dout.writeBoolean(true);
			dout.writeChar('D');
			System.out.println("Written");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis= new FileInputStream("c:/demo/file.txt");
			DataInputStream din=new DataInputStream(fis);
			
			double a= din.readDouble();
			int b=din.readInt();
			boolean c=din.readBoolean();
			char d=din.readChar();
			System.out.println("Values :"+a+" "+b+" "+c+" "+d);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
