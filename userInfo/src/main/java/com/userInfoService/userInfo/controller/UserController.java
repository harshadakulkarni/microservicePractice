package com.userInfoService.userInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userInfoService.userInfo.model.User;
import com.userInfoService.userInfo.service.UserService;



@RestController
public class UserController {

	@RequestMapping(value="hello")
	
	public String hello()
	{
		return "hello";
	}
	
	
	@Autowired  
	UserService userService ;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/user")  
	private List<User> getAllUsers()   
	{  
	return userService.getAllUsers();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/user/{userid}")  
	private User getUser(@PathVariable("userid") int userid)   
	{  
	return userService.getUserById(userid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/user/{userid}")  
	private void deleteUser(@PathVariable("userid") int userid)   
	{  
		userService.deleteUser(userid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/saveUser")  
	private int saveUser(@RequestBody User user)   
	{  
		userService.saveOrUpdateUser(user);  
	return user.getUserid();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/updateUser")  
	private User update(@RequestBody User user)   
	{  
		userService.saveOrUpdateUser(user);  
	return user;  
	}  
}  
	
	
	

