package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Hi {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("How old are you?");
		int y = Integer.parseInt(x);
		if (y >= 18) {
			String z = JOptionPane.showInputDialog("How shall thy president be?");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "shut up");
		}
	}
}
