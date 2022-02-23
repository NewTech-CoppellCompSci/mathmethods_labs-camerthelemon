package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: " );
		int posInt = inKey.nextInt(); 
		System.out.print("Enter another positive integer: " );
		int posInt2 = inKey.nextInt();
		int count = 0;
		int max = Math.max(posInt, posInt2);
		int min = Math.min(posInt, posInt2);
		while (count <= 10) {
		int randomNum = (int) (Math.random() * max + min);
		count++;
		System.out.print(randomNum + " ");
		}
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter height of cylinder: ");
		int height = inKey.nextInt();
		System.out.print("Enter radius of cylinder: ");
		int radius = inKey.nextInt();
		System.out.print("The cylinder's volume is: " + (Math.PI * height * (radius * radius)));
		
	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		double xPart = (x2-x1);
		double xSquared = Math.pow(xPart, 2);
		double yPart = (y2-y1);
		double ySquared = Math.pow(yPart, 2);
		
		double solve = Math.sqrt(xSquared + ySquared);
		System.out.println("Distance between points =  " + solve);
		
	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		double b2 = Math.pow(b, 2);
		double sqrted = Math.sqrt(b2 - (4 * a * c));
		double x1 = ((-b + sqrted) / (2 * a));
		double x2 = ((-b - sqrted) / (2 * a));
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
	
	

	
}
