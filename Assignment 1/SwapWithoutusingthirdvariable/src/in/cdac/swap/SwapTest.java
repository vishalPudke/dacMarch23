package in.cdac.swap;

import java.util.Scanner;

public class SwapTest {
	Swap swap = new Swap();
	public SwapTest() {
		
	}
	private static Scanner sc =new Scanner(System.in);
	public void acceptRecord() {
		System.out.print("Enter a	: 	");
		swap.setA(sc.nextInt());
		System.out.print("Enter b 	: 	");
		swap.setB(sc.nextInt());
	}
	public void printRecord() {
		System.out.println("Before Swap");
			System.out.println("a	: 	"+swap.getA());
			System.out.println("b 	: 	"+swap.getB());
			swap.swapValue();
	}

}
