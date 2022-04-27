import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HR SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(155, 11, 105, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("UserLogin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				new UserLogin().setVisible(true);
			}
		});
		btnNewButton.setBounds(159, 69, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("AdminLogin");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new AdminLogin().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(159, 136, 116, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new Register().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(159, 211, 116, 23);
		contentPane.add(btnNewButton_2);
	}
}
