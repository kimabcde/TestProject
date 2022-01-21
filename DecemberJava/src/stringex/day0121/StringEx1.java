package stringex.day0121;

public class StringEx1 {
	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		String s3 = "abc";
		String s4 = "abc";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}
}