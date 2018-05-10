import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "your walking home and you come across a forest.");
		String[] options = { "Yes", "no" };
		int choice = JOptionPane.showOptionDialog(null, "Do you want to explore the forest?", "title",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (choice == 1) {
			JOptionPane.showConfirmDialog(null, "You have reached your destination, home");
		} else {
			JOptionPane.showConfirmDialog(null, "Great now lets start your adventure");
			String[] options2 = { "get a water gun", "give him your money" };
			int choice2 = JOptionPane.showOptionDialog(null,
					"you started your adventure but a goblin jumps in front of you saying to give him all your money ",
					"title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);

			if (choice2 == 0) {
				
				
					JOptionPane.showMessageDialog(null, "Seriously? a water gun? he laughed and took your money.");
				}
				if (choice2 == 1) {
				JOptionPane.showMessageDialog(null,
						"great! you chose to give him your money, now you went home broke.");
				// }
			}
		}
	}
}

