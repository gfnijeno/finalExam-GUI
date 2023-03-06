package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class playlist {

	private JFrame frmPlaylistPicker;

	/**
	 * Launch the application.
	 */
	public static void list() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playlist window = new playlist();
					window.frmPlaylistPicker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public playlist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlaylistPicker = new JFrame();
		frmPlaylistPicker.getContentPane().setBackground(new Color(0, 0, 0));
		frmPlaylistPicker.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\murei\\Downloads\\Spotify_Logo_RGB_White (1).png"));
		lblNewLabel.setBounds(191, 20, 264, 71);
		frmPlaylistPicker.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setForeground(SystemColor.textInactiveText);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Playlists -", "Today's Top Hits", "big on the internet", "Classic Oldies", "Best of '00s Pop", "OPM 2000s(Batang 90s)"}));
		comboBox.setBounds(135, 156, 375, 33);
		frmPlaylistPicker.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Pick your playlist:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(135, 115, 141, 19);
		frmPlaylistPicker.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Classic Oldies")) {
					String url_open ="https://open.spotify.com/album/1VrravzsxruIeQf1cuE6zB";
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(comboBox.getSelectedItem().equals("Today's Top Hits")) {
					String url_open ="https://open.spotify.com/playlist/37i9dQZF1DXcBWIGoYBM5M";
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(comboBox.getSelectedItem().equals("big on the internet")) {
					String url_open ="https://open.spotify.com/playlist/37i9dQZF1DX5Vy6DFOcx00";
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(comboBox.getSelectedItem().equals("Best of '00s Pop")) {
					String url_open ="https://open.spotify.com/playlist/37i9dQZF1DWUaThf8nMdW6";
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(comboBox.getSelectedItem().equals("OPM 2000s(Batang 90s)")) {
					String url_open ="https://open.spotify.com/playlist/1RatVZEeiZzC7P785mVeWS";
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(162, 238, 114, 33);
		frmPlaylistPicker.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spotify sp = new spotify();
				sp.Login.setVisible(true);
				frmPlaylistPicker.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(363, 238, 114, 33);
		frmPlaylistPicker.getContentPane().add(btnBack);
		frmPlaylistPicker.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\Downloads\\386381954011578368.png"));
		frmPlaylistPicker.setTitle("Playlist Picker");
		frmPlaylistPicker.setBounds(100, 100, 660, 400);
		frmPlaylistPicker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
