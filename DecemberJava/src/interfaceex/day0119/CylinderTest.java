package interfaceex.day0119;

public class CylinderTest {

	public static void main(String[] args) {
		Circle cir = new Circle(2.8);
		Cylinder cyl = new Cylinder(cir, 5.6);
		
		
		System.out.println(cyl.getVolume());
	}

}
