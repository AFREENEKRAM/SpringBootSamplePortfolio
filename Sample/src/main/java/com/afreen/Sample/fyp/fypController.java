package com.afreen.Sample.fyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fyp")
public class fypController {


	@Autowired
	fypService FypService;
	
	
	
	@GetMapping("/{id}")  
	private fypModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return FypService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody fypModel fypModel)   
	{  
		FypService.save(fypModel);  
	return fypModel.getId();  
	}  
}
