package main;

import social.Bannable;
import social.Likable;
import social.LikesConteiner;
import social.page.Page;
import social.user.User;

public class Aplication {

	public static void main(String[] args) {
        //obiavliaem tip peremennoi
		User user_concret = new User("Stas", "pass", "dot@mail.ru");
		User user_concret2 = new User(" ", "   dfd", "email@mail.ru");
		Page p1 = new Page(user_concret);
		
		p1.like();
		user_concret.like();
		user_concret.like();

		user_concret2.like();
		user_concret2.like();
		user_concret2.like();
       
		
		user_concret.unlike();
    //	user_concret.unlike();
	//	user_concret.unlike();
         // protestiti raznie varianti, uiti v minus, uadliti laik polizovatelia kotorogo net
	
		
		for (Likable likable : LikesConteiner.likes.keySet()) {
			System.out.println(likable.toString() + " " +  LikesConteiner.likes.get(likable));
			
		}
		
		
		
	}

	
}
