package wrapper.day0121;

public class AutoBoxingEx {

	public static void main(String[] args) {
		int i =10;
		
		Integer intg = i; 	//Integer intg = Integer.valueOf(i);
		Object o = i; 		//Object o = (Object) Integer.valueOf(i);
		
		Long lng = 100L; 	// Long lng = new Long(100L);
		
		int i2 = intg + 10;	//참조형과 기본형 간의 연산 가능
		
		long l = lng + intg; //wrapper 객체간의 연산 가능 //unboxing
		
		int i3 = intg; //int i3 = intg.intValue();
		
		int i4 = 100;
		long l4 = i4;
		
		Integer i5 = 100;
		
		//Long l5 = i4; //에러
		//Long l6 = i5; //에러
		//기본형<->참조형 형변환은
		//같은 타입을 다루는 wrapper 클래스와 기본형 간에만 가능
	}

}
