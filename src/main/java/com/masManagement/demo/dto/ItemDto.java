package com.masManagement.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
@Data
public class ItemDto {
	@NotEmpty(message = "Name is compulsory")
	private String name;
	private String remark;

}
