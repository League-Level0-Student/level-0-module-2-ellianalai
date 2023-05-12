package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int ageInt = Integer.parseInt(age);
		if (ageInt>=18) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		}
		else if (ageInt<18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}
		
	
	
	
	}

}
