package social.user;

import social.Bannable;
import social.Likable;
import social.LikesConteiner;

public class User implements Likable, Bannable{

	private String name;
	private String password;
	private String email;
	


	public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void bann() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbann() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like() {
    if(getName().matches("(?i).*[a-zà-ÿ].*") && getPassword().matches("(?i).*[a-zà-ÿ].*") && getEmail().matches("(?i).*[a-zà-ÿ].*"))
		LikesConteiner.addLike(this);
      
      
	}

	@Override
	public void unlike() {
	    if(getName().matches("(?i).*[a-zà-ÿ].*") && getPassword().matches("(?i).*[a-zà-ÿ].*") && getEmail().matches("(?i).*[a-zà-ÿ].*"))
		LikesConteiner.removeLike(this);
		
	}

	
	
	@Override
	public String toString() {
		return "User [name=" + name.trim() + ", password=" + password.trim() + ", email=" + email.trim()  + "]";
	}
}
