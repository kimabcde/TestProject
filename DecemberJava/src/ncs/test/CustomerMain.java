package ncs.test;

public class CustomerMain {

	public static void main(String[] args) { //main 줄의 내용은 전부 외워 두세요~
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		
		b.order(nd);// Customer의 order 메서드를 이용해서 Noodle주문
		b.order(rc);// Customer의 order 메서드를 이용해서 Rice주문

		System.out.println("현재 남은 돈은 "+b.money+"원 입니다");// Customer의 현재 남은 돈 출력
		System.out.println("현재 포인트는 "+b.point+"포인트 입니다");//// Customer의 포인트 출력

	}
}
