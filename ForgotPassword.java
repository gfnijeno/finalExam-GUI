package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Toolkit;

public class ForgotPassword {

	public JFrame frmForgotPassword;
	private JTextField email;
	/**
	 * Launch the application.
	 */
	public static void fp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
					window.frmForgotPassword.setVisible(true);
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
		frmForgotPassword = new JFrame();
		frmForgotPassword.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\Downloads\\386381954011578368.png"));
		frmForgotPassword.setTitle("Forgot Password");
		frmForgotPassword.getContentPane().setBackground(new Color(255, 255, 255));
		frmForgotPassword.setBounds(100, 100, 542, 365);
		frmForgotPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmForgotPassword.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Reset");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 114, 528, 25);
		frmForgotPassword.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your Spotify username, or the email address that you");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(47, 149, 434, 14);
		frmForgotPassword.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("used to register. We'll send you an email with your username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(47, 165, 434, 14);
		frmForgotPassword.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("and a link to reset your password.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(47, 179, 434, 14);
		frmForgotPassword.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email address or username");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(124, 213, 140, 14);
		frmForgotPassword.getContentPane().add(lblNewLabel_3);
		
		email = new JTextField();
		email.setBounds(124, 228, 280, 20);
		frmForgotPassword.getContentPane().add(email);
		email.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(email.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "You must enter a valid email or username!");
				} else {
					JOptionPane.showMessageDialog(null, "We've sent you an email. Just follow the instructions to reset your password.");
				}
			}
		});
		btnNewButton.setBounds(146, 267, 82, 25);
		frmForgotPassword.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frmForgotPassword.dispose();
			}
		});
		btnBack.setBounds(299, 267, 82, 25);
		frmForgotPassword.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(127, 0, 273, 87);
		frmForgotPassword.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.menu);
		separator.setBounds(-176, 89, 880, 8);
		frmForgotPassword.getContentPane().add(separator);
	}

}
