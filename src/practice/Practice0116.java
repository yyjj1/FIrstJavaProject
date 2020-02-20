package practice;

import javax.swing.JOptionPane;

public class Practice0116 {

	public static void main(String[] args) {

		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("d: "));
		if(a>0){
			System.out.println("曄熱");
		}
		else if(a<0){
			System.out.println("擠熱");
		}
		if(a%2==0){
			System.out.println("礎熱");
		}
		else if(a%2==1 || a%2==-1){
			System.out.println("�汝�");
		}	

/*		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
		if(a>b){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
*/		

/*		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
		if(a==0 && b==0){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
*/

/*		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
		if(a==1 && b==1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
*/		

/*		
	int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("c: "));
		if(a%2==0){
			System.out.println(a);
		}
		if(b%2==0){
			System.out.println(b);
		}
		if(c%2==0){
			System.out.println(c);
		}
*/		
		
		
		
	
	}		
}
