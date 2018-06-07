
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		int ans = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(ans);
		if (ans == 0) {
			isWeekday = true;

		} else {
			isWeekday = false;
		}
		int ans2 = JOptionPane.showConfirmDialog(null, "Is it vacation", "", JOptionPane.YES_NO_OPTION);
		if (ans2 == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		
		}
		if (isVacation || isWeekday == false) {
			JOptionPane.showMessageDialog(null, "sleep in");
			
		}
		if (isVacation || isWeekday == true) {
			JOptionPane.showMessageDialog(null, "get up lazy bones!");/*
			 * 
			 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
			 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
			 * in”.
			 */
		}

	}
	
}
