package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		
		// 5. Set your robot's pen down 
		
		// 3. Set the robot to go at max speed (100)
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
		Robot joe = new Robot();
		joe.sparkle();
		joe.penDown();
		joe.setPenColor(255,255,000);
		joe.setSpeed(5000);
		for (int i=0; i<340;i++) {
		joe.move(4);
		joe.turn(1);}
		joe.turn(2);
		for (int i=0; i<340;i++) {
			joe.move(3);
			joe.turn(1);}
		joe.turn(2);
		for (int i=0; i<340;i++) {
			joe.move(2);
			joe.turn(1);}
	}
}
