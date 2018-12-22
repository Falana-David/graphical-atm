package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private JTextField accountField;
	private ViewManager manager;
	private JButton creatorButton;
	private JButton cancelButton;
	/**
	 * Constructs an instance (or object) of the CreateView class.
	 * 
	 * @param manager
	 */
	
	public CreateView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the CreateView components.
	 */
	
	private void initialize() {
		initOption();
		initButtons();
		//initUpdate();
		
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the CreateView.
		
		this.add(new javax.swing.JLabel("CreateView", javax.swing.SwingConstants.CENTER));
		
		// TODO
		//
		// this is where you should build the CreateView (i.e., all the components that
		// allow the user to enter his or her information and create a new account).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	
/*	private void initUpdate(Connection con, String dbName) {
		// TODO Auto-generated method stub
		Statement stmt = null;
		String query = null;;

		try {
	        stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            String first_name = rs.getString(first_name);
	            String last_name = rs.getString(last_name);
	            String dob = rs.getString(dob);
	            int phone_number = rs.getInt(phone_number);
	            String address = rs.getString(address);
	            String city = rs.getString(city);
	            String state = rs.getString(state);
	            int postal_code = rs.getInt(postal_code);
	            int pin = rs.getInt(pin);
	         
	            System.out.println(first_name + "\t" + last_name + dob + "\t" + phone_number + "\t" + address + "\t" + city + "\t" + state + "\t" + postal_code );
	        }
		}finally {
	        if (stmt != null) { try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
	    }

	    } catch (SQLException e ) {
	        JDBCTutorialUtilities.printSQLException(e);
	    } finally {
	        if (stmt != null) { stmt.close(); }
	    }

	}*/

	private void initButtons() {
		// TODO Auto-generated method stub
		Button creatorButton = new Button("Create Account:");
		creatorButton.addActionListener(this);
		add(creatorButton);
        
        Button cancelButton = new Button("Cancel Account:");
        cancelButton.addActionListener(this);
        add(cancelButton);
	}

	private void initOption() {
		// TODO Auto-generated method stub
		 /*first_name = new JFrame("First Name:"); 
		 add(first_name);*/
		
		 
		 //JTextField first_name = null, last_name = null, dob = null, phone_number = null, address = null, city = null, state = null, postal_code = null, pin = null;  
		 
		 JLabel first_name = new JLabel("First Name:", SwingConstants.RIGHT);
		 first_name.setLabelFor(accountField);
		 first_name.setBounds(50,100, 200,30); 
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 100, 200, 35);
		 this.add(first_name);
		 this.add(accountField);
		 
		 JLabel last_name = new JLabel("Last Name:", SwingConstants.RIGHT);
		 last_name.setLabelFor(accountField);
		 last_name.setBounds(50,150, 200,30);
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 140, 200, 35);
		 this.add(last_name);
		 this.add(accountField);
		 
		 JLabel dob = new JLabel("Date Of Birth:", SwingConstants.RIGHT);
		 dob.setLabelFor(accountField);
		 dob.setBounds(50,200, 200,30);
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 180, 200, 35);
		 this.add(dob);
		 this.add(accountField);
		 
		 JLabel phone_number = new JLabel("Phone Number:", SwingConstants.RIGHT);
		 phone_number.setLabelFor(accountField);
		 phone_number.setBounds(50,250, 200,30);
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 220, 200, 35);
		 this.add(phone_number);
		 this.add(accountField);
		 
		 
		 JLabel address = new JLabel("Address:", SwingConstants.RIGHT);
		 address.setLabelFor(accountField);
		 address.setBounds(50,300, 200,30); 
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 260, 200, 35);
		 this.add(address);
		 this.add(accountField);
		 
		 JLabel city = new JLabel("City:", SwingConstants.RIGHT);
		 city.setLabelFor(accountField);
		 city.setBounds(50,350, 200,30);
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 300, 200, 35);
		 this.add(city);
		 this.add(accountField);
		 
		 JLabel state = new JLabel("State:", SwingConstants.RIGHT);
		 state.setLabelFor(accountField);
		 state.setBounds(50,400, 200,30); 
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 320, 200, 35);
		 this.add(state);
		 this.add(accountField);
		 
		 JLabel postal_code = new JLabel("Postal Code:", SwingConstants.RIGHT);
		 postal_code.setLabelFor(accountField);
		 postal_code.setBounds(50,450, 200,30); 
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 360, 200, 35);
		 this.add(postal_code);
		 this.add(accountField);
		 
		 JLabel pin = new JLabel("Desired PIN:", SwingConstants.RIGHT);
		 pin.setLabelFor(accountField);
		 pin.setFont(new Font("DialogInput", Font.BOLD, 14));
		// pin = new JPasswordField(20);
		 pin.setBounds(50,500, 500,30);
		 accountField = new JTextField(20);
		 accountField.setBounds(205, 400, 200, 35);
		 this.add(pin);
		 this.add(accountField);
		 
		 /*this.add(first_name);
		 this.add(last_name);
		 this.add(dob);
		 this.add(phone_number);
		 this.add(address);
		 this.add(state);
		 this.add(city);
		 this.add(postal_code);
		 this.add(pin);
		 this.add(accountField);*/
		 
		 
	}

	/*
	 * CreateView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The CreateView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the CreateView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source.equals(creatorButton)) {
    	manager.switchTo(ATM.HOME_VIEW);
		} 
			else if (source.equals(cancelButton)) {
		    	manager.switchTo(ATM.LOGIN_VIEW);
				} else 
					manager.switchTo(ATM.LOGIN_VIEW);
    
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}
