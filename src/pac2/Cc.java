package pac2;

import pac1.Bb;

public class Cc extends Bb{

	int a;
	
	Cc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cc (int c, String h){
		this(c);
	}
	
	public Cc (int a){
		this.a = a;
	}
	
	public void m1(){
		System.out.println("gggggg");
	}
	
	public void m2(){
		System.out.println("gggggg2222222");
	}
	
	public void print(Object ssss){
		System.out.println(ssss + "string method");
	}
	
	
	public static void main(String [] args){
		Bb c1 = new Cc();
		Bb b1 = new Bb();
		Cc c3 = new Cc();
		c1.print("0");
		c1.m1();
		c1.m3();
		
		b1.m1();
	}
}
