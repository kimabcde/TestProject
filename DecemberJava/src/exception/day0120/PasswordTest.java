package exception.day0120;

public class PasswordTest {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(password.length() < 5) {
			throw new PasswordException(password, "비밀번호는 5자리 이상입니다");
		}else if(password.matches("[a-zA-z]+")) {
			throw new PasswordException(password, "비밀번호는 숫자를 포함해야 합니다.");
		}
		this.password = password;
	}




	public static void main(String[] args) {
		PasswordTest pt = new PasswordTest();
		
		try {
			pt.setPassword(null);
			System.out.println(pt.getPassword()); // 29번째 줄에서 exception 발생해서 그냥 넘어감
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pt.setPassword("abc");
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pt.setPassword("abcd");
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pt.setPassword("abcde");
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pt.setPassword("abcd1");
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pt.setPassword("abc14");
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
