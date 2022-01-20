package ncs.test;

public class CustomerMain {

	public static void main(String[] args) {
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.money = 10000; b.point = 0;
		
		b.order(nd);// Customer의 order 메서드를 이용해서 Noodle주문
		b.order(rc);// Customer의 order 메서드를 이용해서 Rice주문

		System.out.println(b.money);// Customer의 현재 남은 돈 출력
		System.out.println(b.point);//// Customer의 포인트 출력

	}

}
