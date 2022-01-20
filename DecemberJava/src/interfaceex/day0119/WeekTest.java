package interfaceex.day0119;

public class WeekTest {

	public static void main(String[] args) {
		Week today = Week.WED;
		System.out.println(today);//그 자체 show
		System.out.println(today.name());//객체의 문자열 리턴
		System.out.println(today.ordinal());//순번
		System.out.println(today.compareTo(Week.FRI));//순번 차이
		for(Week day : Week.values()) {
			System.out.println(day.name());
		}
		
		if(today.compareTo(Week.FRI)<=0) {
			System.out.println("공부하자~~");
		}else {
			System.out.println("놀자~~");
		}
		
		
		
	}
	
}