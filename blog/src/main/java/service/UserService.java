package service;

import domain.User;

public interface UserService {
	User find(String name);
	void activited(String name, String authCode);
	void register(String name, String password);
	String resetPassword(String name);
}