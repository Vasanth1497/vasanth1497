package newlib;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create label for username
		JLabel userLabel = new JLabel();
		userLabel.setText("Username"); // set label value for textField1

		// create text field to get username from the user
		JTextField textField1 = new JTextField(15); // set length of the text

		// create label for password
		JLabel passLabel = new JLabel();
		passLabel.setText("Password"); // set label value for textField2

		// create text field to get password from the user
		JPasswordField textField2 = new JPasswordField(15); // set length for the password

		// create submit button
		JButton b1 = new JButton("SUBMIT"); // set label to button
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userValue = textField1.getText(); // get user entered username from the textField1
				String passValue = String.valueOf(textField2.getPassword()); // get user entered pasword from the textField2
				System.out.println(userValue);
				System.out.println(passValue);
				// check whether the credentials are authentic or not
				if (userValue.equals("user@gmail.com") && passValue.equals("password")) { // if authentic, navigate user to
																						// a new
																						// page

					// create instance of the NewPage
					NewPage page = new NewPage(userValue);

					// make page visible to the user
					page.getFrame().setVisible(true);

					// create a welcome label and set it to the new page

				} else {
					// show error message
					System.out.println("Please enter valid username and password");
				}

			}
		});

		// create panel to put form elements
		JPanel newPanel = new JPanel(new GridLayout(3, 1));
		newPanel.add(userLabel); // set username label to panel
		newPanel.add(textField1); // set text field to panel
		newPanel.add(passLabel); // set password label to panel
		newPanel.add(textField2); // set text field to panel
		newPanel.add(b1); // set button to panel

		// set border to panel
		frame.getContentPane().add(newPanel, BorderLayout.CENTER);

		// perform action on button click
//		b1.addActionListener((ActionListener) this); // add action listener to button
//		setTitle("LOGIN FORM"); // set title to the login form
	}

}
