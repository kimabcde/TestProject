package ncs.test;

public class Customer {
	int money;
	int point;
	
	void order(Food f) {
		if(money>=f.price) {
			money -= f.price;
			point += f.point;
		}else{
			System.out.println("주문 불가");	//주문 불가
		}
		
	}
}
