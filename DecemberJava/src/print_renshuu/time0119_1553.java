package print_renshuu;

//오버로딩 : 같은 메서드명으로 다른 매개변수를 입력받을 때.

public class time0119_1553 {
		public void print(String s1, String s2) {
			System.out.println(s1+s2);
		}
		
		public void print(String s1, String s2, String s3, String s4) {
			System.out.println(s1+s2+s3+s4);
		}
		
		public void print(String[] sArr) {
			for(int i =0 ; i<sArr.length; i++) {
				System.out.println(sArr[i]);
			}
		}
		
		public static void main(String[] Args) {	//main 메서드
			time0119_1553 vt = new time0119_1553();
			vt.argTest(1, "a","b","c");
			vt.argTest(2, "1","2","3","4","5");
		}
		
		public void argTest(int a, String ... n) { //n은 String[]으로 정의된 것이다.
			for(int i =0; i<n.length; i++) {
				System.out.println(n[i]);
			}
		}
}
