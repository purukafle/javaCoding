	package homework8;

import java.util.Scanner;

public class FuturisticPen {
	String inkType="liquid";
	int barrelCapcity=1;
	String color;
	String nibCondition;
	String	response;
	
	public void Sensor() {
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Current ink volume: ");
		double inkVolume=scan.nextDouble();
		if (inkVolume>barrelCapcity) {
			System.out.println("pen Barrel can't hold more than 1 ml");
		}
		else {
			if(inkVolume>=barrelCapcity*0.25) {
				response= ("Sufficient ink "+ inkVolume+" ml ink");
				
			}
			else if(inkVolume<=barrelCapcity*0.01) {
				response="Stop Work with "+ inkVolume+ "ml ink";
			}
		}
		
		System.out.println("nib condition : ");
		nibCondition=scan.next();
		if(nibCondition=="damaged") {
			response="Stop Wtiting";
			
		}
		
		
		System.out.println("Enter Color of the Ink: ");
		color=scan.next();
		color=color;
		
		
	}
	public void getResponse() {
		System.out.println();
	}
	
	
	
	
	
	
	
	}
	
	