/*
 * Author:Nicholas Bravata
 * Homework Assignment 2 
 * CP2 240
 */
package calcPkg;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorView view = new CalculatorView();
		CalculatorModel model = new CalculatorModel();
		CalculatorController controller = new CalculatorController(view,model);
		
	}

}
