package com.progs.diyalowebapp.service;

import com.progs.diyalowebapp.entity.User;

public interface UserService {
	
	void tempLogin(String username, String password);
	
	User login(String username, String password);

}
