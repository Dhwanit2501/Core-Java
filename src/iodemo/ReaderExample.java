package iodemo;
import java.io.*;

public class ReaderExample {

	public static void main(String[] args) {

		try {
			Reader reader=new FileReader("c:/demo/data.text");
			int data=reader.read();
			while(data != -1) {
				System.out.print((char) data);
				data=reader.read();
			}
			reader.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}

}
