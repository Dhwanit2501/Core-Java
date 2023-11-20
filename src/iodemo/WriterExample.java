package iodemo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WriterExample {

	public static void main(String[] args) {

		String content="She Sells Sea Shells in the Sea";
		
		try {
			
		
		Writer w=new FileWriter("c:/demo/data.text");
		w.write(content);
		System.out.println("Data Written to File");
		w.close();
		}
		catch(IOException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		
		}

}
