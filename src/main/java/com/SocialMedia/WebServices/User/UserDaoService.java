package com.SocialMedia.WebServices.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Sam", LocalDate.now().minusYears(20)));
		users.add(new User(++usersCount, "John", LocalDate.now().minusYears(25)));
	}
	
	public static List<User> findAll() {
		return users;
	}
	public static User findOne(int id) {
		if(id<=usersCount) return users.get(id+1);
		return null;
	}
	public static void deleteById(int id) {
		users.remove(id-1);
	}
	public static User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
}
