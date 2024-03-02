
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class UserLoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


    public UserLoginGUI() {
        try{
            // Apply the NimbusLookAndFeel
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception ex){
            System.err.println("Failed to Set NimbusLookAndFeel");
        }

	/**
	 * Create the frame.
	 */

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JFrame frmUserLogin = new JFrame();
		frmUserLogin.setTitle("User Login");
		frmUserLogin.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Welcome to Expense Tracker!");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setBounds(88, 11, 277, 44);
		frmUserLogin.getContentPane().add(Title);
		
		JLabel newUser = new JLabel("New User?");
		newUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newUser.setBounds(182, 66, 68, 23);
		frmUserLogin.getContentPane().add(newUser);
		
		JButton createAccount = new JButton("Create Account...");
		createAccount.setBounds(149, 93, 136, 23);
		frmUserLogin.getContentPane().add(createAccount);
		
		JLabel askAccount = new JLabel("Have an account?");
		askAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		askAccount.setBounds(162, 139, 110, 23);
		frmUserLogin.getContentPane().add(askAccount);
		
		JButton signIn = new JButton("Sign in...");
		signIn.setBounds(172, 175, 89, 23);
		frmUserLogin.getContentPane().add(signIn);

		setContentPane(contentPane);
	}
}
