package exception.day0120;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int[] var = {10,200,30};
		
		for(int i =0; i<=3; i++) {
			try {//try 안에는 실행할 문장. 예외가 발생할 수 있다면 try로 감싸기~
				System.out.println("***"+(i+1));
				System.out.println(var[i]);
				System.out.println("~~~"+(i+1));
			}catch(ArrayIndexOutOfBoundsException e) {//예외 타입의 변수를 선언. exception
				System.out.println("예외 발생");		  //super타입 exception으로 100%처리가능.
				System.err.println(e.getMessage());
				e.printStackTrace();//예외 추적 메서드
			}
			finally {//예외 관계 없이 무조건 실행할 문장
				System.out.println("Finally"+(i+1));
			}
		}
		
		System.out.println("program end!!");
	}

}
