package ncs.test;

public class Customer {
	int money = 10000;
	int point = 0; //0을 적지 않아도 인스턴스 변수라서 0으로 초기화됨.
	
	public void order(Food f) { //Food타입의 변수로 선언해야, 참조변수로 자손클래스 이용가능하니까.
		if(money>=f.price) {
			money -= f.price;
			point += f.point;
		}else{
			System.out.println("주문 불가");	//주문 불가
		}
		System.out.println(f.getName()+"을/를 주문하셨습니다.");
	}
}
