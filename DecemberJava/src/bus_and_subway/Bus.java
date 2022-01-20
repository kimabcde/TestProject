package bus_and_subway;

public class Bus {
	String busNumber;
	int charge;
	int income; int total_passenger;
	
	Bus() {}
	
	public Bus(String busNumber, int charge) {
		super();
		this.busNumber = busNumber;
		this.charge = charge;
	}
	
//	public void take() {
//		income += charge;
//		total_passenger++;
//	}

	void gogo(int money){//승객을 태운다
		money-=charge;
	}
	
	void print() {//버스 상태를 출력한다 => 뭔 상태를 출력하라는거임?
		System.out.printf("%s번 버스의 승객은 %d명이고 수입은 %d입니다.\n", 
								busNumber, total_passenger, income);
		
	}
}
