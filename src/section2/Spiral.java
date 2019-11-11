package section2;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		
		Robot joe = new Robot();
		joe.sparkle();
		joe.penDown();
		joe.setPenColor(255,255,000);
		joe.setSpeed(100);
		
		
		
		String shape = JOptionPane.showInputDialog(null,"Would you like to make a spiral or a regular shape?");
		if(shape.equals("spiral")) {
			
			
		
		
		String spiral = JOptionPane.showInputDialog(null,"Would you like to create a square spiral or a circle spiral?");
		if(spiral.equals("square spiral")) {
		
	
				
	 
	for (int r=0; r<300; r+=15) {
		
		for (int i=0; i<2;i++) {
			
		joe.move(0+r);
		joe.turn(90);
		
		
		}
	}
				
	joe.penUp();
	joe.move(400);
		}
		
		if(spiral.equals("circle spiral")) {
			 
			for (int r=0; r<20; r++) {
				
				for (int i=0; i<20;i++) {
					
				joe.move(0+r);
				joe.turn(9
						);
				}
			}
						
			joe.penUp();
			joe.move(400);}
					
		}	
		else {
			JOptionPane.showMessageDialog(null,"Sorry, that is not an option.");
			
		}
			
		if (shape.equals("regular shape")) {
			
			String rshape = JOptionPane.showInputDialog("Would you like to make a square or a circle?");
			
			if(rshape.equals("square")) {
				for(int s = 0; s<4; s++) {	
			
				joe.move(200);
				joe.turn(90);
				}
				joe.penUp();
				joe.move(400);
				}
			if(rshape.equals("circle")) {
			for(int c=0; c<90; c++) {
				
				joe.move(4);
				joe.turn(4);
			}
				
			joe.penUp();
			joe.move(400);	
			}
		}
		else {
			JOptionPane.showMessageDialog(null," Sorry, that is not an option.");
		}
		
		
		}
}

