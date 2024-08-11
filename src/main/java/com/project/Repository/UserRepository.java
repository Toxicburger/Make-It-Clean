package com.project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.UserEntity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
//	@Query("Select u from UserEntity u where u.firstName=:firstName" )
//	public UserEntity getUserByUserName(@Param("firstName") String firstName);
//	Optional<UserEntity> findById (long user);
//	
//	UserEntity findByUserName(String userName);
//	
	 Optional<UserEntity> findByEmail(String email);
	

}
