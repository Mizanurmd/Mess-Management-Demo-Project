package com.masManagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Uom")
public class Uom extends MasBase{

	private String name;
	private String remark;
	
	
}
