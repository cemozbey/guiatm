package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ATM_Sys {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Sys window = new ATM_Sys();
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
	public ATM_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(516, 433, 406, 287);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 11, 89, 58);
		panel_3.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(109, 11, 89, 58);
		panel_3.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(208, 11, 89, 58);
		panel_3.add(button_1);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBackground(new Color(0, 255, 0));
		btnEnter.setForeground(new Color(0, 0, 0));
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnter.setBounds(307, 11, 89, 58);
		panel_3.add(btnEnter);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(new Color(255, 255, 255));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(10, 80, 89, 58);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.setBackground(new Color(255, 255, 255));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(10, 149, 89, 58);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.setBackground(new Color(255, 255, 255));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(109, 149, 89, 58);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.setBackground(new Color(255, 255, 255));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(208, 149, 89, 58);
		panel_3.add(button_6);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(307, 149, 89, 58);
		panel_3.add(btnCancel);
		
		JButton button_9 = new JButton("0");
		button_9.setBackground(new Color(255, 255, 255));
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(155, 218, 89, 58);
		panel_3.add(button_9);
		
		JButton button_12 = new JButton("5");
		button_12.setBackground(new Color(255, 255, 255));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(109, 80, 89, 58);
		panel_3.add(button_12);
		
		JButton button_13 = new JButton("6");
		button_13.setBackground(new Color(255, 255, 255));
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(208, 80, 89, 58);
		panel_3.add(button_13);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(255, 255, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBounds(307, 80, 89, 58);
		panel_3.add(btnClear);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 11, 1360, 411);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(506, 255, 409, 145);
		panel_4.add(panel_1);
		panel_1.setBackground(Color.RED);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(118, 11, 171, 123);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(301, 0, 108, 145);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnDepost = new JButton("DEPOSIT");
		btnDepost.setForeground(new Color(255, 255, 255));
		btnDepost.setBackground(new Color(0, 0, 0));
		btnDepost.setBounds(10, 80, 89, 58);
		panel_2.add(btnDepost);
		
		JButton btnLoan = new JButton("LOAN");
		btnLoan.setForeground(new Color(255, 255, 255));
		btnLoan.setBackground(new Color(0, 0, 0));
		btnLoan.setBounds(10, 11, 89, 58);
		panel_2.add(btnLoan);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 145);
		panel_1.add(panel);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		JButton btnWthdraw = new JButton("WITHDRAW");
		btnWthdraw.setForeground(new Color(255, 255, 255));
		btnWthdraw.setBackground(new Color(0, 0, 0));
		btnWthdraw.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnWthdraw.setBounds(10, 80, 89, 58);
		panel.add(btnWthdraw);
		
		JButton btnBalance = new JButton("BALANCE");
		btnBalance.setBackground(new Color(0, 0, 0));
		btnBalance.setForeground(new Color(255, 255, 255));
		btnBalance.setBounds(10, 11, 89, 58);
		panel.add(btnBalance);
	}
}
