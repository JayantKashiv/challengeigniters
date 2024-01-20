package challenge;

import java.util.Scanner;

public class challenge4 {
	public static void main(String[] args) {
		//Enter a string
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		scanner.close();

		// Check if the input string is a palindrome
		if (isPalindrome(inputString)) {
			System.out.println("The string '" + inputString + "' is a palindrome.");
		} else {
			System.out.println("The string '" + inputString + "' is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase for case-insensitive comparison
		String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

		// Check if the cleaned string is equal to its reverse
		return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
	}
}
