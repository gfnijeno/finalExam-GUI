package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class resetPassword {

	public JFrame resetFrame;
	private final JSeparator separator = new JSeparator();
	private JPasswordField password;
	private JPasswordField rpassword;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void reset() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resetPassword window = new resetPassword();
					window.resetFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public resetPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the resetFrame.
	 */
	private void initialize() {
		resetFrame = new JFrame();
		resetFrame.getContentPane().setBackground(new Color(255, 255, 255));
		resetFrame.setBounds(100, 100, 657, 423);
		resetFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resetFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel.setBounds(205, 0, 232, 99);
		resetFrame.getContentPane().add(lblNewLabel);
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(0, 93, 643, 2);
		resetFrame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Password Reset");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_1.setBounds(114, 93, 414, 56);
		resetFrame.getContentPane().add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(110, 196, 423, 30);
		resetFrame.getContentPane().add(password);
		
		rpassword = new JPasswordField();
		rpassword.setBounds(110, 265, 423, 30);
		resetFrame.getContentPane().add(rpassword);
		
		JLabel lblNewLabel_2 = new JLabel("New Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(113, 173, 161, 13);
		resetFrame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Repeat New Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(110, 242, 161, 13);
		resetFrame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Arrays.equals(password.getPassword(), rpassword.getPassword())) {
					   JOptionPane.showMessageDialog(null, "Passwords do not match.", "Woops", JOptionPane.ERROR_MESSAGE);
					} else if(password.getText().isEmpty() && rpassword.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "You must enter a new password!", "Woops", JOptionPane.ERROR_MESSAGE);
					}
				else {
						JOptionPane.showMessageDialog(null, "Password Reset Successful!\n Click 'OK' to return to Log In.");
						spotify sp = new spotify();
						sp.Login.setVisible(true);
						resetFrame.dispose();
					}
			}
		});
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(383, 325, 85, 30);
		resetFrame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotPassword fr = new ForgotPassword();
				fr.fp();
				resetFrame.dispose();
			}
		});
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setBounds(174, 325, 85, 30);
		resetFrame.getContentPane().add(btnBack);
	}
}
