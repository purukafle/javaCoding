package reverseString;

import java.util.Scanner;

public class PrimeNumber {
	public static void checkPrimeNumber(int num) {
		int temp;
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			
			}
			if(isPrime) {
				System.out.println(num+ ": is a prime number");
			
			}
			else {
				System.out.println(num+": is not a prime number");
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check whether prime or not?: ");
		
		checkPrimeNumber(scan.nextInt());
		
		
	}

}
