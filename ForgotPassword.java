package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ForgotPassword {

	public JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void fp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
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
	public ForgotPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 542, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Reset");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 114, 528, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your Spotify username, or the email address that you");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(47, 149, 434, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("used to register. We'll send you an email with your username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(47, 165, 434, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("and a link to reset your password.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(47, 179, 434, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email address or username");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(124, 213, 140, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(124, 228, 280, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(146, 267, 82, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(299, 267, 82, 25);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(127, 0, 273, 87);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.menu);
		separator.setBounds(-176, 89, 880, 8);
		frame.getContentPane().add(separator);
	}

}
