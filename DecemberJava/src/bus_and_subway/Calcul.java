package bus_and_subway;

public class Calcul {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus("100",1000);
		Bus bus2 = new Bus("200",2000);
		Subway sub1 = new Subway(2, 1250);
		
		Student stu1 = new Student("Jerry", "1", 10000);
		Student stu2 = new Student("Tom", "2", 15000);
		
		stu1.take_subway(sub1.ryoukinn);
		stu1.take_bus(bus1.charge);
		System.out.println(stu1.money);
		
		stu2.take_bus(bus2.charge);
		System.out.println(stu2.money);
		
		
	}

}
