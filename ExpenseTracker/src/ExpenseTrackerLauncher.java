
public class ExpenseTrackerLauncher {

	public static void main(String[] args) {
		WindowPractice frame = new WindowPractice();
		frame.setVisible(true);
		new ExpenseTrackerGUI().setLocationRelativeTo(null);
	}

}
