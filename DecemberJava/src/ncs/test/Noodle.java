package ncs.test;

public class Noodle extends Food{
	
	final int price = 1000;
	
	Noodle(){
		super(1000);
	}
	
	@Override
	public String getName() {
		return "국수";
	}
}
