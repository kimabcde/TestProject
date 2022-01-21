package langex.day0121;

import java.util.Objects;

class Value{
	int x;
	int y;
	
	public Value(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(x);
//	}

	@Override
	public boolean equals(Object obj) {
		//x,y에 저장된 값이 같으면 같은 객체
		if(obj instanceof Value) {
			return x == ((Value)obj).x && y == ((Value)obj).y;
		}else
			return false;
	}

	@Override
	public String toString() {
		return "Value [x=" + x + ", y=" + y + "]";
	}
	
	
	
}


public class EqualsEx {
	
	public static void main(String[] args) {
		Value v1 = new Value(10,20);
		Value v2 = new Value(10,20);
		Value v3 = new Value(10,30);
		
		//==변수에 저장된 주소값을 비교
		System.out.println("v1 == v2"+(v1==v2));
		//Object.equals : 객체 비교(주소)
		System.out.println("v1.equals(v2)"+v1.equals(v2)); 
						//(참조변수명).equals 메서드는 object 클래스에서 상속받는 메서드
						//==을 쓰면 자동으로 저게 호출되게 되는 것
		
		v1=v2;
		
		System.out.println("v1 == v2"+(v1==v2));
		System.out.println("v1.equals(v2)"+v1.equals(v2)); 
		
		System.out.println();
		
		System.out.println(v1);
		System.out.println(v1.hashCode());
		System.out.println(v3.hashCode());
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v3));
	}

}