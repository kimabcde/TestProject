package ncs.test1;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		String[] types = {"notebook", "notebook","desktop"};
		int day = 5;
		int rentalCost = main.calcPrice(types, day);
		System.out.println("총 대여료 : "+rentalCost);
	}
	
	public int calcPrice(String[] types, int day) {
		int sumCost = 0;
		int length = types.length;
		Computer[] coms = new Computer[length];
		for(int i = 0; i < length; i++){
			if(types[i].equals("notebook")) {
				coms[i] = new NoteBook();
			}else if(types[i].equals("desktop")) {
				coms[i] = new DeskTop();
			}
		}
		for( Computer c :coms ) {
			sumCost += c.getRentalPrice(day);
		}
		return sumCost;
	}

}
