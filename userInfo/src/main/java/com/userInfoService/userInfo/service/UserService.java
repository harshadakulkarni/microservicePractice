package com.userInfoService.userInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userInfoService.userInfo.model.User;
import com.userInfoService.userInfo.repository.UserRepository;
@Service
public class UserService {

	@Autowired 
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		List<User> user = new ArrayList<User>();  
		userRepository.findAll().forEach(user1 -> user.add(user1));  
		return user; 
		
	}

	public User getUserById(int userid) {
		return userRepository.findById(userid).get(); 
	}

	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userid); 	
	}

	

	public void saveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user); 
	}

}
