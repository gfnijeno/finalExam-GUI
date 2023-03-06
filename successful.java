package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class successful {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void success() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					successful window = new successful();
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
	public successful() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Successful!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(86, 112, 263, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(175, 207, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnProceedToPlaylist = new JButton("Proceed to Playlist Picker");
		btnProceedToPlaylist.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnProceedToPlaylist.setBounds(111, 176, 214, 21);
		frame.getContentPane().add(btnProceedToPlaylist);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel_1.setBounds(73, 0, 289, 92);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
