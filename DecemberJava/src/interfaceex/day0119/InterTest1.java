package interfaceex.day0119;

interface Inter5{
	public static final int A = 100; //(=int A)
	public abstract int getA(); // ( =int getA() )
	
}

class InterTestEx implements Inter5{ //형식 잘 봐둘것. implements 인터페이스명. 상속.
	
	@Override
	public int getA(){ //인터페이스의 getA() 메서드가 public이었기 때문에 여기도 public.
		return A;
	}
}

public class InterTest1 {
	public static void main(String[] args) {
		Inter5 i1 = new InterTestEx();
		System.out.println(i1.getA()); 
		//메서드를 호출하면. 항!상! 오버라이딩 된 메서드가 실행되게 된다.

	}

}
