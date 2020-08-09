package com.afreen.Sample.basicinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class basicinfoService {
	
	@Autowired  
	basicinfoRepository BasicinfoRepository;
	
	

	public basicinfoService(basicinfoRepository basicinfoRepo) {
		
		this.BasicinfoRepository = basicinfoRepo ;
	}



	public basicinfoModel getDetailsById(int id)   
	{  
	return BasicinfoRepository.findById(id).get();  
	}  
	
	public void save(basicinfoModel basicinfoModel)   
	{  
		BasicinfoRepository.save(basicinfoModel);  
	}  
}
