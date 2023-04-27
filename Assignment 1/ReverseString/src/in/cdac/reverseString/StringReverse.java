package in.cdac.reverseString;

import java.util.Scanner;

public class StringReverse {
	Scanner sc = new Scanner(System.in);
private String name;
 public void setName(String name) {
	 this.name=name;
 }
 public String getName() {
	 //String Input=this.name;
	 
		 if (this.name.matches("[a-zA-Z]+")){
			 return this.name;
	 } else {
		 System.out.println("Invalid Input!! Please Enter Valid Input");
		 System.out.println("Enter Input  :  ");
		 setName(sc.nextLine());
	 }
		 return this.name;
 }

}

class Test {
	 Scanner sc = new Scanner(System.in);
	StringReverse stringreverse = new StringReverse();
	public void acceptString() {
		System.out.print("Enter Input 	: 	");
		 stringreverse.setName(sc.nextLine());
	}
	
		 public void reverseString() {
			 String reverse="";
			 String str=stringreverse.getName(); 
		 for ( int index=str.length()-1;index>=0;index--) {
				reverse = reverse+str.charAt(index);			 
		 }
		 System.out.println("Reverse String is :   "+reverse);
		 }
}

	

class Program{
	public static void main(String [] args) {
		Test test = new Test();
		test.acceptString();
		test.reverseString();
		
	}
		
}

