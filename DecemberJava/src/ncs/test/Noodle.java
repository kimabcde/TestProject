package ncs.test;

public class Noodle extends Food{
	
	final int price = 1000;
	
	Noodle(){//생성자의 접근제어자는 클래스의 접근제어자와 똑같이 붙인다.
		super(1000);
	}
	
	@Override
	public String getName() {
		return "국수";
	}
}
