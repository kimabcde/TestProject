package exception.day0120;

public class PasswordException extends Exception {
	
	PasswordException(String message){
		super(message);
	}
	
	PasswordException(String password, String message){
		super(password+" : "+message);
	}
}
