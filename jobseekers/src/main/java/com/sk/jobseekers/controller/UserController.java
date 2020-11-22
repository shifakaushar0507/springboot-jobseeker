/**
 * 
 */
package com.sk.jobseekers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.jobseekers.domain.UserVO;
import com.sk.jobseekers.service.UserService;

/**
 * @author shifa kaushar
 *
 */
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public UserVO get(@PathVariable int id){
		return userService.getById(id) ;
}
	
	@GetMapping("/user")
	public List<UserVO> getAll(){
		return userService.getAll();
	}
	
	
	@PostMapping("/user")
	public UserVO create(@RequestBody UserVO userVO) {
		return userService.create(userVO);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity delete(@PathVariable int id) {
		boolean flag= userService.delete(id);
		ResponseEntity response ;
		if(flag) {
			response =ResponseEntity.status(HttpStatus.OK).build();
		}else {
			response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return response ;
	} 
	
	
	
	
	
}
