package com.masManagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masManagement.demo.model.Uom;

@Repository
public interface UomRepository extends JpaRepository<Uom, Long>{

}
