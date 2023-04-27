package in.cdac.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program1 {

	static Scanner sc = new Scanner(System.in);

	public static void countWord(String input) {
		int count = 0;
		String[] words = input.split("\\s+");
		count = words.length;

		System.out.println(count);
	}

	public static void main1(String[] args) {
		System.out.println(" Enter the String ");
		String input = "";
		while (true) {
			input = sc.nextLine();
			if (Pattern.matches("[a-zA-Z]+", input)) {
				break;
			} else {
				System.out.println("Invalid Input!!! Please Enter Alpabhetic String");
			}

		}
		countWord(input);

	}
}
