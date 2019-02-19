/*
 * Author:Nicholas Bravata
 * Homework Assignment 2 
 * CP2 240
 */
package calcPkg;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CalculatorView extends Frame{
	
	private TextField inputTF1;	// you will have to check the values of these text field
	private TextField inputTF2;	// and use them with the model
	private Label resultLabel;		// update this to update the result shown

	private Button addBtn;
	private Button subBtn;
	private Button multBtn;
	private Button divBtn;

	// you should comment what this code does
	public CalculatorView() {

		// Setup Frame
		setSize(300,200);	// size of window
		setLayout(null);	// no layout is required for this
		setVisible(true);	// a visible window

		// Text Field Labels
		Label opLabel1 = new Label("Op 1:");	// a label, which just present text
		opLabel1.setBounds(25,50,50,25);		// the location and size of the label (x, y, size_x, size_y)

		Label opLabel2 = new Label("Op 2:");
		opLabel2.setBounds(25,75,50,25);

		Label resultTextLabel = new Label("Result:");
		resultTextLabel.setBounds(25,125,50,25);

		resultLabel = new Label("Press the operation buttons to calculate.");
		resultLabel.setBounds(25,150,250,25);

		// Text Field (a TextField takes in user input)
		inputTF1 = new TextField();			// operand 1
		inputTF1.setBounds(75, 50, 100, 25);
		inputTF2 = new TextField();			// operand 2
		inputTF2.setBounds(75, 75, 100, 25);

		// Buttons
		addBtn = new Button("+");			// add
		addBtn.setBounds(200,50,50,25);
		subBtn = new Button("-");			// Subtract
		subBtn.setBounds(200,75,50,25);
		multBtn = new Button("*");			// Multiply
		multBtn.setBounds(200,100,50,25);
		divBtn = new Button("/");			// divide
		divBtn.setBounds(200,125,50,25);
		
		// Add to Frame (if you do not add them to the frame, they will not appear)
		add(opLabel1);
		add(opLabel2);
		add(resultTextLabel);
		add(resultLabel);
		add(inputTF1);
		add(inputTF2);
		add(addBtn);
		add(subBtn);
		add(multBtn);
		add(divBtn);
	}
	
	//Getters and setters
	public Button getadd() {
		return addBtn;
	}
	
	public Button getsub() {
		return subBtn;
	}
	
	public Button getmult() {
		return multBtn;
	}
	
	public Button getdiv() {
		return divBtn;
	}
	
	public double getTF1() {
		double a;
		a = Double.parseDouble(inputTF1.getText());
		return a;
	}
	
	public double getTF2() {
		double b;
		b = Double.parseDouble(inputTF2.getText());
		return b;
	}
	
	public void setResult(String resultStr) {
		resultLabel.setText(resultStr);
	}
}
