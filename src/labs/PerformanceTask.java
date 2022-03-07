package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		
		Scanner inKey = new Scanner(System.in); //create scanner 
		System.out.print("Enter launch velocity (m/s):");//prompts user to enter velocity
		double launchVelocity = inKey.nextDouble();//store velocity in variable launchVelocity
		System.out.print("Enter launch angle (degrees):");//prompts user to enter angle
		double launchAngle = inKey.nextDouble();//store angle in variable launchAngle
		double seconds = 0;//time starts at zero
		boolean isZero = false;//boolean to use on while statement
		while (!isZero) {//will continue to loop until isZero is true
//calculation to identify position of the tshirt as it relates to time, velocity, and the angle of launch
			double xPosition = Math.cos(Math.toRadians(launchAngle)) * seconds * launchVelocity;//finds the x position 
			double yPosition = Math.sin(Math.toRadians(launchAngle)) * seconds * launchVelocity
					- 0.5 * 9.8 * (seconds * seconds);//finds the y position
			if (yPosition < 0) {//if the y position is less than 0 meaning it would have hit the ground this will run
				isZero = true;//it will make the isZero boolean true ensuring that the while statement ends 
				System.out.print("\nTime: " + seconds + "s\n  x-pos:" + xPosition + "m\n  y-pos:0m");//instead of printinf the actual y position it will print 0 because it will hit the ground not go into it
				
			}
			else {//every other loop before the y position goes below 0 
			System.out.print("\nTime: " + seconds + "s\n  x-pos:" + xPosition + "m\n  y-pos:" + yPosition + "m");//prints the x and y positions based on the calcualtions as well as the second that position occurs
			seconds++;//adds to the seconds for the next loop
			}
			
		}
	
	}
	
	
}
//	double xPosition2 = Math.cos(Math.toRadians(launchAngle)) * 1 * launchVelocity;
//double yPosition2 = Math.sin(Math.toRadians(launchAngle)) * 1 * launchVelocity - 0.5 * 9.8 * 1;
//System.out.print("\nTime: 1s\n  x-pos:" + xPosition2 + "m\n  y-pos:" + yPosition2 + "m" );