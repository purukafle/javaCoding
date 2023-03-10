package reverseString;

import java.util.Scanner;

public class ReverseString {

	
		public void reverseString(String originalString) {
			String reverseStr="";
			for(int i=originalString.length()-1;i>=0;i--) {
			reverseStr=reverseStr+originalString.charAt(i);


			}
			System.out.println("original String is: "+originalString);
			System.out.println(reverseStr);
			System.out.println("===========================");

			}
			public void reverseString1(String input) {
			StringBuilder string=new StringBuilder();
			string.append(input);
			string.reverse();
			System.out.println(string);
			System.out.println("===========================");
			}
			public void reverseString2(String input) {
				char chars[]=input.toCharArray();
				for(int i=input.length()-1;i>=0;i--) {
					System.out.print(chars[i]);
				
				}
				}
			public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter string: ");
			ReverseString reverse=new ReverseString();
			//reverse.reverseString(scan.nextLine());
			//reverse.reverseString1(scan.nextLine());
			reverse.reverseString2(scan.nextLine());
			
			scan.close();
			}

			}

