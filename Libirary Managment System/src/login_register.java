import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;

public class login_register extends JFrame {
	public static String subid;
	Data  data = Data.getInstance();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_register frame = new login_register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login_register() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(135, 87, 171, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 149, 171, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Button button = new Button("Admin");
		button.setBounds(393, 10, 57, 26);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//((Window) contentPane).dispose();
				data.fillBorrowing();
				data.FillContent();
				data.fillLibraries();
				data.fillSubscribers();

				AdminControl adminp=new AdminControl();
				adminp.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		button.setBackground(new Color(248, 248, 255));
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Ravie", Font.BOLD, 15));
		contentPane.add(button);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblId.setBackground(new Color(0, 0, 102));
		lblId.setBounds(139, 58, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBackground(new Color(0, 0, 102));
		lblPassword.setBounds(135, 120, 115, 16);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.fillBorrowing();
				data.FillContent();
				data.fillLibraries();
				data.fillSubscribers();
				subid=textField.getText();
				SubscriberTab s=new SubscriberTab();
				 s.frmLibrariesManagmentSystem.setVisible(true);
				//open sub tab
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(162, 207, 108, 25);
		contentPane.add(btnNewButton);
	}
}
