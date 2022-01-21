package stringex.day0121;

public class StringEx4 {
	public static void main(String[] args) {

		String rainbow = "red,orange,yellow,green,blue,navy,purple";
		//rainbow = "red, orange";
		
		String[] color = rainbow.split(","); // <<String 타입 참조변수.split>>의 기능!
		for(String s : color) {
			System.out.println(s);
		}
		
		String colors = String.join("+", color);
		System.out.println(colors);
		
	}

}