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
		Scanner inKey = new Scanner(System.in);//scanner
		System.out.print("Enter a positive integer: " ); //prompt user for int
		int posInt = inKey.nextInt(); //collect and store in variable 
		System.out.print("Enter another positive integer: " ); //prompt user for int
		int posInt2 = inKey.nextInt();//collect and store in variable 
		int count = 0;//set up count this will help set up the while statement
		int max = Math.max(posInt, posInt2);//decide whitch int entered is bigger
		int min = Math.min(posInt, posInt2);//decide whitch int entered is smaller
		while (count <= 10) {//while statemnt will loop 10 times
		int randomNum = (int) (Math.random() * max + min); //random numbers between the two enetered will be generated each loop
		count++;//count adds 1 to everytime
		System.out.print(randomNum + " ");//print the result
		}
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);//scanner
		System.out.print("Enter height of cylinder: ");//ask user for height of cylinder
		int height = inKey.nextInt();//collect height in aprpiatly named variable
		System.out.print("Enter radius of cylinder: ");//ask user for radius 
		int radius = inKey.nextInt();//collect radius in apropiatly named variable
		System.out.print("The cylinder's volume is: " + (Math.PI * height * (radius * radius)));//print the cyclinders volume by multiplying pi and the height and radius squared except i didn't use the pow statement to sqare because multipling radius by itself would be quicker in this case 
		
	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in);//scanner
		System.out.print("Enter x1: ");//ask for the first point's x value 
		double x1 = inKey.nextDouble();//store input in variable 
		System.out.print("Enter y1: ");//ask for the first point's y value 
		double y1 = inKey.nextDouble();//store input in variable 
		System.out.print("Enter x2: ");//ask for the second point's x value 
		double x2 = inKey.nextDouble();//store input in variable 
		System.out.print("Enter y2: ");//ask for the second point's y value 
		double y2 = inKey.nextDouble();//store input in variable 
		double xPart = (x2-x1);//using the equation  squareroot of (x2-x1)^2 + (y2-y1)^2 i started with subtracting the x values
		double xSquared = Math.pow(xPart, 2);//i then squared the diffrence
		double yPart = (y2-y1);//did the same with y 
		double ySquared = Math.pow(yPart, 2);
		
		double solve = Math.sqrt(xSquared + ySquared);//added the result and found the sqaure root 
		System.out.println("Distance between points =  " + solve);//print the result
		
	}


	
	
	public static void problem04() {
		//solving the quadratic formula 
		Scanner inKey = new Scanner(System.in);//scanner set up
		System.out.print("Enter a-value: "); //ask user for the a value 
		double a = inKey.nextDouble();//store in a
		System.out.print("Enter b-value: ");//ask user for b value 
		double b = inKey.nextDouble();//store in b
		System.out.print("Enter c-value: ");//ask user for c value 
		double c = inKey.nextDouble();//store in c
		double b2 = Math.pow(b, 2);//sqaure b and store it in b2
		double sqrted = Math.sqrt(b2 - (4 * a * c));//this part will stay the samee weather it is subtracting or adding and is all square rooted 
		double x1 = ((-b + sqrted) / (2 * a)); //the x output with addition and i divide here 
		double x2 = ((-b - sqrted) / (2 * a));//the x output with subtraction, i divide here too
		System.out.println("x1 = " + x1);//the result of one x output printed 
		System.out.println("x2 = " + x2);//the result of another x output printed 
		
	}
	
	

	
}
