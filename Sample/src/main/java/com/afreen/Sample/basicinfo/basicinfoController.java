package com.afreen.Sample.basicinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basicInfo")
public class basicinfoController {

	
	@Autowired
	basicinfoService BasicinfoService;
	
	
	
	@GetMapping("/{id}")  
	private basicinfoModel getbasicinfo(@PathVariable("id") int id)   
	{  
		System.out.println("afreen"+ id);
	return BasicinfoService.getDetailsById(id);  
	}  
	
	@PostMapping("")  
	private int savebasicinfo(@RequestBody basicinfoModel basicinfoModel)   
	{  
		BasicinfoService.save(basicinfoModel);  
	return basicinfoModel.getId();  
	}  
}
