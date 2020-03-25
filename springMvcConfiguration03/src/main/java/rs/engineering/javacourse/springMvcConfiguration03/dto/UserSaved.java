package rs.engineering.javacourse.springMvcConfiguration03.dto;

import java.util.ArrayList;
import java.util.List;

public class UserSaved {

	private List<User> usersList= new ArrayList<User>();
	
	public void save(User user) {
		usersList.add(user);
	}

	@Override
	public String toString() {
		return "UserSaved [usersList=" + usersList + "]";
	}
	
	
}
