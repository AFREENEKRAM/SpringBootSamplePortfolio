package com.afreen.Sample.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internship")
public class internshipController {

	@Autowired
	internshipService InternshipService;
	
	
	
	@GetMapping("/{id}")  
	private internshipModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return InternshipService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody internshipModel internshipModel)   
	{  
		InternshipService.save(internshipModel);  
	return internshipModel.getId();  
	}  
	
}
