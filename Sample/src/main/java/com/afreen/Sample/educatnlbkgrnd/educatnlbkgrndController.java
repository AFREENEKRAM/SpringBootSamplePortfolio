package com.afreen.Sample.educatnlbkgrnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/educationalBackground")
public class educatnlbkgrndController {

	@Autowired
	educatnlbkgrndService EducatnlbkgrndService;
	
	
	
	@GetMapping("/{id}")  
	private educatnlbkgrndModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return EducatnlbkgrndService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody educatnlbkgrndModel educatnlbkgrndModel)   
	{  
		EducatnlbkgrndService.save(educatnlbkgrndModel);  
	return educatnlbkgrndModel.getId();  
	}  
	
}
