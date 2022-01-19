package poly.day0118;

class Super {
	int x = 10;

	void method() {
		System.out.println("Super.method() 실행");
	}
}

class Sub extends Super {
	int x = 20;

	@Override
	void method() {
		System.out.println("Sub.method() 실행");
	}
}

public class PolyTest {
	public static void main(String[] args) {
		
		Super s = new Sub();
		System.out.println(s.x);//10
		s.method();//Sub.method() 실행. 오버라이딩 된 메서드가 호출...
		
		Sub sub = new Sub();
		System.out.println(sub.x);//20
		sub.method();//Sub.method() 실행
	}

}