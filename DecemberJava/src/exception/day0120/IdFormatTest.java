package exception.day0120;

public class IdFormatTest {

	private String userId;
	
	String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IdFormatException{
		if(userId == null) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		}else if(userId.length()<8 || userId.length() > 10) {
			throw new IdFormatException("아이디는 8글자에서 10글자 사이입니다.");
		}
		this.userId = userId;
	}

	
	public static void main(String[] args) {
		IdFormatTest ift = new IdFormatTest();
		try {
			ift.setUserId(null);
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}
		try {
			ift.setUserId("123456789");
			System.out.println("저장된 아이디 : "+ift.getUserId());
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
