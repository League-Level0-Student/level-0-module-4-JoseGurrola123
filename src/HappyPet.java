
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happynesslevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("what kinda pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 2;i++) {

			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cuddle", "walk", "groom" }, null);
		
		// 5. Use user input to call the appropriate method created in step 4.
		System.out.println(task);
		if (task == 1) {
			walk();

		}
		if (task == 0) {
			cuddle();
		}
		if (task == 2) {
			groom();
		}
	
		
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (happynesslevel >= 20) {
			JOptionPane.showMessageDialog(null, "You love your pet");
			break;
		}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void cuddle() {
		happynesslevel = happynesslevel + 5;
		JOptionPane.showMessageDialog(null, "animal sound");
	}

	static void walk() {
		happynesslevel = happynesslevel + 10;
		JOptionPane.showMessageDialog(null, "animal sound");
	}

	static void groom() {
		happynesslevel = happynesslevel + 15;
		JOptionPane.showMessageDialog(null, "animal sound");
	}
}