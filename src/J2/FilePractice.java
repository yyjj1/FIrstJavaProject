package J2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FilePractice extends JFrame implements ActionListener{

	JButton insertButton, showButton;
	JTextField textField;
	
	public FilePractice(String title){
		int x= 200, y = 100, width = 600, height = 350;
		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);
		panel.setLayout(new GridLayout(4,1));
		getContentPane().add(panel, 0);
		
		insertButton = new JButton("�Է�");
		insertButton.addActionListener(this);
		panel.add(insertButton);
		
		showButton = new JButton("����");
		showButton.addActionListener(this);
		panel.add(showButton);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == insertButton){
			JOptionPane.showMessageDialog(this, "�Է¶�");
		}
		else if(e.getSource() == showButton){
			String txt = textField.getText();
 			JLabel label = new JLabel(txt);
			
			JPanel mainPanel = (JPanel)getContentPane().getComponent(0);
			mainPanel.setBackground(Color.lightGray);
			mainPanel.add(label);
			validate();
		}
	}
	


}
