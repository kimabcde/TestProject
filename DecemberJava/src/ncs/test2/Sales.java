Sales.java
액세스 권한이 있는 사용자
강
D
김
김

박
시스템 속성
유형
자바
크기
397바이트
사용한 용량
397바이트소유자: 솔데스크 관리자
위치
문제7
만든 사람
강사이수진
수정 날짜

package ncs.test2;

public class Sales extends Employee implements Bonus{

	public Sales() {
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		setSalary((int)(pay*1.2) + getSalary());
	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}
}