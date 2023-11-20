package oopsdemo;

public class BookTest {

	public static void main(String[] args) {

			Book b1= new Book();
			
			b1.setBookId(10);
			b1.setBookName("DSA");
			b1.setPrice(100);
			b1.setPublisher("McGraw");
			
			System.out.println("----- Book Details -----");
			b1.display();
			System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
			System.out.println("Discount Price : "+b1.discountPrice());
	}

}
