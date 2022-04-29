import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProductPage");
		lblNewLabel.setBounds(174, 34, 108, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PID");
		lblNewLabel_1.setBounds(26, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(130, 81, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PNAME");
		lblNewLabel_2.setBounds(26, 153, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 149, 163, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PPRICE");
		lblNewLabel_3.setBounds(23, 219, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 214, 162, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("QUTY");
		lblNewLabel_4.setBounds(20, 277, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 274, 168, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String pid=textField.getText();
					//int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					String pprice=textField_2.getText();
					String quty=textField_3.getText();
					String str1="insert into product values('"+pid+"','"+pname+"','"+pprice+"','"+quty+"')";
					Class.forName("org.h2.Driver");
				    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/corejava11","sa","");
				    Statement stmt=conn.createStatement();
				    stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"Inserted!!!");
					
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton.setBounds(46, 344, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String p1=textField.getText();
					String str1="select * from product where pid='"+p1+"'";
					Class.forName("org.h2.Driver");
				    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/corejava11","sa","");
				    Statement stmt=conn.createStatement();
				    ResultSet rs=stmt.executeQuery(str1);
				    rs.next();
				    String p2=rs.getString(2);
				    String p3=rs.getString(3);
				    String p4=rs.getString(4);
				    textField_1.setText(p2);
				    textField_2.setText(p3);
				    textField_3.setText(p4);
				    JOptionPane.showMessageDialog(btnNewButton_1,"Searching!!!");
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_1.setBounds(167, 344, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String p1=textField.getText();
					String p2=textField_1.getText();
					String p3=textField_2.getText();
					String str2="update product set pname='"+p2+"',pprice='"+p3+"' where pid='"+p1+"'";
					Class.forName("org.h2.Driver");
				    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/corejava11","sa","");
				    Statement stmt=conn.createStatement();
				    stmt.executeUpdate(str2);
					JOptionPane.showMessageDialog(btnNewButton_2,"Updated!!!..");
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_2.setBounds(300, 344, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String p1=textField.getText();
					String str3="delete from product where pid='"+p1+"'";
					Class.forName("org.h2.Driver");
				    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/corejava11","sa","");
				    Statement stmt=conn.createStatement();
				    stmt.executeUpdate(str3);
					JOptionPane.showMessageDialog(btnNewButton_3,"OhhDeleted..!!!..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_3.setBounds(335, 268, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
