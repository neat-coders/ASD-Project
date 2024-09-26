package app.ui.ccard;

import java.awt.*;
import javax.swing.*;
import app.creditcard.CreditCardFacadeImpl;

public class JDialogGenBill extends javax.swing.JDialog {

	public JDialogGenBill(Frame parent) {
		super(parent);

		// Initialize the components
		getContentPane().setLayout(null);
		setSize(405, 367);
		setVisible(false);

		// Create a JTextArea instead of JTextField for multi-line display
		JTextArea JTextArea1 = new JTextArea();
		JTextArea1.setLineWrap(true); // Enable line wrapping
		JTextArea1.setWrapStyleWord(true); // Wrap by word boundaries
		JTextArea1.setEditable(false); // Make it read-only

		JScrollPane JScrollPane1 = new JScrollPane(JTextArea1);
		getContentPane().add(JScrollPane1);
		JScrollPane1.setBounds(24, 24, 358, 240);

		// OK button
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(156, 276, 96, 24);

		// Generate the string for the monthly bill
		String billstring = CreditCardFacadeImpl.getInstance().generateMonthlyBill().stream()
				.map(this::formatTransaction)
				.reduce("", (a, b) -> a + b + "\n----------------------------------------\n"); // Add a separator between transactions
		JTextArea1.setText(billstring);

		// Register listeners
		SymAction lSymAction = new SymAction();
		JButton_OK.addActionListener(lSymAction);
	}

	public JDialogGenBill() {
		this((Frame) null);
	}

	// OK button
	javax.swing.JButton JButton_OK = new javax.swing.JButton();

	class SymAction implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event) {
			Object object = event.getSource();
			if (object == JButton_OK)
				JButtonOK_actionPerformed(event);
		}
	}

	void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
		dispose();
	}

	// Helper method to format the transaction details vertically
	private String formatTransaction(String transaction) {
		return transaction.replace(" Name=", "\nName: ")
				.replace(" Address=", "\nAddress: ")
				.replace(" CC number=", "\nCC number: ")
				.replace(" CC type=", "\nCC type: ")
				.replace(" Previous balance =", "\nPrevious balance: ")
				.replace(" Total Credits =", "\nTotal Credits: ")
				.replace(" Total Charges =", "\nTotal Charges: ")
				.replace(" New balance =", "\nNew balance: ")
				.replace(" Total amount due =", "\nTotal amount due: ")
				.trim();
	}
}
