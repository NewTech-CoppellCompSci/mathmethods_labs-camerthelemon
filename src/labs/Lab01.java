package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in); //scanner
		System.out.print("Enter a positive integer: "); //ask for user to enter positive int 
		int input = inKey.nextInt(); //collect int and store in input
		System.out.print("Enter another positive integer: "); //ask for user to enter 2nd int
		int input2 = inKey.nextInt();//collect int and store in input2 
		
		double num1 = Math.pow(input, input2); //take the first int and calculate it to the power of the second int
		System.out.println(input + "^" + input2 + " = " + num1 + "\n"); //print the result
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); //scanner
		System.out.print("Enter a positive integer: ");// ask for int
		int input = inKey.nextInt();// store int in inpute
		
		double num1 = Math.sqrt(input); //fint square root of input
		System.out.println("the square root of " + input + " is " + num1 + "\n"); //print the result
		
		
		
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
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		while (!isZero) {
			Scanner inKey = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int input = inKey.nextInt();
			
			
			
			if (input == 0){
				isZero = true;
				break;
			}
			
			max = Math.max(max, input);
			min = Math.min(min, input);
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
