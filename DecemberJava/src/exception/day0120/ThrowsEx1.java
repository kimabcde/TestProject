package exception.day0120;

public class ThrowsEx1 {

	public void cutString(String str) throws NumberFormatException{
		String s = str.substring(0, 1);
		printGuGudan(s);
	}
	
	public void printGuGudan(String s) throws NumberFormatException{
		int dan = Integer.parseInt(s);
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsEx1 t1 = new ThrowsEx1();
		try {
			t1.cutString(args[0]);
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			e.printStackTrace();
		}
	}
}
