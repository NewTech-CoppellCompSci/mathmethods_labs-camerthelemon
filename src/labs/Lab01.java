package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		//problem01();
		//problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		double num1 = Math.pow(input, input2);
		System.out.println(input + "^" + input2 + " = " + num1 + "\n");
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		
		double num1 = Math.sqrt(input);
		System.out.println("the square root of " + input + " is " + num1 + "\n");
		
		
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Length of side A: ");
		int sideA = inKey.nextInt();
		System.out.print("Length of side B: ");
		int sideB = inKey.nextInt();
		
		double numA = Math.pow(sideA, 2);
		double numB = Math.pow(sideB, 2);
		
		double numC = numA + numB;
		double hypo = Math.sqrt(numC);
		System.out.print("Hypotenuse = " + hypo);
	}


	
	
	public static void problem04() {
		boolean isZero = false;
		while (!isZero) {
			Scanner inKey = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int input = inKey.nextInt();
			
			if (input = 0){
				
				
			}
		}
		
	}
	
	
	
	
	
	
}
