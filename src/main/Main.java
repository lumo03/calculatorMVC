package main;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class Main {

	public static void main(String[] args) {
		
		CalculatorView view = new CalculatorView();
		CalculatorModel model = new CalculatorModel();
		CalculatorController controller = new CalculatorController(model, view);
		
		view.setVisible(true);
	}

}
