package com.siri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siri.bootjpa.AlienRepo;
import com.siri.bootjpa.model.Alien;

// In this class we accept the requests from the client and gives back the response 
@RestController
public class AlienController {
    @Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@PostMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home";
	}
/*	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showAlien");
		Alien alien =repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByAidGreaterThan(2));
		System.out.println(repo.findByAidLessThan(1));
		System.out.println(repo.findByTechSorted("java"));
		mv.addObject(alien);
		return mv;
	}*/
/*	@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(int aid)
	{
		ModelAndView mv=new ModelAndView("updateAlien");
		Alien alien=repo.findById(aid).orElse(new Alien());
		
		mv.addObject(alien);
		return mv;
	}*/
	/*@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(Alien newalien)
	{
		ModelAndView mv=new ModelAndView("updateAlien");
		Optional<Alien> alien=repo.findById(newalien.getAid());
         
	        if(alien.isPresent()) 
	        {
	            Alien newEntity = alien.get();
	            newEntity.setAid(newalien.getAid());
	            newEntity.setAname(newalien.getAname());
	            newEntity.setTech(newalien.getTech());
	 
	            newEntity = repo.save(newEntity);
	             mv.addObject(newEntity);
	            return mv;
	        } else {
	            newalien = repo.save(newalien);
	             mv.addObject(newalien);
	            return mv;
	        }
	}*/
	@DeleteMapping("/deleteAlien")
	public String deleteAlien(@RequestParam int aid)
	{
		Alien alien=repo.findById(aid).orElse(new Alien());
		repo.delete(alien);
		return "deleteAlien";
	}
	@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable int aid)
	{
		return repo.findById(aid);
	}
	@GetMapping(path="/aliens")
	public List<Alien> getAlien()
	{
		return repo.findAll();
	}
	//consumes means we are restricting the data receiving from the client only to JSon format similarly
	//produces means data returning from server is only so and so ex:Json format only
	@PostMapping(path="/alien",consumes= {"application/json"})
	public 	Alien postAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	//requestbody anno for accepting the data(Incase 1st record is null it will return exception so to avoid that we use this
	@PutMapping(path="/alien",consumes= {"application/json"})
	public 	Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteAlienn(@PathVariable int aid)
	{
		Alien alien=repo.getOne(aid);
		repo.delete(alien);
		return "deleted";
	}
	
}
