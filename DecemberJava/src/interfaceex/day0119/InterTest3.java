package interfaceex.day0119;


interface MyInter1{
	default void method1() {
		System.out.println("MyInter1 method1()");
	}
	default void method2() {
		System.out.println("MyInter1 method2()");
	}
	static void staticMethod() {
		System.out.println("MyInter1 staticMethod()");
	}
}

interface MyInter2{
	default void method1() {
		System.out.println("MyInter2 method1()");
	}
	static void staticMethod() {
		System.out.println("MyInter2.staticMethod()");
	}
}

class Parent2{
	public void method2() {
		System.out.println("Parent method2()");
	}
}

class Child extends Parent2 implements MyInter1, MyInter2{
	
	@Override
	public void method1(){
		System.out.println("Child method1() override");
	}
}

public class InterTest3{

	public static void main(String[] args) {
		Child c = new Child();
		c.method2();
		c.method1();
		
		MyInter1.staticMethod();
		MyInter2.staticMethod();
	}

}
