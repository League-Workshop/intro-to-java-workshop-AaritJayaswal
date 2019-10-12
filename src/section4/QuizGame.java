package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog(null, "What is 1+1?");
		// 3.  Use an if statement to check if their answer is correct
		if (question.equals("2")) {
			score++;
			JOptionPane.showMessageDialog(null,"Correct!");
			
		}   
		else {
	JOptionPane.showMessageDialog(null,"WRONG!");		
			
		}
		// 4.  if the user's answer was correct, add one to their score 
		JOptionPane.showMessageDialog(null," your score is: "+ score+"/3");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		String question2 = JOptionPane.showInputDialog(null, "What is 5-1?");
		
		if (question2.equals("4")) {
			score++;
			JOptionPane.showMessageDialog(null,"Correct!");
			
		}   
		else {
	JOptionPane.showMessageDialog(null,"WRONG!");		
			
		}
		
		JOptionPane.showMessageDialog(null," your score is: "+ score+"/3");
		
		
		String question3 = JOptionPane.showInputDialog(null, "What is 10x6?");
		
		if (question3.equals("60")) {
			score++;
			JOptionPane.showMessageDialog(null,"Correct!");
			
		}   
		else {
	JOptionPane.showMessageDialog(null,"WRONG!");		
			
		}
		
		JOptionPane.showMessageDialog(null," your score is: "+ score+"/3");
		JOptionPane.showMessageDialog(null, "You got, "+score*100/3+"%"  ); 
		
	}


}
