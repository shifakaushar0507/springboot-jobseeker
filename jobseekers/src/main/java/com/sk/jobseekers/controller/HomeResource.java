/**
 * 
 */
package com.sk.jobseekers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shifa kaushar
 *
 */
@RestController
public class HomeResource {
	@GetMapping("/")
	public String home() {
		return "Hello Gadhi";	}
	
	
	@GetMapping("api/user")
	public String user() {
		return("<h1>Welcome user</h1>");
	}
	
	@GetMapping("api/admin")
	public String admin() {
		return("<h1>Welcome admin</h1>");
	}

}
