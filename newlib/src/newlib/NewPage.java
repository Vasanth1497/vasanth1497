package newlib;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewPage {

	private JFrame frame;
	private String username;

	public NewPage(String username) {
		database db = null;
		try {
			db = new database("root", "root");
			this.username = username;
			initialize(db);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the db
	 */

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(database db) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Welcome: " + this.username);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		
		
		JButton btnNewButton = new JButton("GetAllBooks");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<String> books = db.selectAllBooks();
					String[] listOfBooks = new String[books.size()];
					for(int i = 0; i < books.size(); i++) {
						listOfBooks[i] = books.get(i);
					}
					JComboBox<String> comboBox = new JComboBox<String>(listOfBooks);
					frame.getContentPane().add(comboBox, BorderLayout.CENTER);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
		});
		
		
		
		
		
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("customer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<String> customer = db.selectAllcustomer();
					String[] listOfcustomer = new  String[customer.size()];
					for(int i=0;i<customer.size();i++) {
						listOfcustomer[i] = customer.get(i);
					}
					JComboBox<String> comboBox = new JComboBox<String>(listOfcustomer);
					frame.getContentPane().add(comboBox, BorderLayout.CENTER);
					
			}
				catch(SQLException e2) {
					e2.printStackTrace();
					
				}}
		});
	
			
	
		
		
		
		
		
		
		frame.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
	
	}

}
