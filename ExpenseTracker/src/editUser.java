import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class editUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField newFnameField;
	private JTextField newLnameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editUser frame = new editUser();
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
	public editUser() {
		setTitle("Edit User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topMessageLabel = new JLabel("Edit user information");
		topMessageLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		topMessageLabel.setBounds(10, 11, 123, 14);
		contentPane.add(topMessageLabel);
		
		JLabel newFnameLabel = new JLabel("New first name:");
		newFnameLabel.setBounds(10, 45, 76, 14);
		contentPane.add(newFnameLabel);
		
		JLabel newLnameLabel = new JLabel("New last name:");
		newLnameLabel.setBounds(10, 83, 76, 14);
		contentPane.add(newLnameLabel);
		
		newFnameField = new JTextField();
		newFnameField.setBounds(96, 42, 86, 20);
		contentPane.add(newFnameField);
		newFnameField.setColumns(10);
		
		newLnameField = new JTextField();
		newLnameField.setBounds(96, 80, 86, 20);
		contentPane.add(newLnameField);
		newLnameField.setColumns(10);
		
		JLabel newPasswordLabel = new JLabel("New password:");
		newPasswordLabel.setBounds(10, 123, 76, 14);
		contentPane.add(newPasswordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(96, 120, 86, 20);
		contentPane.add(passwordField);
		
		JButton newFnameButton = new JButton("Enter");
		newFnameButton.setBounds(210, 41, 89, 23);
		contentPane.add(newFnameButton);
		
		JButton newLnameButton = new JButton("Enter");
		newLnameButton.setBounds(210, 79, 89, 23);
		contentPane.add(newLnameButton);
		
		JButton newPasswordButton = new JButton("Enter");
		newPasswordButton.setBounds(210, 119, 89, 23);
		contentPane.add(newPasswordButton);
	}
}
