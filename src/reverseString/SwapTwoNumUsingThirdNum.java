package reverseString;

import java.util.Scanner;

public class SwapTwoNumUsingThirdNum {
	int temp;
	public void swapNumnersWithThirdVariable(int x,int y) {
		System.out.println("before swapping" + x+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("with third variable ...........");
		System.out.println("after swapping: "+x+y);
		
	}
	public void swapNumnersWithOutThirdVariable(int x,int y) {
		System.out.println("before swapping" + x+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("with out third variable ...........");
		System.out.println("after swapping: "+x+y);
		
	}
	public static void main(String[] args) {
		SwapTwoNumUsingThirdNum swap=new SwapTwoNumUsingThirdNum();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter x and y value");
		//swap.swapNumnersWithThirdVariable(scan.nextInt(), scan.nextInt());
		swap.swapNumnersWithOutThirdVariable(scan.nextInt(), scan.nextInt());
		scan.close();
		
	}
	
	

	}
	
	


