package com.peakprosys.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peakprosys.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
