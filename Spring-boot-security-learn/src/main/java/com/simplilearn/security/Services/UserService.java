package com.simplilearn.security.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.simplilearn.security.Models.User;

@Service
public class UserService {

	
	List <User> list=new ArrayList<>();

	public UserService() {
		list.add(new User(1,"ankit","Ankit@1998","Admin"));
		list.add(new User(2,"Vaibhav","Vibhav@1998","User"));
	}
	
	public List<User> getAllUser(){
	
		return this.list;
	}
	
	
}
