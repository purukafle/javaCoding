package homework4;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=2;
		while(count>1) {
		System.out.println("Enter days by Number: 1,2,3,4,5,6,7");
		int day=scan.nextInt();
		switch(day) {
		case (1):
		System.out.println("this is Sunday");
		break;
		case (2):
		System.out.println("this is Monday");
		break;
		case (3):
			System.out.println("this is Tuesday");
			break;
		case (4):
			System.out.println("this is Wednesday");
			break;
		case (5):
			System.out.println("this is Thursday");
			break;
		case (6):
			System.out.println("this is Friday");
			break;
		case (7):
			System.out.println("this is Saturday");
			break;
		default:
			System.out.println("Number should be between 1-7:enter again: true or false");
			boolean response=scan.nextBoolean();
			if(response==true) {
				System.out.println("Enter days by Number: 1,2,3,4,5,6,7");
				
				day=scan.nextInt();	
				
				
			}else {
				System.exit(day);
			}
			
			
		}

		}}}
		

	

