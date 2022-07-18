package newlib;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
//	void Main() {
//
//		// create label for username
//		userLabel = new JLabel();
//		userLabel.setText("Username"); // set label value for textField1
//
//		// create text field to get username from the user
//		textField1 = new JTextField(15); // set length of the text
//
//		// create label for password
//		passLabel = new JLabel();
//		passLabel.setText("Password"); // set label value for textField2
//
//		// create text field to get password from the user
//		textField2 = new JPasswordField(15); // set length for the password
//
//		// create submit button
//		b1 = new JButton("SUBMIT"); // set label to button
//
//		// create panel to put form elements
//		newPanel = new JPanel(new GridLayout(3, 1));
//		newPanel.add(userLabel); // set username label to panel
//		newPanel.add(textField1); // set text field to panel
//		newPanel.add(passLabel); // set password label to panel
//		newPanel.add(textField2); // set text field to panel
//		newPanel.add(b1); // set button to panel
//
//		// set border to panel
//		add(newPanel, BorderLayout.CENTER);
//
//		// perform action on button click
//		b1.addActionListener((ActionListener) this); // add action listener to button
//		setTitle("LOGIN FORM"); // set title to the login form
//	}
//
//	private void add(JPanel newPanel2, String center) {
//		// TODO Auto-generated method stub
//
//	}
//
//	private void setTitle(String string) {
//		// TODO Auto-generated method stub
//
//	}
//
////define abstract method actionPerformed() which will be called on button click   
//	public void actionPerformed(ActionEvent ae) // pass action listener as a parameter
//	{
//		String userValue = textField1.getText(); // get user entered username from the textField1
//		String passValue = textField2.getText(); // get user entered pasword from the textField2
//
//		// check whether the credentials are authentic or not
//		if (userValue.equals("test1@gmail.com") && passValue.equals("test")) { // if authentic, navigate user to a new
//																				// page
//
//			// create instance of the NewPage
//			NewPage page = new NewPage();
//
//			// make page visible to the user
//			page.setVisible(true);
//
//			// create a welcome label and set it to the new page
//			JLabel wel_label = new JLabel("Welcome: " + userValue);
//			page.getContentPane().add(wel_label);
//		} else {
//			// show error message
//			System.out.println("Please enter valid username and password");
//		}
//	}
//}
//
////create the main class  
//class LoginFormDemo {
////main() method start  
//	public static void main(String arg[]) {
//		try {
//			// create instance of the CreateLoginForm
//			NewPage form = new NewPage();
//			form.setSize(300, 100); // set size of the frame
//			form.setVisible(true); // make form visible to the user
//		} catch (Exception e) {
//			// handle exception
//			JOptionPane.showMessageDialog(null, e.getMessage());
//		}
//	}
//}
