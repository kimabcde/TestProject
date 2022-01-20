package interfaceex.day0119;

interface Inter1{
	int getA();
}
interface Inter2{
	int getA();
}
interface Inter3 extends Inter1, Inter2 {
	//int getA(); //이름과 매개변수가 똑같으므로. 하나의 추상메서드로 인식하게 된다.
	int getDate();
}
 

//class InterTestEx implements Inter1,Inter2{
//	int getA() {
//		return 1;
//	}
//}

public class InterTest2 implements Inter3{
	int a=100;
	public static void main(String[] args) {
		Inter1 i1 = new InterTest2();
		System.out.println(i1.getA());
		Inter2 i2 = new InterTest2();
		System.out.println(i2.getA());
		Inter3 i3 = new InterTest2();
		System.out.println(i3.getA());
		System.out.println(i3.getDate());
		
	}
	
	@Override
	public int getA() {
		return a;
	}
	
	@Override
	public int getDate() {
		return a+10;
	}

	
}
