import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UserLoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginGUI frame = new UserLoginGUI();
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
	public UserLoginGUI() {
		setTitle("Welcome Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to Expense Tracker!!");
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		welcomeLabel.setBounds(91, 22, 267, 31);
		contentPane.add(welcomeLabel);
		
		JLabel newUserLabel = new JLabel("New User?");
		newUserLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newUserLabel.setBounds(185, 64, 69, 22);
		contentPane.add(newUserLabel);
		
		JButton createUserButton = new JButton("Create user");
		createUserButton.setBounds(173, 97, 89, 23);
		contentPane.add(createUserButton);
		
		JLabel accountLabel = new JLabel("Have an account?");
		accountLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accountLabel.setBounds(164, 142, 112, 31);
		contentPane.add(accountLabel);
		
		JButton signInButton = new JButton("Sign in");
		signInButton.setBounds(173, 175, 89, 23);
		contentPane.add(signInButton);
	
		createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	CreateUserGUI createUser = new CreateUserGUI();
            	dispose();
            	createUser.setVisible(true);
            }
    });
	
	}
	
	
	
	
	
	

}
