package exceptiondemo;

public class exceptiondemo {

	public static void main(String[] args) {
		
		String lang[]= {"C","C++","Java","Pearl","Python"};
		String a=null;
		try {
			for(int i=0;i<5;i++) {
				System.out.println(lang[i]);
			}
			System.out.println(a.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
