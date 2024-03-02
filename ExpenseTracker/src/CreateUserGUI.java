import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class CreateUserGUI extends JFrame {
	public List<String> userList = new 	ArrayList<>();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fnameField;
	private JTextField lnameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUserGUI frame = new CreateUserGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateUserGUI() {
		setTitle("Create user");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel displayLabel = new JLabel("Create new user..");
		displayLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		displayLabel.setBounds(29, 11, 122, 25);
		contentPane.add(displayLabel);
		
		fnameField = new JTextField();
		fnameField.setBounds(97, 47, 86, 20);
		contentPane.add(fnameField);
		fnameField.setColumns(10);
		
		JLabel firstNameLabel = new JLabel("First name:");
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstNameLabel.setBounds(29, 47, 77, 20);
		contentPane.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Last name:");
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastNameLabel.setBounds(29, 83, 65, 20);
		contentPane.add(lastNameLabel);
		
		lnameField = new JTextField();
		lnameField.setBounds(97, 84, 86, 20);
		contentPane.add(lnameField);
		lnameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordLabel.setBounds(29, 121, 59, 14);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 119, 86, 20);
		contentPane.add(passwordField);
		
		JButton createButton = new JButton("Create!");
		createButton.setBounds(187, 145, 89, 23);
		contentPane.add(createButton);
		
		createButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	createUser();
	            	dispose();
	            }
	    });
	}

	private void createUser() {
		String firstName = fnameField.getText();
		String lastName = lnameField.getText();
		char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);
		
		if(firstName.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter your first name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
		if(lastName.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter your last name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
		if(password.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter a password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
		
		UserProfile user = new UserProfile(firstName, lastName, password);
		System.out.println(user);
		ExpenseTrackerGUI expenseTrackerGUI = new ExpenseTrackerGUI(user);
        expenseTrackerGUI.setVisible(true);
     
	}
}
