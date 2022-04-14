package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
	
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		
		this.model = model;
		this.view = view;
		
		this.view.addActionListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			try {
				
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.addTwoNumbers(firstNumber, secondNumber);
				
				view.setResult(model.getValue());
				
			} catch(NumberFormatException ex) {
				
				view.displayErrMsg("You need to enter two Integers");
			}
		}
		
	}
}
