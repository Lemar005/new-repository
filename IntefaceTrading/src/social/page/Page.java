package social.page;

import social.Bannable;
import social.Likable;
import social.LikesConteiner;
import social.user.User;

public class Page implements Likable, Bannable{
	
	User user;
     
	public Page(User user) {
		super();
		this.user = user;
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

		LikesConteiner.addLike(this);
	}

	@Override
	public void unlike() {

		LikesConteiner.removeLike(this);
		
	}

	@Override
	public String toString() {
		return "Page [user=" + user + "]";
	}

	

}
