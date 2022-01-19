package problem4;

public class Employee extends Person{
	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	Employee(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	@Override
	public void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 부서 : "+dept);
	}
}