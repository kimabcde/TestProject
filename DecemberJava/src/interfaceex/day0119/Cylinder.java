package interfaceex.day0119;

public class Cylinder{
	double height;
	
	Circle circle;	// 처음에 생성자를 통해서 초기화하는게아니라, 나중에 변수값을 입력받음으로써 초기화하겠다.

	Cylinder(){}
	
	Cylinder(Circle circle, double height) {
		super();
		this.height = height;
		this.circle = circle;
		//System.out.println(height+","+circle);
	}
	
	double getVolume() {
		return circle.getArea()*height;
	}
	
	
}
