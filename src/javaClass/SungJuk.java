package javaClass;

import javax.swing.JOptionPane;

public class SungJuk{
	private String num;
	private String name;
	private int kor, eng, mat;
	public int sum(){
		System.out.println("합계는 " + (kor + eng + mat) + "입니다");
		return kor + eng + mat;
	}
	public void Ave(){
		System.out.println("평균은 " + (sum()/3) + "입니다");
	}
	public static void main(String[] args) {
		SungJuk rec  = new SungJuk();
		
		rec.num = JOptionPane.showInputDialog("학번: ");
		rec.name = JOptionPane.showInputDialog("이름: ");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("국어: "));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("영어: "));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("수학: "));
		
		System.out.println(rec.num + rec.name + " 의 성적입니다");
		
		rec.sum();
		rec.Ave();
	}
}
