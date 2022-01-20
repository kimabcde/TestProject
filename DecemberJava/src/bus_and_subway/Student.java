package bus_and_subway;

public class Student {
	String name;
	String what_class;
	int money;
	
	Student(){}
	
	Student(String name, String what_class, int money) {
		super();
		this.name = name;
		this.what_class = what_class;
		this.money = money;
	}
	
	Bus bus = new Bus();
	void take_bus(int bus_bi) {
		money-=bus_bi;//버스비
	}
	
	void take_subway(int zeoncheol_bi) {
		money-=zeoncheol_bi;//
	}
	
	void money_left() {
		System.out.println(money);
	}
	
}
