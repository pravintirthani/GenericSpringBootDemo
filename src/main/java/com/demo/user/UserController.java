package com.demo.user;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET,value="/user/all")
	public List<User> get() {	
		return userService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user/save")
	public User save(@RequestBody User user) {		
		return userService.save(user);
	}
	
	@GetMapping(value="/user/getUserFromProduct")
	public List<User> getUserrFromProduct() {		
		long productId=1;
		return userService.getUserrFromProduct(productId);
	}
	
}
