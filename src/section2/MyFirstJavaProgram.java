package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
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
