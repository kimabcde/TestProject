package poly.day0118;

class InstanceofTest {
	public static void main(String args[]) {
		FireEngine fe = new FireEngine();
		Car car = new Car();
		//if(객체를 가리키고 있는 변수 instanceof 변환할 타입){
		//  (변환할 타입)변수
		//}
		
		if(car instanceof FireEngine) {//false
			System.out.println("This is a FireEngine instance.");
		} 

		if(fe instanceof Car) {//true
			Car c = fe;
			System.out.println("This is a Car instance.");
		} 

		if(fe instanceof Object) {//true
			System.out.println("This is an Object instance.");
		} 
	}
} // class