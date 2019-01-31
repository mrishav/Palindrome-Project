//Rishav Mitra
//10-15-17
//This is the driver class of my palindrome project
package PalindromePackage;

import java.util.Scanner;
//takes in a user input and tests whether it's a palindrome
public class PalindromeTester {
	public static void main(String[] args) {
		boolean run = true;
		System.out.println(
				"This program identifies whether you have inputted a palindrome or not. A palindrome is a word or phrase that is the same backwards as forwards ( EX:racecar)");
		System.out.println("Once finished using this program type q");
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\nEnter a String: ");
			String str = input.nextLine();
			if (str.equals("q")) {
				run = false;
				System.out.println("Thank You for using this program");
			} else {
				Palindrome test = new Palindrome(str);
				test.cleaner();
				test.reverser();
				System.out.println("Your String:" + test.reversed);
				if (test.palindromeChecker()) {
					System.out.println("Your input of " + str + " is a palindrome");
				} else {
					System.out.println("Your input of " + str + " is not a palindrome");
				}
			}
		} while (run);
	}
}
