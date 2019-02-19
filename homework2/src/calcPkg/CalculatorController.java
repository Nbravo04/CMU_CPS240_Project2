/*
 * Author:Nicholas Bravata
 * Homework Assignment 2 
 * CP2 240
 */
package calcPkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		CalculatorView VIEW = view;
		CalculatorModel MODEL = model;
		
		VIEW.getadd().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String str = MODEL.sum(VIEW);
				VIEW.setResult(str);
			}
		});
		
		VIEW.getsub().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String str = MODEL.sub(VIEW);
				VIEW.setResult(str);
			}
		});
		
		VIEW.getmult().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String str = MODEL.mult(VIEW);
				VIEW.setResult(str);
			}
		});

		VIEW.getdiv().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if( VIEW.getTF2() == 0.0) {
					String str = "Cannot divide by 0";
					VIEW.setResult(str);
				}
				else {
					String str = MODEL.div(VIEW);
					VIEW.setResult(str);
				}
			}
		});
	}
	
}
