package com.siri.bootjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siri.bootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	//if we want to  create our own methods then we have to follow the method signature like start with findBy 
	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	List<Alien> findByAidLessThan(int aid);
	//to write our own queries we have to use this annotation 
	//here we are sorting names based on technology 
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	
	
	
}
