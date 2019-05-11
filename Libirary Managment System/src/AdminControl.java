import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AdminControl extends JFrame {

	private JPanel contentPane;
	private JTextField libAddF;
	private JTextField brSUBid;
	private JTextField brItemID;
	private JTextField fee;
	private JTextField brDate;
	private JTextField retDate;
	private JTextField subBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminControl frame = new AdminControl();
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
	public AdminControl() {
		setTitle("Admin Panel");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setForeground(new Color(0, 0, 102));
		contentPane.setLayout(null);
		 contentPane.setLayout(null);
		
		JLabel label = new JLabel("Subscriber");
		label.setBounds(34, 13, 133, 21);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(label);
		
		JLabel lblContent = new JLabel("Content");
		lblContent.setBounds(280, 0, 68, 47);
		lblContent.setForeground(new Color(255, 255, 0));
		lblContent.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblContent);
		
		JLabel  lblLibrary = new JLabel("Library");
		lblLibrary.setBounds(575, 13, 60, 21);
		lblLibrary.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLibrary.setForeground(new Color(255, 255, 0));
		contentPane.add(lblLibrary);
		
		JLabel lblTitle = new JLabel("Title :");
		lblTitle.setBounds(273, 103, 36, 16);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitle.setForeground(new Color(255, 255, 255));
		contentPane.add(lblTitle);
		
		JTextField IDlibField = new JTextField();
		IDlibField.setBounds(560, 79, 116, 22);
		contentPane.add(IDlibField);
		IDlibField.setColumns(10);
		
		JTextField namelibField = new JTextField();
		namelibField.setBounds(560, 120, 116, 22);
		contentPane.add(namelibField);
		namelibField.setColumns(10);
		
		JTextField titleField = new JTextField();
		titleField.setBounds(273, 120, 133, 22);
		contentPane.add(titleField);
		titleField.setColumns(10);
		
		JTextField subID = new JTextField();
		subID.setBounds(24, 79, 133, 22);
		contentPane.add(subID);
		subID.setColumns(10);
	    
		JTextField authorField = new JTextField();
		authorField.setBounds(273, 167, 133, 22);
		authorField.setColumns(10);
		contentPane.add(authorField);
		
		JTextField publisherField = new JTextField();
		publisherField.setBounds(273, 213, 133, 22);
		publisherField.setColumns(10);
		contentPane.add(publisherField);
		
		JTextField libIDField = new JTextField();
		libIDField.setBounds(274, 259, 132, 22);
		libIDField.setColumns(10);
		contentPane.add(libIDField);
		
		JTextField contIDField = new JTextField();
		contIDField.setBounds(273, 304, 133, 22);
		contIDField.setColumns(10);
		contentPane.add(contIDField);
		
		JTextField ProductionYearField = new JTextField();
		ProductionYearField.setBounds(273, 350, 133, 22);
		ProductionYearField.setColumns(10);
		contentPane.add(ProductionYearField);
		
		JTextField copiesField = new JTextField();
		copiesField.setBounds(274, 390, 132, 22);
		contentPane.add(copiesField);
		copiesField.setColumns(10);
		
	    JRadioButton rdbtnAdd = new JRadioButton("Add");
	    
		rdbtnAdd.setBounds(8, 418, 65, 25);
		rdbtnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnAdd.setForeground(new Color(255, 255, 255));
		rdbtnAdd.setBackground(new Color(0, 0, 102));
		contentPane.add(rdbtnAdd);
		
	    JRadioButton rdbtnEdit = new JRadioButton("Edit");
		rdbtnEdit.setBounds(8, 448, 55, 25);
		rdbtnEdit.setForeground(new Color(255, 255, 255));
		rdbtnEdit.setBackground(new Color(0, 0, 102));
		rdbtnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnEdit);
		
	    JRadioButton rdbtnRemove = new JRadioButton("Remove");
		rdbtnRemove.setBounds(8, 479, 85, 25);
		rdbtnRemove.setBackground(new Color(0, 0, 102));
		rdbtnRemove.setForeground(new Color(255, 255, 255));
		rdbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnRemove);
		
		 JButton btnDone = new JButton("Done");
		 btnDone.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		
		btnDone.setBounds(241, 480, 105, 25);
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnDone);
		
		 JLabel lblCategory = new JLabel("Category :");
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategory.setBounds(273, 60, 75, 16);
		contentPane.add(lblCategory);
		
