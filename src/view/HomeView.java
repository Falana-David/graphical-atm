package view;

import java.applet.Applet;
import controller.ViewManager;
import model.BankAccount;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
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
	private JButton transferButton;
	private JButton closeButton;
	private JButton logoutButton;
	private JLabel headerLabel;
	private BankAccount Account = null;

	
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
		
		//this.add(new javax.swing.JLabel("HomeView", javax.swing.SwingConstants.BOTTOM ));
		//this.add(new javax.swing.JLabel("HomeView", javax.swing.SwingConstants.BOTTOM));

		// TODO
		//
		// this is where you should build the HomeView (i.e., all the components that
		// allow the user to interact with the ATM - deposit, withdraw, transfer, etc.).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}

	private void initWithDraw() {
		// TODO Auto-generated method stub
		
	}

	private void initTransfer() {
		// TODO Auto-generated method stub
		
	}

	private void initDeposit() {
		// TODO Auto-generated method stub
		
	}

	private void initOption() {
		//this.add(new javax.swing.JLabel("HomeView", javax.swing.SwingConstants.BOTTOM));
		JLabel label = new JLabel("What Would You Like To Do?");
		//label.setBounds(87, 21, 246, 74);
		this.add(label);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));

        Button depositButton = new Button("Deposit");
        add(depositButton);
        
        Button withdrawButton = new Button("Withdraw");
        add(withdrawButton);
        
        Button closeButton = new Button("Logout");
        closeButton.addActionListener(this);
        add(closeButton);
        
        Button transferButton = new Button("Transfer");
        transferButton.addActionListener(this);
        add(transferButton);
	}

	public void setCurrentAccount(BankAccount Account) {
		this.Account = Account;
		initialize();

		JPanel views = new JPanel(new CardLayout());
		ViewManager manager = new ViewManager(views);
		views.add(new DepositView(manager), ATM.DEPOSIT_VIEW);
	}

		//views.add(new WithdrawView(manager));

		//views.add(new TransferView(manager));
    	/*Panel p = new Panel();
	    p.setLayout(new BorderLayout());
	    p.add(new Button("Okay"), BorderLayout.SOUTH);
	    
	    Panel p2 = new Panel();
	    p2.setLayout(new BorderLayout());
	    p2.add(new TextArea());*/
	   
	    	//public void init() {
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
		Object source = e.getSource();
		if (source.equals(closeButton)) {
    	manager.switchTo(ATM.LOGIN_VIEW);
    	//pinField = null;
		} else {
			manager.switchTo(ATM.LOGIN_VIEW);
    }
		
		if (source.equals(depositButton)) {
			manager.switchTo(ATM.DEPOSIT_VIEW);
		}
		else {
			manager.switchTo(ATM.DEPOSIT_VIEW);
		}

		if (source.equals(withdrawButton)) {
			manager.switchTo(ATM.WITHDRAW_VIEW);
		}
		else {
			manager.switchTo(ATM.WITHDRAW_VIEW);
    }

		if (source.equals(transferButton)) {
			manager.switchTo(ATM.TRANSFER_VIEW);
		}
		else {
			manager.switchTo(ATM.TRANSFER_VIEW);
    }
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
	}