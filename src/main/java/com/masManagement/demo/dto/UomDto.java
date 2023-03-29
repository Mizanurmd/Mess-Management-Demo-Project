package com.masManagement.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UomDto {

	@NotEmpty(message = "name is compulsory")
	private String name;
	private String remark;
	
}
