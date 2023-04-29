package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class random_lottery_numbers {

	public static void main(String[] args) {
	Random ran = new Random();
	int lottery_number = 0;
	int[] s = new int[6];
	for (int i=0;i<6; i++) {
		lottery_number = ran.nextInt(50) + 0;
		s[i] = lottery_number;
	
		
	}
	JOptionPane.showMessageDialog(null, s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + s[4] + " " + s[5]);
	
	
	

	}

}
