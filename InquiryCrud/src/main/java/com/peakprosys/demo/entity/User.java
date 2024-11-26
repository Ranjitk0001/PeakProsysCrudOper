package com.peakprosys.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	private long id;
	@Column(name="user_name")
	private String user;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "mobile_no")
	private long mobile;
	
	@Column(name="Message")
	private String msg;
}
