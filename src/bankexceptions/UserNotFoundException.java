package bankexceptions;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	private String user_id;
	
	public UserNotFoundException(String user_id){
		super();
		this.user_id = user_id;
	}
	
	public String toString(){
		return "Finding" + user_id + "\n " + super.toString();
	}
}
