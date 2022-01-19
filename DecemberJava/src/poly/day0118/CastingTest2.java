package poly.day0118;

class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		//fe = (FireEngine)car;//error FireEngine fe = new Car();
//		fe.drive();//NullPointerException : 참조변수를 정의만 하고 객체를 생성자로 생성하지 않았기 때문.
//		car2 = fe;
//		car2.drive();
		
		if(car instanceof FireEngine) {
			System.out.println("(FireEngine)실행");
			fe = (FireEngine) car;
		}else {
			fe = new FireEngine();
		}
		 fe.drive();
		if(fe instanceof Car) {
			System.out.println("(Car)fe 실행");
			car2 = fe;
		}
		car2.drive();
	}
}