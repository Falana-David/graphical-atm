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
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.Calendar;
import java.util.Date;


//import controller.ViewManager;
import data.Database;
import controller.ViewManager;
//import data.Database;
import model.BankAccount;
import model.User;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	//private JTextField accountField;
	public User user;
	public BankAccount bankAccount;
	private ViewManager manager;
	private JButton creatorButton;
	private JButton cancelButton;
	private JTextField first_name;
	private JTextField last_name;
	private JTextField dob;
	public JTextField phone_number;
	public JTextField phone_number2;
	public JTextField phone_number3;
	private JTextField address;
	private JTextField city;
	private JComboBox state;
	private JTextField postal_code;
	private JPasswordField pinField;
	public JComboBox<?> Dates;
	public JComboBox<?> Month;
	public JComboBox<?> Year;
	private long Number;
	
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
		this.setLayout(null);
		//initOption();
		initButtons();
		initfirst_name();
		initlast_name();
		initdob();
		initpostal_code();
		initcity();
		initstate();
		initphone_number();
		initaddress();
		initPinField();
		
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
	
	private void initfirst_name() {
		// TODO Auto-generated method stub
	JLabel label = new JLabel("First Name:", SwingConstants.RIGHT);
	label.setBounds(100, 100, 95, 35);
	label.setLabelFor(first_name);
	label.setFont(new Font("DialogInput", Font.BOLD, 14));

	first_name = new JTextField(20);
	first_name.setBounds(205, 100, 200, 35);

	this.add(label);
	this.add(first_name);
	}
	
	private void initlast_name() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("Last Name:", SwingConstants.RIGHT);
		label.setBounds(100, 140, 95, 35);
		label.setLabelFor(last_name);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		last_name = new JTextField(20);
		last_name.setBounds(205, 140, 200, 35);

		this.add(label);
		this.add(last_name);
	}
	
	private void initdob() {
		// TODO Auto-generated method stub
	JLabel label = new JLabel("Date of Birth:", SwingConstants.RIGHT);
	label.setBounds(100, 180, 95, 35);
	label.setLabelFor(dob);
	label.setFont(new Font("DialogInput", Font.BOLD, 14));

	/*dob = new JTextField(20);
	dob.setBounds(205, 180, 200, 35);
*/
	this.add(label);
	//this.add(dob);
	
	 /*JXDatePicker picker = new JXDatePicker();
     picker.setDate(Calendar.getInstance().getTime());
     picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));

     panel.add(picker);*/
	
	/*UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
	 
	frame.add(datePicker);*/
	//JLabel dob = new JLabel("Date:");
	//dob.setBounds(105, 120, 100, 35);
	String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			 "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
			 "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
			 "31"};
	String[] months = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};
	String[] years = new String[109];
	int n = 1910;
	for(int i = 0; i <= 108; i++){
		years[i] = String.valueOf(n);
		n++;
	}

	Dates = new JComboBox<Object>(days);
	Dates.setBounds(205, 180, 60, 35);
	Month = new JComboBox<Object>(months);
	Month.setBounds(275, 180, 60, 35);
	Year = new JComboBox<Object>(years);
	Year.setBounds(345, 180, 60, 35);
	this.add(Dates);

	this.add(Month);

	this.add(Year);
	}

	private void initpostal_code() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("Postal Code:", SwingConstants.RIGHT);
		label.setBounds(100, 220, 95, 35);
		label.setLabelFor(postal_code);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
	
		postal_code = new JTextField(20);
		postal_code.setBounds(205, 220, 200, 35);
	
		this.add(label);
		this.add(postal_code);
	}

	private void initcity() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("City:", SwingConstants.RIGHT);
		label.setBounds(100, 260, 95, 35);
		label.setLabelFor(city);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		city = new JTextField(20);
		city.setBounds(205, 260, 200, 35);

		this.add(label);
		this.add(city);
	}

	private void initstate() {
		// TODO Auto-generated method stub
		/*JLabel label = new JLabel("State:", SwingConstants.RIGHT);
		label.setBounds(100, 50, 95, 35);
		label.setLabelFor(state);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		state = new JTextField(20);
		state.setBounds(205, 100, 200, 35);

		this.add(label);
		this.add(state);*/
		//JComboBox state = new JComboBox(stateStrings);
		JLabel label = new JLabel("State:", SwingConstants.RIGHT);
		label.setBounds(100, 50, 95, 35);
		//label.setLabelFor(state);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		String[] stateStrings = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MS", "MO", "MT", "NE", "NH", "NJ", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI","WY" };
		@SuppressWarnings("unchecked")
		JComboBox state = new JComboBox(stateStrings);
		label.setBounds(100, 300, 95, 35);
		state.setBounds(205, 300, 200, 35);
		this.add(state);
		this.add(label);
	}

	private void initphone_number() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("Phone Number:", SwingConstants.RIGHT);
		label.setBounds(100, 340, 95, 35);
		label.setLabelFor(postal_code);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		phone_number = new JTextField(3);
		phone_number.setBounds(205, 340, 60, 35);
		
		phone_number2 = new JTextField(3);
		phone_number2.setBounds(275, 340, 60, 35);
		
		phone_number3 = new JTextField(3);
		phone_number3.setBounds(345, 340, 60, 35);

		this.add(label);
		this.add(phone_number);
		this.add(phone_number2);
		this.add(phone_number3);
		

	}

	private void initaddress() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("Address:", SwingConstants.RIGHT);
		label.setBounds(100, 380, 95, 35);
		label.setLabelFor(postal_code);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		address = new JTextField(20);
		address.setBounds(205, 380, 200, 35);

		this.add(label);
		this.add(address);
	}

	private void initPinField() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel("PIN", SwingConstants.RIGHT);
		label.setBounds(100, 420, 95, 35);
		label.setLabelFor(pinField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		pinField = new JPasswordField(20);
		pinField.setBounds(205, 420, 200, 35);
		
		this.add(label);
		this.add(pinField);
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
		creatorButton.setBounds(85, 40, 200, 35);
		creatorButton.addActionListener(this);
		add(creatorButton);
        
        Button cancelButton = new Button("Cancel Account:");
        cancelButton.setBounds(275, 40, 200, 35);
        cancelButton.addActionListener(this);
        add(cancelButton);
	}

	/*private void initOption() {
		// TODO Auto-generated method stub
		 first_name = new JFrame("First Name:"); 
		 add(first_name);
		
		 
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
		 //pin.setLabelFor(accountField);
		
		 pin.setFont(new Font("DialogInput", Font.BOLD, 14));
		// pin = new JPasswordField(20);
		 pin.setBounds(50,500, 500,30);
		 accountField = new JPasswordField(20);
		 accountField.setBounds(205, 400, 200, 35);
		 this.add(pin);
		 this.add(accountField);
		 
		 this.add(first_name);
		 this.add(last_name);
		 this.add(dob);
		 this.add(phone_number);
		 this.add(address);
		 this.add(state);
		 this.add(city);
		 this.add(postal_code);
		 this.add(pin);
		 this.add(accountField);
		 
		 
	}*/

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
		
		/* if (source.equals(creatorButton)) {
			Database Database = new Database();
			String fnameget = first_name.getText();
			String lnameget = last_name.getText();
			String dayget = (String) Dates.getSelectedItem();
			String monthget = (String) Month.getSelectedItem();
			String yearget = (String) Year.getSelectedItem();
			String dobget = new String(yearget+monthget+dayget);
			String phoneget1 = phone_number.getText();
			String phoneget2 = phone_number2.getText();
			String phoneget3 = phone_number3.getText();
			String phoneget = new String(phoneget1 + phoneget2 + phoneget3);
			String addressget = address.getText();
			String cityget = city.getText(); 
			String stateget = (String) state.getSelectedItem();
			String zipget = postal_code.getText();
			char[] passwordget =  pinField.getPassword();
			String password = new String(passwordget);
				//password += passwordget.clone();
			System.out.println(fnameget + " "+lnameget+" "+dobget +" "+password +" "+ phoneget);
			user = new User(Integer.parseInt(password), Integer.parseInt(dobget), Long.parseLong(phoneget), fnameget, lnameget, addressget, cityget, stateget, zipget);
			bankAccount = new BankAccount('N', Number, 123.45, user);
			Number++;
			Database.insertAccount(bankAccount);
			first_name.setText(null);
			last_name.setText(null);
			phone_number2.setText(null);
			phone_number.setText(null);
			phone_number3.setText(null);
			Dates.setSelectedIndex(0);
			Month.setSelectedIndex(0);
			Year.setSelectedIndex(0);
			state.setSelectedIndex(0);
			address.setText(null);
			city.setText(null);
			postal_code.setText(null);
			pinField.setText(null);
			manager.switchTo(ATM.LOGIN_VIEW);
		 }
		 else {
			 Database Database = new Database();
				String fnameget = first_name.getText();
				String lnameget = last_name.getText();
				String dayget = (String) Dates.getSelectedItem();
				String monthget = (String) Month.getSelectedItem();
				String yearget = (String) Year.getSelectedItem();
				String dobget = new String(yearget+monthget+dayget);
				String phoneget1 = phone_number.getText();
				String phoneget2 = phone_number2.getText();
				String phoneget3 = phone_number3.getText();
				String phoneget = new String(phoneget1 + phoneget2 + phoneget3);
				String addressget = address.getText();
				String cityget = city.getText(); 
				String stateget = (String) state.getSelectedItem();
				String zipget = postal_code.getText();
				char[] passwordget =  pinField.getPassword();
				String password = new String(passwordget);
					//password += passwordget.clone();
				System.out.println(fnameget + " "+lnameget+" "+dobget +" "+password +" "+ phoneget);
				user = new User(Integer.parseInt(password), Integer.parseInt(dobget), Long.parseLong(phoneget), fnameget, lnameget, addressget, cityget, stateget, zipget);
				bankAccount = new BankAccount('N', Number, 123.45, user);
				Number++;
				Database.insertAccount(bankAccount);
				first_name.setText(null);
				last_name.setText(null);
				phone_number2.setText(null);
				phone_number.setText(null);
				phone_number3.setText(null);
				Dates.setSelectedIndex(0);
				Month.setSelectedIndex(0);
				Year.setSelectedIndex(0);
				state.setSelectedIndex(0);
				address.setText(null);
				city.setText(null);
				postal_code.setText(null);
				pinField.setText(null);
				manager.switchTo(ATM.LOGIN_VIEW);
		 }
			
			if (source.equals(cancelButton)) {
				first_name.setText(null);
				last_name.setText(null);
				phone_number2.setText(null);
				phone_number.setText(null);
				phone_number3.setText(null);
				Dates.setSelectedIndex(0);
				Month.setSelectedIndex(0);
				Year.setSelectedIndex(0);
				state.setSelectedIndex(0);
				address.setText(null);
				city.setText(null);
				postal_code.setText(null);
				pinField.setText(null);
				manager.switchTo(ATM.LOGIN_VIEW);
			}
			else
			{
				first_name.setText(null);
				last_name.setText(null);
				phone_number2.setText(null);
				phone_number.setText(null);
				phone_number3.setText(null);
				Dates.setSelectedIndex(0);
				Month.setSelectedIndex(0);
				Year.setSelectedIndex(0);
				state.setSelectedIndex(0);
				address.setText(null);
				city.setText(null);
				postal_code.setText(null);
				pinField.setText(null);
				manager.switchTo(ATM.LOGIN_VIEW);
			}
				
		*/
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}

