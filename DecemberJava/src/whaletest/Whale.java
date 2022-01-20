package whaletest;

public class Whale extends Fish implements Mammal{//상속과 구현을 동시에 할 수 있다!!!
	
	@Override
	public void bear() {
		System.out.println("고래는 새끼를 낳아 젖을 먹여 키웁니다.");
	}
	
	@Override
	public void swim() {
		System.out.println("고래는 바다를 헤엄쳐다닙니다.");
	}
}
