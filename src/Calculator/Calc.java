package Calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;import javax.swing.JPanel;

import org.omg.CORBA.INTERNAL;

public class Calc extends JFrame implements ActionListener {

	char operator;
	int operand1;
	
	JLabel consoleLabel;
	
	String btnTextArray[] = {
							"7", "8", "9", "+",
							"4", "5", "6", "-",
							"1", "2", "3", "*",
							"!", "0", "<", "=",
							"@", "#"
	   						};
	
	public Calc(String title){
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;
		
		setTitle(title);
		setBounds(x, y, width, height);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		getContentPane().add(mainPanel);
		
		JPanel consolePanel = new JPanel();
		consolePanel.setPreferredSize(new Dimension(600, 100));
		mainPanel.add(consolePanel, BorderLayout.NORTH);
		
		consoleLabel = new JLabel();
		consoleLabel.setHorizontalAlignment(JLabel.CENTER);
		consoleLabel.setFont(consoleLabel.getFont().deriveFont(50f));
		consolePanel.add(consoleLabel);
		
		JPanel buttonView = new JPanel(new GridLayout(5,4));
		mainPanel.add(buttonView, BorderLayout.CENTER);
		
		settingButtons(buttonView);	
		
		setVisible(true);
	}
	private void settingButtons(JPanel padPanel){ 
		
		JButton button1 = new JButton("1");
		button1.addActionListener(this);
		padPanel.add(button1, 0);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(this);
		padPanel.add(button2, 0);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(this);
		padPanel.add(button3, 0);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(this);
		padPanel.add(button4, 0);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(this);
		padPanel.add(button5, 0);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(this);
		padPanel.add(button6, 0);
			
		JButton button7 = new JButton("7");
		button7.addActionListener(this);
		padPanel.add(button7, 0);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(this);
		padPanel.add(button8, 0);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(this);
		padPanel.add(button9, 0);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(this);
		padPanel.add(buttonPlus, 0);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(this);
		padPanel.add(buttonMinus, 0);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.addActionListener(this);
		padPanel.add(buttonMulti, 0);
		
		JButton buttondivide = new JButton("/");
		buttondivide.addActionListener(this);
		padPanel.add(buttondivide, 0);
		
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(this);
		padPanel.add(buttonequal, 0);
		
		JButton buttonpac = new JButton("!");
		buttonpac.addActionListener(this);
		padPanel.add(buttonpac, 0);
		
		JButton buttonbinary = new JButton("@");
		buttonbinary.addActionListener(this);
		padPanel.add(buttonbinary, 0);
		
		JButton buttonsub = new JButton("#");
		buttonsub.addActionListener(this);
		padPanel.add(buttonsub, 0);
		
		JButton buttondelete = new JButton("<");
		buttondelete.addActionListener(this);
		padPanel.add(buttondelete, 0);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String labelTxt = consoleLabel.getText();
		
		String text = ((JButton)e.getSource()).getText();
		char btnChar  = text.charAt(0);
		
		System.out.println("bntChar: " + btnChar);
		int inValBtnText = (int)btnChar;
		
		System.out.println("inValBntText: " + inValBtnText);
		
		if(inValBtnText >= 48 && inValBtnText <= 57){
			labelTxt += text;
			
			System.out.println(text);
			
			consoleLabel.setText(labelTxt);
		}
		else if(inValBtnText == 61){
			int result = 0;
			switch(operator){
			case '+':
				result = operand1 + Integer.parseInt(labelTxt);
				break;
			case '-':
				result = operand1 + Integer.parseInt(labelTxt);
				break;	
			case '*':
				result = operand1 + Integer.parseInt(labelTxt);
				break;	
				}
			
			consoleLabel.setText(String.valueOf(result));
		}
		else if(inValBtnText == 60){
			if(labelTxt.length() > 0){
				labelTxt = labelTxt.substring(0, labelTxt.length()-1);
				consoleLabel.setText(labelTxt);
			}
		}
		else if(inValBtnText == 33){
			operand1 = Integer.parseInt(labelTxt);
			System.out.println(operand1 + "의 팩토리얼 어쩌고");
			consoleLabel.setText("0");
		}
		else if(inValBtnText == 64){
			operand1 = Integer.parseInt(labelTxt);
			System.out.println(operand1 + "를 2진수 어쩌고");
			consoleLabel.setText("0000");
		}
		else if(inValBtnText == 35){
			operand1 = Integer.parseInt(labelTxt);
			System.out.println(operand1 + "1~" + operand1 + "까지 합계 어쩌고");
		}
		else{
			operator = btnChar;
			operand1 = Integer.parseInt(labelTxt);	
			consoleLabel.setText("");
		}
		
		invalidate();
		
		
		
		
	}
	
}

