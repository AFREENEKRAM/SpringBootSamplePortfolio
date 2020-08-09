package com.afreen.Sample.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/skills")
public class skillsController {


	@Autowired
	skillsService SkillsService;
	
	
	
	@GetMapping("/{id}")  
	private skillsModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return SkillsService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody skillsModel skillsModel)   
	{  
		SkillsService.save(skillsModel);  
	return skillsModel.getId();  
	}  
}
