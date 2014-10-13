//Matthew Schlogel

//Imports

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Frame for the GUI

public class CalcGUI extends JFrame {
	
	//Label for the JFrame_______________________________________
	//Need spaces so that in the GUI the box is neat
	
	JButton runCalc = new JButton("   Calculate  ");
	JLabel InvestmentAmountLabel = new JLabel("    Investment Amount");
	JLabel YearsLabel = new JLabel("    Years");
	JLabel RateLabel = new JLabel("    Annual Interest Rate");
	JLabel FutureValueLabel = new JLabel("    Future Value");
	
	//Text fields for the JFrame_________________________________
	
	JTextField Investment = new JTextField();
	JTextField years = new JTextField();
	JTextField AnnualInterestRate = new JTextField();
	JTextField FutureValue = new JTextField();
	JPanel Panel = new JPanel();
	calcActionListener listen = new calcActionListener();

	//____________________________________________________________
	public CalcGUI() {
		
		//Adding items to my panel in JFRAME
		
		Panel.add( InvestmentAmountLabel);
		Panel.add( Investment);
		Panel.add( YearsLabel);
		Panel.add( years);
		Panel.add( RateLabel);
		Panel.add( AnnualInterestRate);
		Panel.add( FutureValueLabel);
		Panel.add( FutureValue);
		
		//Adding Listener_________________________________________
		
		runCalc.addActionListener(listen);
		FutureValue.setEditable(false);
		
		//Setting Layout_________________________________________
		
		setLayout(new BorderLayout());
		Panel.setLayout(new GridLayout(5, 3));
		add(Panel, BorderLayout.NORTH);
		add(runCalc, BorderLayout.EAST);

		//How big the Frame is and how to shut it down __________
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(375, 230);
		setLocationRelativeTo(null);
	}
	//____________________________________________________________

	// Listener Class so that we can manipulate our inputs
	class calcActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double parsedInvestment = Double.parseDouble(Investment.getText());
			int parsedYears = Integer.parseInt(years.getText());
			double parsedAnnualInterestRate = Double.parseDouble(AnnualInterestRate.getText());
			
			//The Listener is taking the inputs an running it through my function in the calc Class
			
			double Value = Calc.Calculate(parsedInvestment, parsedYears, parsedAnnualInterestRate);
			String Calculated = String.valueOf(Value);
			
			//Future Value is the end result
			//Will take FutureValue and display in GUI
			
			FutureValue.setText(Calculated);
		}
	}
	
	//_____________________________________________________________
	
	//Running the CalcGUI
	
	public static void main(String[] args) {
		CalcGUI GUI = new CalcGUI();
		GUI.setVisible(true);
	}
	
	/*
	 * GUI works as instructed in PS4 ProblemSet.
	 */
	
}