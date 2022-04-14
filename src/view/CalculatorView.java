package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
	
	private JPanel mainPanel;
	private JTextField firstNumber, secondNumber;
	private JLabel plusSign, result;
	private JButton calculateBtn;
	
	public CalculatorView() {
		
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		mainPanel = new JPanel();
		firstNumber = new JTextField("0");
		secondNumber = new JTextField("0");
		plusSign = new JLabel("+");
		result = new JLabel("0");
		calculateBtn = new JButton("calculate");
		
		mainPanel.add(firstNumber);
		mainPanel.add(plusSign);
		mainPanel.add(secondNumber);
		mainPanel.add(calculateBtn);
		mainPanel.add(calculateBtn);
		mainPanel.add(result);
		
		add(mainPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public void setResult(int result) {
		this.result.setText(""+result);
	}
	
	public void addActionListener(ActionListener actionListener) {
		calculateBtn.addActionListener(actionListener);
	}
	
	public void displayErrMsg(String error) {
		JOptionPane.showMessageDialog(this, error);
	}
}
