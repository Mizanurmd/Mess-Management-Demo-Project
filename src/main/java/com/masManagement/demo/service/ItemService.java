package com.masManagement.demo.service;

import java.util.List;

import com.masManagement.demo.model.Item;

public interface ItemService {
	Item save(Item item);
	Item update(Item item);
	void delete(Long id);
	
	Item getById(Long id);
	List<Item>getAllItems();

}
