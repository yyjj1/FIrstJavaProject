package javaClass;

import javax.swing.JOptionPane;

public class SungJuk{
	private String num;
	private String name;
	private int kor, eng, mat;
	public int sum(){
		System.out.println("�հ�� " + (kor + eng + mat) + "�Դϴ�");
		return kor + eng + mat;
	}
	public void Ave(){
		System.out.println("����� " + (sum()/3) + "�Դϴ�");
	}
	public static void main(String[] args) {
		SungJuk rec  = new SungJuk();
		
		rec.num = JOptionPane.showInputDialog("�й�: ");
		rec.name = JOptionPane.showInputDialog("�̸�: ");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("����: "));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("����: "));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("����: "));
		
		System.out.println(rec.num + rec.name + " �� �����Դϴ�");
		
		rec.sum();
		rec.Ave();
	}
}
