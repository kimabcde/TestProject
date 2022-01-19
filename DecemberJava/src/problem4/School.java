package problem4;

class Person{
	String name;
	int age;
	
	Person(){}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void print(){}
	
}

class Student extends Person{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	Student(String name, int age, int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	@Override
	void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 학번 : "+id);
	}
}

class Teacher extends Person{
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	Teacher(String name, int age, String subject){
		this.name=name;
		this.age=age;
		this.subject=subject;
	}
	
	@Override
	void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 과목 : "+subject);
	}
	
}

class Employee extends Person{
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
	void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 부서 : "+dept);
	}
}

public class School {

	public static void main(String[] args) {
		Person s = new Student("홍길동학생", 24, 25000);//조상타입 참조변수로 자손을 다룬다
		Person t = new Teacher("홍길동강사", 30, "자바");
		Person e = new Employee("김길동관리자", 40, "교무과");
		s.print();
		t.print();
		e.print();
	}

}
