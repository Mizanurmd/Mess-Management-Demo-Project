package com.masManagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="mas_member")
public class MasMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fname;
	private String lname;
	private String fatherName;
	private String motherName;
	private String address;
	private String roomNo;
	private String joinDate;
	private String nidNo;
	private String moblie;
	private String email;
	private String about;
	private String imgeUrl;
	
	
	
	
	
}
