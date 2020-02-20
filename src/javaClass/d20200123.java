package javaClass;

import javax.swing.JOptionPane;

public class d20200123 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("d: "));
		d20200123 main = new d20200123();
		main.gugu(num);
		
	}
	public void gugu(int input){
		int a = 1;
		while(a<=9){
			System.out.println(input * a);
			a++;
		}
		
		
	}
}
