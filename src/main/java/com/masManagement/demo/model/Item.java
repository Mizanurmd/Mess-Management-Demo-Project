package com.masManagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="item")
public class Item extends MasBase {
	
	private String name;
	private String remark;

}
