package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SignUp {

	public JFrame frmSignUp;
	private JTextField email;
	private JPasswordField passwordField;
	private JTextField profile;
	private JTextField day;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void sign() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\Downloads\\386381954011578368.png"));
		frmSignUp.setTitle("Sign Up");
		frmSignUp.getContentPane().setBackground(new Color(255, 255, 255));
		frmSignUp.setBounds(100, 100, 430, 601);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6_2_2_1_1_1 = new JLabel("Enter a profile name.");
		lblNewLabel_6_2_2_1_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2_1_1_1.setBounds(88, 296, 151, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_2_2_1_1_1);
		
		JLabel lblNewLabel_6_2_2_1_1 = new JLabel("Create a password.");
		lblNewLabel_6_2_2_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2_1_1.setBounds(89, 239, 116, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_2_2_1_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Enter your email.");
		lblNewLabel_6_2_2.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2.setBounds(89, 183, 110, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("YYYY");
		lblNewLabel_6_2_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_1.setBounds(268, 386, 41, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("DD");
		lblNewLabel_6_2.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(85, 386, 24, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel = new JLabel("Sign up for free to start listening.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 40, 414, 24);
		frmSignUp.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Spotify");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 414, 30);
		frmSignUp.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up with Facebook");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://www.facebook.com/login.php?skip_api_login=1&api_key=174829003346&kid_directed_site=0&app_id=174829003346&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv7.0%2Fdialog%2Foauth%3Fclient_id%3D174829003346%26state%3DAQCIPwTnb8NgZkwcop7lbcgnqkNlBpNgMOlNxOkRKhYFJdYId5csafH08u0foXVvCageaq4hW1%252F0NZmd10dVR8R2lIFZQxaVXtONPNiKu%252Fe4Vazj6090RimsV3B4R3DpuLOS%252BUBXwB%252Bgtv7p9zMRqP2ojmQUtDHklurN47ytOv8wEZnx76zO6%252F9ikhO6MAp81Ig0yFZD2SzIMXCFDsXprd5TzQ0oofnpKuuu1pXn0bJio6yfjymGER3K9mEIqhxsHWbSI2fExQkwf4zuG9ZFXBBRWv%252FNCThVOcVj%252FFe2zaC4qyI9fXb%252Fk4kZwi4%252BZDcI86VaiUN%252FxclkYVLDcrtjnu8KPa2WXVIJobqMe017aLAoiBOLZCAFXic%253D%26redirect_uri%3Dhttps%253A%252F%252Faccounts.spotify.com%252Flogin%252Ffacebook%252Fredirect%252Fsignup%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D62832a9f-ab95-4f30-8ce8-4670f73c5134%26tp%3Dunspecified&cancel_url=https%3A%2F%2Faccounts.spotify.com%2Flogin%2Ffacebook%2Fredirect%2Fsignup%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DAQCIPwTnb8NgZkwcop7lbcgnqkNlBpNgMOlNxOkRKhYFJdYId5csafH08u0foXVvCageaq4hW1%252F0NZmd10dVR8R2lIFZQxaVXtONPNiKu%252Fe4Vazj6090RimsV3B4R3DpuLOS%252BUBXwB%252Bgtv7p9zMRqP2ojmQUtDHklurN47ytOv8wEZnx76zO6%252F9ikhO6MAp81Ig0yFZD2SzIMXCFDsXprd5TzQ0oofnpKuuu1pXn0bJio6yfjymGER3K9mEIqhxsHWbSI2fExQkwf4zuG9ZFXBBRWv%252FNCThVOcVj%252FFe2zaC4qyI9fXb%252Fk4kZwi4%252BZDcI86VaiUN%252FxclkYVLDcrtjnu8KPa2WXVIJobqMe017aLAoiBOLZCAFXic%253D%23_%3D_&display=page&locale=en_US&pl_dbl=0";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(82, 76, 248, 23);
		frmSignUp.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up with Google");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url_open ="https://accounts.google.com/o/oauth2/v2/auth/identifier?response_type=code&access_type=offline&client_id=1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com&state=AQCynYycCtOWbViLLsaJJAq9fOIXEIDsd9tJqJUWBYyp7pVHrHW6%2FZUZJ9Nh4Ft%2Fp%2FGeOM94wAwBL3YwSZs%2B5IcIkm5ScRwnH7Q5zBYY%2Bab6EiS5OdgMTMNuHsjaJSW76qWmDJfI0LCetzisCN6q7Ghpy%2B1nFZMWrdOPb%2Bd4TuhbNIbVH3H7U9uhDaQJSLXQAa25f631JIk2cZj16orpkYxWGvaj4avIJPJS%2BcQ%2B4Z7J8%2FDwVKfTf3fFxvZVqggoJyySd%2FC00rT8%2B2j3jXfcCo69pBweNPBJmm4YmhFAeS1%2Bvs3QZcpImsiZUBeqZAnglh3nWF%2FtnS34Ycn6X7S3U%2BqvJfrwTWMl0YzW%2BM6Q95srs15AwON6l3%2FxXft7vEuQeiNtRzaMcJxM0xV9Nw%3D%3D&scope=profile%20email%20openid&redirect_uri=https%3A%2F%2Faccounts.spotify.com%2Flogin%2Fgoogle%2Fredirect%2Fsignup&service=lso&o2v=2&flowName=GeneralOAuthFlow";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(82, 105, 248, 23);
		frmSignUp.getContentPane().add(btnNewButton_1);
		
		JSeparator left_separator = new JSeparator();
		left_separator.setBounds(219, 135, 110, 2);
		frmSignUp.getContentPane().add(left_separator);
		
		JSeparator right_separator = new JSeparator();
		right_separator.setBounds(82, 135, 110, 2);
		frmSignUp.getContentPane().add(right_separator);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 128, 414, 14);
		frmSignUp.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sign up with your email address.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(82, 140, 248, 14);
		frmSignUp.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("What is your email?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(82, 160, 248, 24);
		frmSignUp.getContentPane().add(lblNewLabel_4);
		
		email = new JTextField();
		email.setToolTipText("");
		email.setForeground(new Color(192, 192, 192));
		email.setBounds(82, 180, 248, 20);
		frmSignUp.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Create a password");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_1_1.setBounds(82, 216, 248, 24);
		frmSignUp.getContentPane().add(lblNewLabel_4_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 236, 151, 20);
		frmSignUp.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("What should we call you?");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_1_1_1.setBounds(82, 273, 248, 24);
		frmSignUp.getContentPane().add(lblNewLabel_4_1_1_1);
		
		profile = new JTextField();
		profile.setColumns(10);
		profile.setBounds(82, 293, 248, 20);
		frmSignUp.getContentPane().add(profile);
		
		JLabel lblNewLabel_5 = new JLabel("This appears on your profile.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(81, 313, 147, 14);
		frmSignUp.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2 = new JLabel("What's your date of birth?");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_2.setBounds(82, 340, 248, 24);
		frmSignUp.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_6 = new JLabel("Day");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(82, 366, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6);
		
		day = new JTextField();
		day.setColumns(10);
		day.setBounds(82, 383, 53, 20);
		frmSignUp.getContentPane().add(day);
		
		JLabel lblNewLabel_6_1 = new JLabel("Month");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(146, 366, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Year");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1_1.setBounds(263, 366, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6_1_1);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(262, 383, 68, 20);
		frmSignUp.getContentPane().add(year);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("What's your gender?");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_2_1.setBounds(82, 410, 248, 24);
		frmSignUp.getContentPane().add(lblNewLabel_4_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNewRadioButton.setBounds(83, 430, 50, 23);
		frmSignUp.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnFemale.setBounds(140, 430, 65, 23);
		frmSignUp.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnNonbinary = new JRadioButton("Non-binary");
		rdbtnNonbinary.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNonbinary.setBounds(205, 430, 85, 23);
		frmSignUp.getContentPane().add(rdbtnNonbinary);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnOther.setBounds(289, 430, 53, 23);
		frmSignUp.getContentPane().add(rdbtnOther);
		
		JRadioButton rdbtnPreferNotTo = new JRadioButton("Prefer not to say");
		rdbtnPreferNotTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnPreferNotTo.setBounds(82, 450, 110, 23);
		frmSignUp.getContentPane().add(rdbtnPreferNotTo);
		
		JButton btnNewButton_2 = new JButton("Sign Up");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(email.getText().isEmpty() || passwordField.getText().isEmpty() || profile.getText().isEmpty() || day.getText().isEmpty() || year.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must answer all fields.");
				} else {
					successful ss = new successful();
					ss.success();
					frmSignUp.dispose();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(50, 205, 50));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(162, 480, 90, 25);
		frmSignUp.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Have an account?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(140, 510, 100, 14);
		frmSignUp.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Log In.");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frmSignUp.dispose();
				// if the user clicked log-in, it goes back to log in page
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_8.setBounds(227, 509, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_8);
		
		JComboBox month = new JComboBox();
		month.setForeground(SystemColor.textInactiveText);
		month.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		month.setBounds(145, 382, 107, 21);
		frmSignUp.getContentPane().add(month);
		
		JSeparator right_separator_1 = new JSeparator();
		right_separator_1.setBounds(227, 520, 35, 4);
		frmSignUp.getContentPane().add(right_separator_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Show Password");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					passwordField.setEchoChar((char)0); //password = JPasswordField
				   } else {
					   passwordField.setEchoChar('\u25cf');
				   }
			}
		});
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(231, 236, 116, 21);
		frmSignUp.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
