package oopsdemo2;

public class Rectangle implements Shape {

	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

}
