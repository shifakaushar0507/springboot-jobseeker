package com.sk.jobseekers.domain;

public class UserVO {

	private int userId;
	private String  firstname;
	private String lastname;
	private String username;
	private String email;
	private String mobile;
	private String address;
	private int roleId;
	
	
	/**
	 * @param firstname
	 * @param lastname
	 * @param username
	 * @param email
	 * @param mobile
	 * @param address
	 * @param roleId
	 */
	public UserVO(String firstname, String lastname, String username, String email, String mobile, String address,
			int roleId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.roleId = roleId;
	}
	
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
	
}
