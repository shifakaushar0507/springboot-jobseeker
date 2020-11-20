/**
 * 
 */
package com.sk.jobseekers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.jobseekers.domain.UserEntity;

/**
 * @author shifa kaushar
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
