package javaClass; //d20200206

public class Hound extends Dogs{
	
	
	public Hound(String name){
		super.name = name;
	}
	
	public void chase(String target){
		run(target);
		eat(target);
	}
	
	public void run(String target){
		System.out.println(this.name + " 이(가)" + target + "을(를) 쫒다");
	}
	
}

