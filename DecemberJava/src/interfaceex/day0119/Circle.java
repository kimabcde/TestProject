package interfaceex.day0119;



public class Circle {
	double radius;
	static final double PI=3.141592; // 값을 고정시키기 위해 final로 변수를 정의했다. 
	
	Circle() {}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {	//메서드는 일반적으로 어디서든 접근 가능하도록 public을 붙이고 있다.
		return radius*radius*PI;
	}
	
	
	
}
