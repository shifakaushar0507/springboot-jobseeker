/**
 * 
 */
package com.sk.jobseekers.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.jobseekers.domain.UserEntity;
import com.sk.jobseekers.domain.UserVO;
import com.sk.jobseekers.repository.UserRepository;
import com.sk.jobseekers.transformer.UserTransformer;

/**
 * @author shifa kaushar
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserTransformer userTransformer;
	
	//findAll
	public List<UserVO> getAll(){
		List<UserVO> response = new ArrayList<>();
		userRepository.findAll().forEach((res)->response.add(userTransformer.convertEntityToVo(res)));
		return response ;
		
	}
	
	//findById
	public UserVO getById(int id) {
		//.get for taking optional value as userEntity
		UserEntity userEntity = userRepository.findById(id).get();
	UserVO response =	userTransformer.convertEntityToVo(userEntity);
		return response ;
	}
	
	
	//create
	public UserVO create(UserVO vo) {
//		userRepository.save(userTransformer.convertVoToEntity(vo));
		return userTransformer.convertEntityToVo(userRepository.save(userTransformer.convertVoToEntity(vo)));
	}
	
	//update
	public UserVO update(UserVO vo , int id){
	
		UserEntity entity =userRepository.findById(id).get();
	
	
	if(!(entity==null)) {
		vo.setUserId(entity.getUserId());
		entity = userTransformer.convertVoToEntity(vo);
		userRepository.save(entity);	
	}
	else {
	throw new RuntimeException("user not found");	
	}
	return vo;
	}
	
	
	//delete
	public boolean delete(int id) {
		boolean flag =false ;
		UserEntity entity =userRepository.findById(id).get();
		if(!(entity==null)) {
			userRepository.delete(entity);
			flag = true;
		}
		return flag ;
	}
}
