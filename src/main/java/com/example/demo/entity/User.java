package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USERS")
@Data
public class User {
	
	@Column(name = "USER_ID")
	@Id
	private Integer ID;
	
	@Column(name = "USER_NAME")
	private String NAME;
	
	private Integer AGE;
	private String GENDER;
	private String COUNTRY;
	
	
}
