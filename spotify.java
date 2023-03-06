package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class spotify {

	private JFrame Login;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spotify window = new spotify();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public spotify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.getContentPane().setBackground(new Color(255, 255, 255));
		Login.setBounds(100, 100, 894, 689);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Password");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(283, 383, 66, 21);
		Login.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Email address or username");
		lblNewLabel_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(284, 313, 172, 21);
		Login.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel.setBounds(303, 0, 273, 87);
		Login.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.control);
		separator.setBounds(0, 89, 880, 8);
		Login.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("To continue, log in to Spotify.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(311, 107, 258, 23);
		Login.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CONTINUE WITH FACEBOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://www.facebook.com/login.php?skip_api_login=1&api_key=174829003346&kid_directed_site=0&app_id=174829003346&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv7.0%2Fdialog%2Foauth%3Fclient_id%3D174829003346%26state%3DAQBdjH5N3empyy4xU7DCPFFPFzmULf9OjhB5aWJHtQsaKNePka7S8R6WU5e3YWRCEHwX%252F6%252BiqdO8b94GfBi296BPURHm9INXFe45plLHP2G0iddo%252BbRzHOkUasvjYAh7LJFABACdXxZfqIFxKCJG5%252FI3euVtkZyw%252FqniITQcYnHwty6FkkYd1h2WBdywgCdRDBpZqDfC4z9ku1NlhVYPBWzGvTjEMQeANP%252F4n%252F8zcnOG7apo6wIkqEzLNplmsgwwC%252FV71zCt%252BDoZRQ%253D%253D%26redirect_uri%3Dhttps%253A%252F%252Faccounts.spotify.com%252Flogin%252Ffacebook%252Fredirect%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3Dee3da20a-97e5-46d0-9e06-bb432799287d%26tp%3Dunspecified&cancel_url=https%3A%2F%2Faccounts.spotify.com%2Flogin%2Ffacebook%2Fredirect%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DAQBdjH5N3empyy4xU7DCPFFPFzmULf9OjhB5aWJHtQsaKNePka7S8R6WU5e3YWRCEHwX%252F6%252BiqdO8b94GfBi296BPURHm9INXFe45plLHP2G0iddo%252BbRzHOkUasvjYAh7LJFABACdXxZfqIFxKCJG5%252FI3euVtkZyw%252FqniITQcYnHwty6FkkYd1h2WBdywgCdRDBpZqDfC4z9ku1NlhVYPBWzGvTjEMQeANP%252F4n%252F8zcnOG7apo6wIkqEzLNplmsgwwC%252FV71zCt%252BDoZRQ%253D%253D%23_%3D_&display=page&locale=en_US&pl_dbl=0";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(274, 130, 331, 27);
		Login.getContentPane().add(btnNewButton);
		
		JButton btnContinueWithApple = new JButton("CONTINUE WITH APPLE");
		btnContinueWithApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://appleid.apple.com/auth/authorize?client_id=com.spotify.accounts&response_type=code&response_mode=form_post&scope=name%20email&state=AQCoLgUAUAq7p8A5aI3Z6ejXnyxE9ZRKDhjuc1GD1RfOJRUnVYm57yoch6N4qSyJ5IL49FjQeNQrsSvvB7vmhszX5e3bd6Qk%2BsQ%2BHFYGWIN%2BoUvrM7oALvsDrJE4wwBhaqV%2FjEYOjS%2BdR95hrUZcNW6vd0WOCz9O9sXJdVgXjHNgjFbjOr1GJHBvi9u%2BLmbDl4Nm4IhbqJGo7cQDnw%2FUdWJU1m%2FRyjnqJImwYR%2BFYR2jI3Ui5r9R357JFn0FpBvUi%2Bju4d3WB4wUqA%3D%3D&redirect_uri=https%3A%2F%2Faccounts.spotify.com%2Flogin%2Fapple%2Fredirect";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnContinueWithApple.setForeground(Color.WHITE);
		btnContinueWithApple.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContinueWithApple.setBackground(new Color(0, 0, 0));
		btnContinueWithApple.setBounds(274, 167, 331, 27);
		Login.getContentPane().add(btnContinueWithApple);
		
		JButton btnContinueWithGoogle = new JButton("CONTINUE WITH GOOGLE");
		btnContinueWithGoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://accounts.google.com/o/oauth2/v2/auth/identifier?response_type=code&access_type=offline&client_id=1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com&state=AQC%2F7fasAvxyj7omrKX4DukRBcvEfzaLsgRr%2BjplcavQVMRKFjKrtgrcIlr5J3wgrD52NPSwIg%2FIznKoa%2BhIs55XM94hb6PzmhRhZvWl2QCiXsXzawWsZGGpdt%2ByBx13rH4VC615zLlbRJWVnXg%2FQ1KYu%2FU3eKhgvvHAgVOBdKy3eVWAFlKKfNUl9RRA59oIOpObL6We1MkAi%2FOYi3b7&scope=profile%20email%20openid&redirect_uri=https%3A%2F%2Faccounts.spotify.com%2Flogin%2Fgoogle%2Fredirect&service=lso&o2v=2&flowName=GeneralOAuthFlow";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnContinueWithGoogle.setForeground(Color.BLACK);
		btnContinueWithGoogle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContinueWithGoogle.setBackground(new Color(255, 255, 255));
		btnContinueWithGoogle.setBounds(274, 204, 331, 27);
		Login.getContentPane().add(btnContinueWithGoogle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.menu);
		separator_1.setBounds(151, 259, 213, 8);
		Login.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(SystemColor.menu);
		separator_1_1.setBounds(515, 259, 213, 8);
		Login.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OR");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(311, 252, 258, 15);
		Login.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email address or username");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(274, 277, 258, 23);
		Login.getContentPane().add(lblNewLabel_1_2);
		
		user = new JTextField();
		user.setBounds(274, 310, 331, 27);
		Login.getContentPane().add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Password");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_2.setBounds(274, 347, 258, 23);
		Login.getContentPane().add(lblNewLabel_1_2_2);
		
		password = new JPasswordField();
		password.setBounds(274, 380, 228, 27);
		Login.getContentPane().add(password);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
				      password.setEchoChar((char)0); //password = JPasswordField
				   } else {
					   password.setEchoChar('\u25cf');
				   }
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnNewRadioButton.setBackground(SystemColor.window);
		rdbtnNewRadioButton.setBounds(503, 383, 102, 21);
		Login.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot your password?");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String url_open ="https://accounts.spotify.com/en/password-reset?flow_id=22fda1f8-20d9-4a9f-8f00-0e29f127379a%3A1678093378";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		lblNewLabel_2.setBounds(274, 440, 137, 13);
		Login.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(274, 451, 130, 2);
		Login.getContentPane().add(separator_2);
		
		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.getText().endsWith("@students.national-u.edu.ph")) {
					if(password.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "You must enter a password.");
					} else {
						tuition tu = new tuition();
						tu.tWindow();
						Login.dispose();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Credentials.");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(50, 205, 50));
		btnNewButton_1.setBounds(520, 431, 85, 35);
		Login.getContentPane().add(btnNewButton_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBackground(SystemColor.menu);
		separator_1_2.setBounds(200, 489, 479, 8);
		Login.getContentPane().add(separator_1_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Don't have an account?");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_3.setBounds(311, 517, 258, 23);
		Login.getContentPane().add(lblNewLabel_1_2_3);
		
		JButton btnSignUpFor = new JButton("  SIGN UP FOR SPOTIFY");
		btnSignUpFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://www.spotify.com/ph-en/signup?flow_id=b9b53905-991c-4f53-95aa-23c1245c6126%3A1678095070&forward_url=https%3A%2F%2Fopen.spotify.com%2F";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnSignUpFor.setForeground(Color.GRAY);
		btnSignUpFor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSignUpFor.setBackground(Color.WHITE);
		btnSignUpFor.setBounds(274, 541, 331, 27);
		Login.getContentPane().add(btnSignUpFor);
	}
}
