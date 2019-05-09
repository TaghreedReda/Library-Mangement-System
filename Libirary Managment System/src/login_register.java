import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class login_register {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_register window = new login_register();
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
	public login_register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][grow][][][][][][][][][][][][grow][][][][][][][][][][]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblContents = new JLabel("Browse Contents :");
		lblContents.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblContents.setForeground(new Color(0, 0, 128));
		frame.getContentPane().add(lblContents, "cell 1 0");
		
		Button button = new Button("Admin");
		button.setBackground(new Color(248, 248, 255));
		button.setForeground(new Color(0, 0, 255));
		button.setFont(new Font("Ravie", Font.BOLD, 16));
		frame.getContentPane().add(button, "cell 31 0,alignx right,growy");
		
		JLabel lblBooks = new JLabel("Books");
		lblBooks.setForeground(new Color(0, 0, 139));
		lblBooks.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblBooks, "cell 1 2,alignx center");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(comboBox, "cell 2 2 23 1,growx");
		
		JButton btnBorrow = new JButton("Borrow");
		btnBorrow.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrow.setForeground(new Color(0, 0, 128));
		frame.getContentPane().add(btnBorrow, "cell 31 2");
		
		JLabel lblJournals = new JLabel("Journals");
		lblJournals.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblJournals.setForeground(new Color(0, 0, 128));
		frame.getContentPane().add(lblJournals, "cell 1 5,alignx center,aligny center");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		frame.getContentPane().add(comboBox_1, "cell 3 5 22 1,growx");
		
		JButton button_1 = new JButton("Borrow");
		button_1.setForeground(new Color(0, 0, 128));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(button_1, "cell 31 5");
		
		JLabel lblDigitalMedia = new JLabel("Digital Media");
		lblDigitalMedia.setForeground(new Color(0, 0, 128));
		lblDigitalMedia.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblDigitalMedia, "cell 1 8,alignx center,aligny center");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBackground(Color.WHITE);
		frame.getContentPane().add(comboBox_2, "cell 3 8 22 1,growx");
		
		JButton button_2 = new JButton("Borrow");
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(button_2, "cell 31 8");
		
		JButton btnReturnBorrowed = new JButton("Return \r\nBorrowed");
		btnReturnBorrowed.setBackground(new Color(248, 248, 255));
		btnReturnBorrowed.setForeground(new Color(0, 0, 255));
		btnReturnBorrowed.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReturnBorrowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnCheckBalance = new JButton("Check Balance");
		btnCheckBalance.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCheckBalance.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(btnCheckBalance, "cell 24 12,alignx center");
		frame.getContentPane().add(btnReturnBorrowed, "cell 24 13");
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
