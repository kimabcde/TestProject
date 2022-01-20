package exception.day0120;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		
		//Integer.parseInt : 숫자로만 이루어진 문자열을 int로 바꾼다.
		try {
			int data = Integer.parseInt(args[0]);

			int a = Integer.parseInt("1");
			System.out.println(a);
			
			int result = 50 / data;

			System.out.println(result);
		}  
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("값을 입력해주세요.");
		} catch (NumberFormatException | ArithmeticException ae) {
			System.out.println("0이 아닌 숫자만 읽어올 수 있습니다.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다. ");
		} //super 타입의 exception 클래스일수록 아래에 적어주어야 한다.
		
		System.out.println("프로그램 종료");
	}

}