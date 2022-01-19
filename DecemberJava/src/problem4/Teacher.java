package problem4;

public class Teacher extends Person{
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
	public void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 과목 : "+subject);
	}
	
}