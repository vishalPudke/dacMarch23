package in.cdac.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner (System.in);
	public static boolean ispalindrome(String str, int start, int end) {
		if (start == end) {
			return true;
		}
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		} else {
			return (ispalindrome(str, start + 1, end - 1));

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int start = 0;
		int end = str.length()-1;

		if (ispalindrome(str, start, end)) {
			System.out.println(" String is palindorme");
		} else {
			System.out.println(" String is  not Palindrome");
		}

	}

}
