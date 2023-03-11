package importantCoding;

import java.util.Scanner;

public class ReverseStringWithOutStringBuffer {
	public static void getReverseString(String string) {
		if(string==null ||string.isEmpty()) {
			System.out.println(string);
			
		}
		
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse=reverse+string.charAt(i);
		}
		System.out.println(reverse);
		
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter String: ");
	getReverseString(scan.nextLine());
	scan.close();
	
	
}
}
