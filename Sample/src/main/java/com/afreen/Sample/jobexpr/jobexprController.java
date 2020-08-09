package com.afreen.Sample.jobexpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jobExperience")
public class jobexprController {

	@Autowired
	jobexprService JobexprService;
	
	
	
	@GetMapping("/{id}")  
	private jobexprModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return JobexprService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody jobexprModel jobexprModel)   
	{  
		JobexprService.save(jobexprModel);  
	return jobexprModel.getId();  
	}  
}
