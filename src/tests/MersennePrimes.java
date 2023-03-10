	package tests;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	
	public class MersennePrimes { 	
		
		
		
		public void checkMersenne(int num) { 
		int n1 = num + 1;  
		int power = 0, result = 0;
		
		for(int i=0;i<=num ;i++)  {     
		power = (int)Math.pow(2, i);    
		if(power == n1) {  
		System.out.println(num+" is a Mersenne number.");  
		result = 1;
		try{    
	           FileWriter fw=new FileWriter("C:\\Users\\kaflepk\\Desktop\\New folder\\number.txt");    
	           fw.write(num+" is a Mersenne number.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
		}  
		  
		if(result == 0) {  
		System.out.println(num+" is not a Mersenne number.");  
		}
		
		
		}
		
		
		public static void main(String args[])  
		{ 
		MersennePrimes primes=new MersennePrimes();
			
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		int num = sc.nextInt(); 
		while(!(num>1)) {
		System.out.print("Enter a number: ");
		num=sc.nextInt();	
		}
		primes.checkMersenne(num);
		sc.close();
		}	
	}