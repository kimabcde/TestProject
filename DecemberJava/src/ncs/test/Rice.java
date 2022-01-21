package ncs.test;

public class Rice extends Food {

	final int price = 2000;

	public Rice() {
		super(2000);
	}

	@Override
	public String getName() {	// 우클릭 -> source -> override/implements method메뉴
		return "밥";
	}
	
	
	
}