JComboBox comboBox = new JComboBox();
		
		comboBox.addItem("Book");
		comboBox.addItem("Article in a Journal");
		comboBox.addItem("Digital Media");
		comboBox.setBounds(273, 79, 133, 22);
		contentPane.add(comboBox);
		
		
		
	    JLabel lblPublisher = new JLabel("Publisher :");
		lblPublisher.setForeground(Color.WHITE);
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPublisher.setBounds(273, 188, 75, 16);
		contentPane.add(lblPublisher);
		
		JLabel lblAuthor = new JLabel("Author :");
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAuthor.setBounds(273, 143, 75, 16);
		contentPane.add(lblAuthor);
		
		 JLabel lblLibraryId = new JLabel("Library ID :");
		lblLibraryId.setForeground(Color.WHITE);
		lblLibraryId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLibraryId.setBounds(273, 235, 75, 16);
		contentPane.add(lblLibraryId);
		
	    JLabel lblItemId = new JLabel("Item ID :");
		lblItemId.setForeground(Color.WHITE);
		lblItemId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblItemId.setBounds(273, 286, 75, 16);
		contentPane.add(lblItemId);
		
		JLabel lblProductionYear = new JLabel("Production Year :");
		lblProductionYear.setForeground(Color.WHITE);
		lblProductionYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductionYear.setBounds(273, 328, 117, 16);
		contentPane.add(lblProductionYear);
		
		JLabel lblCopies = new JLabel("Copies :");
		lblCopies.setForeground(Color.WHITE);
		lblCopies.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCopies.setBounds(273, 371, 75, 16);
		contentPane.add(lblCopies);
		
		JTextField subname = new JTextField();
		subname.setColumns(10);
		subname.setBounds(24, 120, 133, 22);
		contentPane.add(subname);
		
		JTextField subadd = new JTextField();
		subadd.setColumns(10);
		subadd.setBounds(24, 213, 133, 22);
		contentPane.add(subadd);
		
		JTextField subphone = new JTextField();
		subphone.setColumns(10);
		subphone.setBounds(24, 259, 133, 22);
		contentPane.add(subphone);
		
		JTextField subemail = new JTextField();
		subemail.setColumns(10);
		subemail.setBounds(24, 304, 133, 22);
		contentPane.add(subemail);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(560, 55, 75, 16);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(560, 103, 75, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(24, 286, 75, 16);
		contentPane.add(lblEmail);
		
		JLabel lblId_1 = new JLabel("ID :");
		lblId_1.setForeground(Color.WHITE);
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId_1.setBounds(24, 60, 75, 16);
		contentPane.add(lblId_1);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setForeground(Color.WHITE);
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName_1.setBounds(24, 103, 75, 16);
		contentPane.add(lblName_1);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBounds(24, 143, 75, 16);
		contentPane.add(lblType);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(24, 188, 75, 16);
		contentPane.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhone.setBounds(24, 235, 75, 16);
		contentPane.add(lblPhone);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Regular");
		comboBox_1.addItem("Golden");
		comboBox_1.setBounds(24, 167, 133, 22);
		contentPane.add(comboBox_1);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 13));
		back.setBounds(376, 480, 105, 25);
		contentPane.add(back);
		
		JLabel libAdd = new JLabel("Address :");
		libAdd.setForeground(Color.WHITE);
		libAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		libAdd.setBounds(560, 143, 75, 16);
		contentPane.add(libAdd);
		
		libAddF = new JTextField();
		libAddF.setColumns(10);
		libAddF.setBounds(560, 167, 116, 22);
		contentPane.add(libAddF);
		
		JCheckBox subCB = new JCheckBox("");
		subCB.setBackground(new Color(0, 0, 102));
		subCB.setBounds(132, 9, 25, 25);
		contentPane.add(subCB);
		
		JCheckBox ContCB = new JCheckBox("");
		ContCB.setBackground(new Color(0, 0, 102));
		ContCB.setBounds(356, 13, 25, 25);
		contentPane.add(ContCB);
		
		JCheckBox LibCB = new JCheckBox("");
		LibCB.setBackground(new Color(0, 0, 102));
		LibCB.setBounds(643, 13, 25, 25);
		contentPane.add(LibCB);
		
		JLabel lblBorrowingRecord = new JLabel("Borrowing Record");
		lblBorrowingRecord.setForeground(Color.YELLOW);
		lblBorrowingRecord.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBorrowingRecord.setBounds(512, 202, 162, 21);
		contentPane.add(lblBorrowingRecord);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBackground(new Color(0, 0, 102));
		checkBox.setBounds(682, 202, 25, 25);
		contentPane.add(checkBox);
		
		JLabel lblSubscriberId = new JLabel("Subscriber ID :");
		lblSubscriberId.setForeground(Color.WHITE);
		lblSubscriberId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubscriberId.setBounds(560, 235, 96, 16);
		contentPane.add(lblSubscriberId);
		
		JTextField brSUBid = new JTextField();
		brSUBid.setColumns(10);
		brSUBid.setBounds(560, 259, 116, 22);
		contentPane.add(brSUBid);
		
		JLabel label_1 = new JLabel("Item ID :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(560, 286, 75, 16);
		contentPane.add(label_1);
		
		JTextField brItemID = new JTextField();
		brItemID.setColumns(10);
		brItemID.setBounds(558, 304, 118, 22);
		contentPane.add(brItemID);
		
		JLabel lblFee = new JLabel("Fee :");
		lblFee.setForeground(Color.WHITE);
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFee.setBounds(560, 328, 75, 16);
		contentPane.add(lblFee);
		
		JTextField fee = new JTextField();
		fee.setColumns(10);
		fee.setBounds(560, 350, 116, 22);
		contentPane.add(fee);
		
		JLabel lblBorrowingDate = new JLabel("Borrowing Date :");
		lblBorrowingDate.setForeground(Color.WHITE);
		lblBorrowingDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBorrowingDate.setBounds(560, 371, 116, 16);
		contentPane.add(lblBorrowingDate);
		
		JTextField brDate = new JTextField();
		brDate.setColumns(10);
		brDate.setBounds(560, 390, 116, 22);
		contentPane.add(brDate);
		
		JLabel lblDate = new JLabel(" Return Date :");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(560, 418, 116, 16);
		contentPane.add(lblDate);
		
		JTextField retDate = new JTextField();
		retDate.setColumns(10);
		retDate.setBounds(560, 439, 116, 22);
		contentPane.add(retDate);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBalance.setBounds(24, 328, 75, 16);
		contentPane.add(lblBalance);
		
		JTextField subBalance = new JTextField();
		subBalance.setColumns(10);
		subBalance.setBounds(24, 350, 133, 22);
		contentPane.add(subBalance);
		
		Admin admin= new Admin();
		String category = comboBox.getSelectedItem().toString();
		String type =comboBox_1.getSelectedItem().toString();
		BorrowingRecord borrowingRec =new BorrowingRecord();
		
		rdbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    		rdbtnEdit.setEnabled(false);
	    		rdbtnRemove.setEnabled(false);
	    		
	    	}
	    });
		rdbtnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAdd.setEnabled(false);
	    		rdbtnRemove.setEnabled(false);
	    		
	    	}
	    });
		rdbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    		rdbtnEdit.setEnabled(false);
	    		rdbtnAdd.setEnabled(false);
	    		
	    	}
	    });
			 btnDone.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		if (rdbtnAdd.isSelected()) {
			 			if(LibCB.isSelected()) {
			 			admin.addLibrary(IDlibField.getText(),namelibField.getText(), libAddF.getText());
			 			}
			 			if(ContCB.isSelected()) {
			 			admin.addContent(contIDField.getText(), category,titleField.getText(), authorField.getText(),
			 					publisherField.getText(), libIDField.getText(), ProductionYearField.getText(), copiesField.getText());
			 			}
			 			if (subCB.isSelected()) {
			 				admin.addSubscriber(subadd.getText(), subphone.getText(), subemail.getText(), subID.getText(), subBalance.getText(), type);
			 			}
			 		}
			 		else if (rdbtnRemove.isSelected()) {
			 			if(LibCB.isSelected()) {
				 			admin.removeLibrary(IDlibField.getText());
				 			}
				 			if(ContCB.isSelected()) {
				 			admin.removeContent(contIDField.getText(), libIDField.getText());
				 			}
				 			if (subCB.isSelected()) {
				 				admin.removeSubscriber(subID.getText());
				 			}
			 		}
			 		
			 		else if (rdbtnEdit.isSelected()) {
			 			if(LibCB.isSelected()) {
				 			admin.editLibrary(IDlibField.getText(),namelibField.getText(), libAddF.getText());
				 			}
				 			if(ContCB.isSelected()) {
				 			admin.editContent(contIDField.getText(), category,titleField.getText(), authorField.getText(),
				 					publisherField.getText(), libIDField.getText(), ProductionYearField.getText(), copiesField.getText());
				 			}
				 			if (subCB.isSelected()) {
				 				admin.editSubscriber(subadd.getText(), subphone.getText(), subemail.getText(), subID.getText(), subBalance.getText(), type);
				 			}
			 		}
			 		
			 		/*try {
						borrowingRec.calculateFee(brSUBid.getText(), brDate.getText() ,retDate.getText());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
			 	}
			 });
	}
}
