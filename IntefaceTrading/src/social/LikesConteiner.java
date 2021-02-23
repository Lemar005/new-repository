package social;

import java.util.HashMap;
import java.util.Map;

import social.user.User;

public class LikesConteiner {

	
	public static Map<Likable,Integer> likes = new HashMap<>();
	
	public static void addLike(Likable likable) {
		
		 if(likes.containsKey(likable)) {
			 
			 likes.put(likable, likes.get(likable)+1);
		 }else 
			 likes.put(likable, 1);
	}
	
	//когда кол-во лайков доходит до 0 удалить полностью обьект из контейнера hashmap
	public static void removeLike(Likable likable) {
		 if(likes.containsKey(likable) && likes.get(likable) > 1) {
			 
		likes.put(likable, likes.get(likable)-1);	
		 }
		 else likes.remove(likable);
		
	}
	
	
	
	
}
