package javaClass; //d20200206

public class Dogs {

		protected String name;
		public String age;
		public String length;
		public String height;
		
		public void eat(String what){
			System.out.println(this.name + " 이(가)" + what + "을(를) 먹습니다");
			
		}
		
		public void run(String forWhom){
			System.out.println(this.name + " 이(가)" +forWhom + "에게 달려갑니다");
		
		}

}
