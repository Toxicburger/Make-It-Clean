package com.project.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.UserRepository;
import com.project.Services.UserService;
import com.project.UserEntity.UserEntity;

@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public UserEntity saveUser(UserEntity user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public Optional<UserEntity> getUserById(int userId) {
	        return userRepository.findById(userId);
	    }

	    @Override
	    public List<UserEntity> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public UserEntity updateUser(int userId, UserEntity user) {
	        Optional<UserEntity> existingUser = userRepository.findById(userId);
	        if (existingUser.isPresent()) {
	            UserEntity updatedUser = existingUser.get();
	            updatedUser.setFirstName(user.getFirstName());
	            updatedUser.setLastName(user.getLastName());
	            updatedUser.setEmail(user.getEmail());
	            updatedUser.setPassword(user.getPassword());
	            updatedUser.setPhoneNumber(user.getPhoneNumber());
	            updatedUser.setPinCode(user.getPinCode());
	            updatedUser.setCity(user.getCity());
	            updatedUser.setUpdatedAt(user.getUpdatedAt());
	            return userRepository.save(updatedUser);
	        } else {
	            return null;
	        }
	    }

	    @Override
	    public void deleteUser(int userId) {
	        userRepository.deleteById(userId);
	    }
	    
	    @Override
	    public Optional<UserEntity> authenticateUser(String email, String password) {
	        Optional<UserEntity> user = userRepository.findByEmail(email);
	        if (user.isPresent() && user.get().getPassword().equals(password)) {
	            return user;
	        }
	        return Optional.empty();
	    }
}
