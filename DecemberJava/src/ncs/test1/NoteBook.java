package ncs.test1;

public class NoteBook implements Computer{
	public int getRentalPrice(int day) {
		int cost = 500;
		day -= 2;
		if(day > 0) {
			cost += 200*day;
		}
		return cost;
	}
}
