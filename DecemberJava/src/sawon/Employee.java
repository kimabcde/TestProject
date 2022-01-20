package sawon;

public class Employee {
	
	String no;
	String name;
	String dept;
	String job;
	int sal;
	
	public Employee(){}
	
	public Employee(String no, String name, String dept, String job, int sal) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.sal = sal;
	}
	
	@Override					//toString 메서드의 오버라이드
	public String toString() {
		return no+" : "+dept+" "+name+" "+job;
	}
	
}
