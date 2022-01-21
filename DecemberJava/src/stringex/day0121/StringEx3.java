package stringex.day0121;

public class StringEx3 {
	public static void main(String[] args) { //compareTo 매커니즘 정확히 설명 들을 것!!
		//공백 숫자 대문자 소문자 한글
		String a = "aaa";
		String b = "bbb";
		
		int i  = a.compareTo(b);
		int i2 = b.compareTo(a);
		int i3 = a.compareTo("aaa");
		
		System.out.println(i);//-1
		System.out.println(i2);//1
		System.out.println(i3);//0
		
		int result = "abcd".compareTo("abcz"); 
		if(result == 0) {
			System.out.println("\"abcd\"와 \"abcz\"는 같습니다.");
		}else if( result < 0) {
			System.out.println("\"abcd\"가 \"abcz\"보다 작습니다.");
		}else if( result > 0){
			System.out.println("\"abcd\"가 \"abcz\"보다 큽니다.");
		}
		
	}

}