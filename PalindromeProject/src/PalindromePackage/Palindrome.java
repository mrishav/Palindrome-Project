//Rishav Mitra
//10-15-17
//This is the object class of my palindrome project that has multiple methods to check whether it's a palindrome
package PalindromePackage;

public class Palindrome {
	String reversed;
	String input;

	//stores input variable as a lower case string
	public Palindrome(String str) {
		input = str.toLowerCase();
	}

	//gets rid of non alphanumeric characters and spaces
	public void cleaner() {
		String checked = ("");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
				checked += ch;
			}
		}
		input = checked;
	}

	//revereses the cleaned string
	public void reverser() {
		reversed=("");
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed+=input.charAt(i);
		}
	}
	//checking if the reversed string matches the cleaned string and is not a singleton
	public boolean palindromeChecker() {
		if(reversed.equals(input)&&input.length()>=2){
			return true;
		}
		else
		{
			return false;
		}
	}
}
