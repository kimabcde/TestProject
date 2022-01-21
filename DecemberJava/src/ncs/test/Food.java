package ncs.test;

public class Food {
	int price;
	int point;

	//Food(){}
	
	public Food(int price) {
		this.price = price;
		point += price*0.1;
	}
	
	public String getName() { //문제에서 추상클래스를 만들라고 안했으니까~
		 return ""; 
	}
	
	
}
