package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class tuition {

	private JFrame EnrollmentPage;
	private JTextField IDN;
	private JTextField first;
	private JTextField last;
	private JTextField tui;
	private JTextField misc;
	private JTextField total;
	

	/**
	 * Launch the application.
	 */
	public static void enroll() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tuition window = new tuition();
					window.EnrollmentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}); 
	} 

	/**
	 * Create the application.
	 */
	public tuition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		EnrollmentPage = new JFrame();
		EnrollmentPage.setTitle("Enrollment Page");
		EnrollmentPage.getContentPane().setBackground(Color.WHITE);
		EnrollmentPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\Downloads\\386381954011578368.png"));
		EnrollmentPage.setBounds(100, 100, 461, 665);
		EnrollmentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EnrollmentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enrollment Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(48, 114, 351, 64);
		EnrollmentPage.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(48, 188, 351, 430);
		EnrollmentPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel IDNLabel = new JLabel("ID Number:");
		IDNLabel.setForeground(SystemColor.textHighlightText);
		IDNLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		IDNLabel.setBounds(25, 33, 83, 13);
		panel.add(IDNLabel);
		
		JLabel firstLabel = new JLabel("First Name:");
		firstLabel.setForeground(Color.WHITE);
		firstLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		firstLabel.setBounds(25, 79, 83, 13);
		panel.add(firstLabel);
		
		JLabel lastLabel = new JLabel("Last Name:");
		lastLabel.setForeground(Color.WHITE);
		lastLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lastLabel.setBounds(25, 125, 83, 13);
		panel.add(lastLabel);
		
		JLabel studentypeLabel = new JLabel("Student Type:");
		studentypeLabel.setForeground(Color.WHITE);
		studentypeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		studentypeLabel.setBounds(25, 171, 112, 13);
		panel.add(studentypeLabel);
		
		JLabel courseLabel = new JLabel("Course:");
		courseLabel.setForeground(Color.WHITE);
		courseLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		courseLabel.setBounds(25, 217, 83, 13);
		panel.add(courseLabel);
		
		JLabel tuitionLabel = new JLabel("Tuition:");
		tuitionLabel.setForeground(Color.WHITE);
		tuitionLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tuitionLabel.setBounds(54, 263, 83, 13);
		panel.add(tuitionLabel);
		
		JLabel miscLabel = new JLabel("Miscellaneous:");
		miscLabel.setForeground(Color.WHITE);
		miscLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		miscLabel.setBounds(54, 281, 83, 13);
		panel.add(miscLabel);
		
		JComboBox type = new JComboBox();
		type.setForeground(SystemColor.textInactiveText);
		type.setModel(new DefaultComboBoxModel(new String[] {"- Choose Student type -", "Discounted (White)", "Discounted (Blue)", "Discounted (Gold)", "Continuing", "Walk-in"}));
		type.setBounds(119, 168, 196, 19);
		panel.add(type);
		
		JComboBox course = new JComboBox();
		course.setForeground(SystemColor.textInactiveText);
		course.setModel(new DefaultComboBoxModel(new String[] {"- Choose your Course -", "Tourism", "Computer Science", "Engineering", "Nursing", "Architecture"}));
		course.setBounds(119, 214, 196, 19);
		panel.add(course);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(54, 362, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IDN.setText(null);
				first.setText(null);
				last.setText(null);
				type.setSelectedIndex(0);
				course.setSelectedIndex(0);
			}
		});
		btnReset.setBounds(210, 362, 85, 21);
		panel.add(btnReset);
		
		IDN = new JTextField();
		IDN.setBounds(119, 30, 196, 19);
		panel.add(IDN);
		IDN.setColumns(10);
		
		first = new JTextField();
		first.setColumns(10);
		first.setBounds(119, 76, 196, 19);
		panel.add(first);
		
		last = new JTextField();
		last.setColumns(10);
		last.setBounds(119, 122, 196, 19);
		panel.add(last);
		
		tui = new JTextField();
		tui.setBounds(144, 263, 171, 13);
		panel.add(tui);
		tui.setColumns(10);
		
		misc = new JTextField();
		misc.setColumns(10);
		misc.setBounds(144, 281, 171, 13);
		panel.add(misc);
		
		JLabel totalFee = new JLabel("Total Fee:");
		totalFee.setForeground(Color.WHITE);
		totalFee.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalFee.setBounds(54, 325, 83, 13);
		panel.add(totalFee);
		
		total = new JTextField();
		total.setColumns(10);
		total.setBounds(144, 325, 171, 13);
		panel.add(total);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBack.setBounds(135, 399, 85, 21);
		panel.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_CMYK_Black (1).png"));
		lblNewLabel_2.setBounds(74, 10, 298, 117);
		EnrollmentPage.getContentPane().add(lblNewLabel_2);
		

	}
}
