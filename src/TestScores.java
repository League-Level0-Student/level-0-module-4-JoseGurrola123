import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score= JOptionPane.showInputDialog("what was your score on the test?");
	double num=Double.parseDouble(score);
	if(num >= 85) {JOptionPane.showConfirmDialog(null, "GOOD JOB!");
}
	else if(num <= 65){
		JOptionPane.showConfirmDialog(null, "dummy head");
	}
}
}
