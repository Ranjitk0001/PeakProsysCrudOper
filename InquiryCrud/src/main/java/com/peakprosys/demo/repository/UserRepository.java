package com.peakprosys.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peakprosys.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
