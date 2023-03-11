package importantCoding;

import java.util.Scanner;

public class CheckPalindrome {
	public static void checkPalindrome(String string){
		String reverseString="";
		int strLength=string.length();
		for(int i=(strLength-1);i>=0;i--) {
			reverseString=reverseString+string.charAt(i);
		}
		if(string.toLowerCase().equals(reverseString.toLowerCase())) {
		System.out.println(string + " : is a palindrome");
		}
		else {
			System.out.println(string + "is not a palindrome");
		}
	}
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value to check palindrome: ");
	
	
	checkPalindrome(scan.nextLine());
}
}
