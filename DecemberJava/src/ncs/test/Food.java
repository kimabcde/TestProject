package ncs.test;

public class Food {
	int price;
	int point;

	//Food(){}
	
	public Food(int price) {
		this.price = price;
		point += price*0.1;
	}
	
	public String getName() {
		 return "food_name"; 
	}
	
	
}
