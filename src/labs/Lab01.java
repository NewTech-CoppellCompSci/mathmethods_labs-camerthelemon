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
		
		Scanner inKey = new Scanner(System.in); // scanner
		System.out.print("Length of side A: "); //ask user for side of triangle
		int sideA = inKey.nextInt(); //collect and store in variable
		System.out.print("Length of side B: "); //ask user for side of triangle x2
		int sideB = inKey.nextInt(); //collect and store in variable 
		//next i use these sides and put them into the equation a^2 + b^2 = c^2 to calculate the hyponuse 
		double numA = Math.pow(sideA, 2); //squareing side a
		double numB = Math.pow(sideB, 2);//squaring side b
		
		double numC = numA + numB; //adding the squared sides 
		double hypo = Math.sqrt(numC); //finding the square root of the sum
		System.out.print("Hypotenuse = " + hypo); //print the result 
	}


	
	
	public static void problem04() {
		boolean isZero = false; //before while statement a boolean to create it 
		int max = Integer.MIN_VALUE; //lowest possible value for .max statement later
		int min = Integer.MAX_VALUE;//highest possible value for .min statement later
		while (!isZero) { //while statement as long as the boolean is false
			Scanner inKey = new Scanner(System.in); //scanner
			System.out.print("Enter an integer: "); //prompt user to enter an int
			int input = inKey.nextInt(); //collect int and store in variable input
			
			
			
			if (input == 0){ //if statement will trigger if 0 is inputed 
				isZero = true; //this will make zero true
				break;//to stop the seqence from compareing zero to the minimum number i put a break so the isZero = true comand isn't nesscary but i left it 
			}
			
			max = Math.max(max, input); //finds max number after each cycle
			min = Math.min(min, input);//finds min number after each cycle
		}
		System.out.println("Max = " + max); //once zero is entered and while statement stops it will print the max
		System.out.println("Min = " + min);//once zero is entered and while statement stops it will print the min
		
		
	}
	
	
	
	
	
	
}
