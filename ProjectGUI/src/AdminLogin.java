import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 22, 387, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setBounds(158, 24, 77, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AdminName");
		lblNewLabel_1.setBounds(22, 64, 70, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(117, 61, 118, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pwd");
		lblNewLabel_2.setBounds(21, 117, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 114, 118, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(74, 180, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(210, 180, 89, 23);
		panel.add(btnNewButton_1);
	}

}
