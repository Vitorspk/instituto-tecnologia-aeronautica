
public class LoginException extends Exception {

	private String login;
	
	public LoginException(String message, String login) {
		super(message);
		// TODO Auto-generated constructor stub
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	
}
