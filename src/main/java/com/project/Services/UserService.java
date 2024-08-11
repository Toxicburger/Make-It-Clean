package com.project.Services;

import com.project.UserEntity.UserEntity;
import java.util.List;
import java.util.Optional;


public interface UserService {
    UserEntity saveUser(UserEntity user);
    Optional<UserEntity> getUserById(int userId);
    List<UserEntity> getAllUsers();
    UserEntity updateUser(int userId, UserEntity user);
    void deleteUser(int userId);
    Optional<UserEntity> authenticateUser(String email, String password);
}
