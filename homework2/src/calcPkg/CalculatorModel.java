/*
 * Author:Nicholas Bravata
 * Homework Assignment 2 
 * CP2 240
 */
package calcPkg;

public class CalculatorModel {

	
	private double a, b;
	
	public String sum(CalculatorView view) {
		double sum;
		a = view.getTF1();
		b = view.getTF2();
		sum = a + b;
		String str = Double.toString(sum);
		return str;
	}
	
	public String sub(CalculatorView view) {
		double sum;
		a = view.getTF1();
		b = view.getTF2();
		sum = a - b;
		String str = Double.toString(sum);
		return str;
	}
	
	public String mult(CalculatorView view) {
		double sum;
		a = view.getTF1();
		b = view.getTF2();
		sum = a * b;
		String str = Double.toString(sum);
		return str;
	}
	
	public String div(CalculatorView view) {
		double sum;
		a = view.getTF1();
		b = view.getTF2();
		sum = a / b;
		String str = Double.toString(sum);
		return str;
	}
}
