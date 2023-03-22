package com.masManagement.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class masDto {
	
	@NotEmpty(message = "First name is mandatory")
	private String fname;
	@NotEmpty(message = "Last name is also mandatory")
	private String lname;
	private String fatherName;
	private String motherName;
	private String address;
	@NotNull(message = "Room number is not null")
	private String roomNo;
	@NotNull(message = "Joining Date is manadatory")
	private String joinDate;
	@NotNull(message = "Joining Date is manadatory")
	private String nidNo;
	@NotNull(message = "Joining Date is manadatory")
	private String moblie;
	@NotNull(message = "Joining Date is manadatory")
	private String email;
	private String about;
	private String imgeUrl;

}
