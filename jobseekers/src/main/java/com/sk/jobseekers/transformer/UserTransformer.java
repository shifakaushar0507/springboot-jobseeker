/**
 * 
 */
package com.sk.jobseekers.transformer;

import org.springframework.stereotype.Component;

import com.sk.jobseekers.domain.UserEntity;
import com.sk.jobseekers.domain.UserVO;

/**
 * @author shifa kaushar
 *
 */
@Component
public class UserTransformer {

public UserVO convertEntityToVo(UserEntity userEntity){
	UserVO vo = new UserVO(); //creating uservo object
	
	//setting the user values into uservo from userEntity
	vo.setUserId(userEntity.getUserId());
	vo.setUsername(userEntity.getUsername());
	vo.setFirstname(userEntity.getFirstname());
	vo.setLastname(userEntity.getLastname());
	vo.setAddress(userEntity.getAddress());
	vo.setEmail(userEntity.getEmail());
	vo.setMobile(userEntity.getEmail());
	vo.setRoleId(userEntity.getRoleId());
	
	//return the uservo object
	return vo;
		
	}
	
   public UserEntity convertVoToEntity(UserVO userVo){
	   UserEntity response = new UserEntity();
	 
	   //setting the user values into userEntity from userVo
		response.setUserId(userVo.getUserId());
		response.setUsername(userVo.getUsername());
		response.setFirstname(userVo.getFirstname());
		response.setLastname(userVo.getLastname());
		response.setAddress(userVo.getAddress());
		response.setEmail(userVo.getEmail());
		response.setMobile(userVo.getEmail());
		response.setRoleId(userVo.getRoleId());
		
	   return response;
   }
}
