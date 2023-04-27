package in.cdac.swap;

public class Swap {
	private int a;
	private int b;
	public Swap( ) {

		this.a = 0;
		this.b = 0;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void swapValue() {
		this.a=this.a+this.b;
		this.b=this.a-this.b;
		this.a=this.a-this.b;
		System.out.println("After Swap ");
		System.out.println("a 	: 	"+a);
		System.out.println("b 	: 	"+b);
		
	}
	
	

}
