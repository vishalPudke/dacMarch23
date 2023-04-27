package in.cdac.Array;

import java.util.Scanner;

public class Array {
		public int [] acceptArrayelements() throws RuntimeException {
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array 	:  ");
		int size=sc.nextInt();
		int [] arr = new int[size];
		for(int index=0;index<arr.length;index++) {
			try {
				System.out.print("Enter the array element 	:	");
				arr[index]=sc.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid Input!! Enter valid Input");
				sc.nextLine();//clears the scanner buffer
				index--;
				continue;
			}
		}
		System.out.println();
		return arr;
	}
	public void printSumOfArrayElements(int [] arr) {
		int sum=0;
		for (int index=0;index<arr.length;index++) {
			 sum=sum+arr[index];
		}
		System.out.println("Sum of elements  : "+sum);
		}
		
	}

