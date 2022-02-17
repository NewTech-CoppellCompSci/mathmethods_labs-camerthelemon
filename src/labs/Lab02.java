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
		
		
		
	}

	
	

	public static void problem03() {

		
		
	}


	
	
	public static void problem04() {
		
		
		
		
	}
	
	

	
}
