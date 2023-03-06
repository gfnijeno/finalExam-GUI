package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class SignUp {

	public JFrame frame;
	private JTextField txtEnterYourEmail;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void sign() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 430, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6_2_2_1_1_1 = new JLabel("Enter a profile name.");
		lblNewLabel_6_2_2_1_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2_1_1_1.setBounds(89, 303, 151, 14);
		frame.getContentPane().add(lblNewLabel_6_2_2_1_1_1);
		
		JLabel lblNewLabel_6_2_2_1_1 = new JLabel("Create a password.");
		lblNewLabel_6_2_2_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2_1_1.setBounds(89, 263, 116, 14);
		frame.getContentPane().add(lblNewLabel_6_2_2_1_1);
		
		JLabel lblNewLabel_6_2_2_1 = new JLabel("Enter your email again.");
		lblNewLabel_6_2_2_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2_1.setBounds(89, 223, 151, 14);
		frame.getContentPane().add(lblNewLabel_6_2_2_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Enter your email.");
		lblNewLabel_6_2_2.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_2.setBounds(89, 183, 110, 14);
		frame.getContentPane().add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("YYYY");
		lblNewLabel_6_2_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2_1.setBounds(268, 386, 41, 14);
		frame.getContentPane().add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("DD");
		lblNewLabel_6_2.setForeground(SystemColor.textInactiveText);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(85, 386, 24, 14);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel = new JLabel("Sign up for free to start listening.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 40, 414, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Spotify");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 414, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up with Facebook");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(82, 76, 248, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up with Google");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(82, 105, 248, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator left_separator = new JSeparator();
		left_separator.setBounds(219, 135, 110, 2);
		frame.getContentPane().add(left_separator);
		
		JSeparator right_separator = new JSeparator();
		right_separator.setBounds(82, 135, 110, 2);
		frame.getContentPane().add(right_separator);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 128, 414, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sign up with your email address.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(82, 140, 248, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("What is your email?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(82, 160, 248, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setToolTipText("");
		txtEnterYourEmail.setForeground(new Color(192, 192, 192));
		txtEnterYourEmail.setBounds(82, 180, 248, 20);
		frame.getContentPane().add(txtEnterYourEmail);
		txtEnterYourEmail.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Confirm your email");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_1.setBounds(82, 200, 248, 24);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 220, 248, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Create a password");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_1_1.setBounds(82, 240, 248, 24);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 260, 151, 20);
		frame.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("What should we call you?");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_1_1_1.setBounds(82, 280, 248, 24);
		frame.getContentPane().add(lblNewLabel_4_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 300, 248, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("This appears on your profile.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(82, 320, 147, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2 = new JLabel("What's your date of birth?");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_2.setBounds(82, 340, 248, 24);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_6 = new JLabel("Day");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(82, 366, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(82, 383, 53, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("Month");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(146, 366, 46, 14);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Year");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1_1.setBounds(263, 366, 46, 14);
		frame.getContentPane().add(lblNewLabel_6_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(262, 383, 68, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("What's your gender?");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4_2_1.setBounds(82, 410, 248, 24);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNewRadioButton.setBounds(83, 430, 50, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnFemale.setBounds(140, 430, 65, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnNonbinary = new JRadioButton("Non-binary");
		rdbtnNonbinary.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNonbinary.setBounds(205, 430, 85, 23);
		frame.getContentPane().add(rdbtnNonbinary);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnOther.setBounds(289, 430, 53, 23);
		frame.getContentPane().add(rdbtnOther);
		
		JRadioButton rdbtnPreferNotTo = new JRadioButton("Prefer not to say");
		rdbtnPreferNotTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnPreferNotTo.setBounds(82, 450, 110, 23);
		frame.getContentPane().add(rdbtnPreferNotTo);
		
		JButton btnNewButton_2 = new JButton("Sign Up");
		btnNewButton_2.setBackground(new Color(50, 205, 50));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(162, 480, 90, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Have an account?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(140, 510, 100, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Log In.");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frame.dispose();
				// if the user clicked log-in, it goes back to log in page
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_8.setBounds(227, 509, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(SystemColor.textInactiveText);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(145, 382, 107, 21);
		frame.getContentPane().add(comboBox);
		
		JSeparator right_separator_1 = new JSeparator();
		right_separator_1.setBounds(227, 520, 35, 4);
		frame.getContentPane().add(right_separator_1);
		
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
		rdbtnNewRadioButton_1.setBounds(236, 260, 116, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
