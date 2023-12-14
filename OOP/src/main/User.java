package main;

public abstract class User {
	protected String username;
	protected String password;
	protected String userId;
	protected UserPersonalInfo infoUser;
	protected boolean active = true;
	
	public User(String username, String password, String userId, UserPersonalInfo infoUser) {
		this.username = username;
		this.password = password;
		this.userId = userId;
		this.infoUser = infoUser;
	}

	public String getUsername() {
		return username;
	}

	public void changeUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	
	public UserPersonalInfo getInfoUser() {
		return infoUser;
	}
	public void updateInfoUser(UserPersonalInfo infoUser) {
		this.infoUser = infoUser;
	}
	
	public boolean logIn(String username, String password) {
		if(this.username.equals(username) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	
	public boolean logOut() {
		if(this.active == true) {
			this.active = false;
			return true;
		}
		return false;
	}
	
	public void viewNews() {
		for(News n: SystemData.news) {
			System.out.println(news);
		}
	}
}
