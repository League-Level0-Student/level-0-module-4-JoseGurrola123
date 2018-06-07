import java.awt.print.Printable;

import javax.swing.JOptionPane;

public class SimpleSorter {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog("Choose a number");
	String num2=JOptionPane.showInputDialog("Choose another number");
	String num3=JOptionPane.showInputDialog("Choose another number");
	int ans=Integer.parseInt(num);
	int ans2=Integer.parseInt(num2);
	int ans3=Integer.parseInt(num3);
	
	if (ans<ans2&&ans<ans3) {
		System.out.println(ans);
		if(ans2<ans3) {
			System.out.println(ans2);
		if(ans3<ans2) {System.out.println(ans3);
		}
		}
	}
}
}
