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

public class tuition {

	private JFrame frame;
	private JTextField IDN;
	private JTextField first;
	private JTextField last;
	private JTextField tui;
	private JTextField misc;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void tWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tuition window = new tuition();
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
	public tuition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\Downloads\\DMfySyTVwAAPRcd-removebg-preview.png"));
		frame.setBounds(100, 100, 461, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enrollment Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(48, 27, 351, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(48, 101, 351, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Number:");
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 33, 83, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(25, 79, 83, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(25, 125, 83, 13);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Student Type:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(25, 171, 112, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Course:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(25, 217, 83, 13);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Tuition:");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1.setBounds(54, 263, 83, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Miscellaneous:");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(54, 281, 83, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Total Fee:");
		lblNewLabel_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(54, 325, 83, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 325, 171, 13);
		panel.add(textField);
		

	}
}
