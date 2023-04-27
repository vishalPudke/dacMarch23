package in.cdac.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void countWord(String input) {
		int count = 0;
		String[] words = input.split("\\s+");
		count = words.length;

		System.out.println(count);
	}

	public static void main(String[] args) {
		System.out.println(" Enter the String ");
		String input =sc.nextLine();;
		
		countWord(input);

	}
}
