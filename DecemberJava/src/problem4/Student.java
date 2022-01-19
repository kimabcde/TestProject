package problem4;

public class Student extends Person{
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
	public void print() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 학번 : "+id);
	}
}