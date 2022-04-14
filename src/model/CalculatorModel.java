package model;

public class CalculatorModel {
	
	private int value;
	
	public CalculatorModel() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public void addTwoNumbers(int first, int second) {
		value = first + second;
	}
}
