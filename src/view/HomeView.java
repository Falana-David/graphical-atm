package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class HomeView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton closeButton;
	
	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public HomeView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the HomeView components.
	 */
	
	private void initialize() {
		initOption();
		initDeposit();
		initWithDraw();
		initTransfer();
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the HomeView.
		
		this.add(new javax.swing.JLabel("HomeView", javax.swing.SwingConstants.CENTER));
		
		// TODO
		//
		// this is where you should build the HomeView (i.e., all the components that
		// allow the user to interact with the ATM - deposit, withdraw, transfer, etc.).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	private void initOption() {
		JLabel label = new JLabel("What Would You Like To Do?");
		label.setBounds(10, 50, 60, 100);
		this.add(label);
		
		/*withdrawButton = new JButton("Withdraw");
	//withdrawButton.addActionListener(this);
		//withdrawButton.setBounds(205, 100, 200, 35);
		this.add(withdrawButton);
		
		depositButton = new JButton("Deposit");
		//depositButton.setBounds(205, 180, 200, 35);
		//depositButton.addActionListener(this);
		this.add(depositButton);
		
		closeButton = new JButton("Exit ATM");
		//closeButton.setBounds(205, 180, 200, 35);
		//closeButton.addActionListener(this);
		this.add(closeButton);*/
		
		JPanel label1 = new JPanel();
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        closeButton = new JButton("Exit ATM");
		
       /* label1.add(withdrawButton, BorderLayout.NORTH);
        label1.add(depositButton, BorderLayout.CENTER);
        label1.add(closeButton, BorderLayout.SOUTH);*/
      
		setLayout(new BorderLayout());
		label1.add(new Button("Withdraw"), BorderLayout.NORTH);  // Same as p.add(new TextArea(), BorderLayout.CENTER);
        label1.add(new Button("Deposit"), BorderLayout.CENTER);
        label1.add(new Button("Exit ATM"), BorderLayout.SOUTH);
        
        this.add(withdrawButton);
        this.add(depositButton);
        this.add(closeButton);
        //this.setVisible(true);
	}

	private void initTransfer() {
		// TODO Auto-generated method stub
	}

	private void initWithDraw() {
		// TODO Auto-generated method stub
		
	}

	private void initDeposit() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * HomeView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The HomeView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the HomeView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}