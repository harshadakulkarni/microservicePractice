package com.userInfoService.userInfo.repository;

import com.userInfoService.userInfo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UserRepository extends JpaRepository<User, Integer>   {



}
