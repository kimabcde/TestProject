package ncs.test;

public class Rice extends Food {

	final int price = 2000;

	Rice() {
		super(2000);
	}

	@Override
	public String getName() {
		return "밥";
	}
}
