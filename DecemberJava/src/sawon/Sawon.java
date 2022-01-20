package sawon;

import java.util.Scanner;

public class Sawon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Employee employee1 = new Employee("A1892", "박나래", "총괄개발부", "대리", 3500);
		Employee employee2 = new Employee("B8077", "유재석", "Web개발부", "부장", 4500);
		Employee employee3 = new Employee("C5691", "김동욱", "Android개발부", "과장", 4000);
		
		Employee[] emps = {employee1, employee2, employee3};	//내가 놓쳤던 부분~!
		System.out.println("사원번호 > ");
		String input_no = s.next(); //input_no는 스캐너로 입력한 사원번호
		
		int x=0; //0 -> 사원 없음, 1-> 사원 있음.
		for(Employee e : emps) {
			String no = e.no;
			if(input_no.equals(no)) {
				x=1;
				System.out.println(e);
				break;
			}
		}
		if(x==0) {
			System.out.println("해당 사원은 없습니다.");
		}
		
		
		s.close();
	}

}
