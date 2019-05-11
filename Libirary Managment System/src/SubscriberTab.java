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
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class SubscriberTab {

	private JFrame frmLibrariesManagmentSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 SubscriberTab  window = new  SubscriberTab ();
					window.frmLibrariesManagmentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public  SubscriberTab () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmLibrariesManagmentSystem = new JFrame();
		frmLibrariesManagmentSystem.setType(Type.UTILITY);
		frmLibrariesManagmentSystem.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmLibrariesManagmentSystem.setTitle("Libraries Managment System");
		frmLibrariesManagmentSystem.setResizable(false);
		frmLibrariesManagmentSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\SOMETHINGS\\icons\\Raindropmemory-Laboratory-Book.ico"));
		frmLibrariesManagmentSystem.setForeground(new Color(255, 255, 0));
		frmLibrariesManagmentSystem.getContentPane().setBackground(new Color(0, 0, 102));
		frmLibrariesManagmentSystem.setBounds(100, 100, 781, 553);
		frmLibrariesManagmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		JLabel lblBooks = new JLabel("Books");
		lblBooks.setBounds(71, 127, 64, 26);
		lblBooks.setForeground(new Color(255, 255, 0));
		lblBooks.setFont(new Font("Tahoma", Font.BOLD, 21));
		frmLibrariesManagmentSystem.getContentPane().add(lblBooks);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(253, 132, 250, 22);
		comboBox.setEditable(true);
		comboBox.setBackground(new Color(255, 255, 255));
		frmLibrariesManagmentSystem.getContentPane().add(comboBox);
		
		JButton btnBorrow = new JButton("Borrow");
		btnBorrow.setBounds(616, 128, 114, 25);
		btnBorrow.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrow.setForeground(new Color(0, 0, 128));
		frmLibrariesManagmentSystem.getContentPane().add(btnBorrow);
		
		JLabel lblJournals = new JLabel("Journals");
		lblJournals.setBounds(62, 228, 89, 26);
		lblJournals.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblJournals.setForeground(new Color(255, 255, 0));
		frmLibrariesManagmentSystem.getContentPane().add(lblJournals);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(253, 233, 250, 22);
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		frmLibrariesManagmentSystem.getContentPane().add(comboBox_1);
		
		JButton button_1 = new JButton("Borrow");
		button_1.setBounds(616, 232, 114, 25);
		button_1.setForeground(new Color(0, 0, 128));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmLibrariesManagmentSystem.getContentPane().add(button_1);
		
		JLabel lblDigitalMedia = new JLabel("Digital Media");
		lblDigitalMedia.setBounds(61, 334, 138, 26);
		lblDigitalMedia.setForeground(new Color(255, 255, 0));
		lblDigitalMedia.setFont(new Font("Tahoma", Font.BOLD, 21));
		frmLibrariesManagmentSystem.getContentPane().add(lblDigitalMedia);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(253, 339, 250, 22);
		comboBox_2.setEditable(true);
		comboBox_2.setBackground(Color.WHITE);
		frmLibrariesManagmentSystem.getContentPane().add(comboBox_2);
		
		JButton button_2 = new JButton("Borrow");
		button_2.setBounds(616, 338, 114, 25);
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmLibrariesManagmentSystem.getContentPane().add(button_2);
		
		JButton btnReturnBorrowed = new JButton("Return Borrowed");
		btnReturnBorrowed.setBounds(39, 440, 175, 27);
		btnReturnBorrowed.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmLibrariesManagmentSystem.getContentPane().add(btnReturnBorrowed);
		
		JButton btnCheckBalance = new JButton("Check Balance");
		btnCheckBalance.setBounds(313, 440, 161, 27);
		btnCheckBalance.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCheckBalance.setForeground(Color.BLACK);
		frmLibrariesManagmentSystem.getContentPane().add(btnCheckBalance);
		
		JButton btnCheckNotifications = new JButton("Check Notifications");
		btnCheckNotifications.setBounds(541, 440, 201, 27);
		btnCheckNotifications.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmLibrariesManagmentSystem.getContentPane().add(btnCheckNotifications);
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
