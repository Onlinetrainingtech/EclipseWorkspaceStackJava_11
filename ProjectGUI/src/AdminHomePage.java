import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 24, 378, 226);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminHomePage");
		lblNewLabel.setBounds(147, 28, 114, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.setBounds(147, 66, 114, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("AddStaff");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(147, 117, 114, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("AddCategory");
		btnNewButton_2.setBounds(148, 169, 113, 23);
		panel.add(btnNewButton_2);
	}

}
