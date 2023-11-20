package oopsdemo;

public class Trainee {
	
	private int id;
	private String name,tech;
	private double stripend;
	
	public Trainee() {

	this.id=0;
	this.name=tech=null;
	this.stripend=0.00;
	}

	public Trainee(int id, String name, String tech, double stripend) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stripend = stripend;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stripend);
	}
	
}
