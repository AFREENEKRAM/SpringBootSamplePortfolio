package com.afreen.Sample.fyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class fypService {
	@Autowired  
	fypRepository FypRepository;
	

	public fypService(fypRepository fypRepository) {
		
		this.FypRepository = fypRepository;
	}

	public fypModel getDetailsById(int id)   
	{  
	return FypRepository.findById(id).get();  
	}  
	
	public void save(fypModel fypModel)   
	{  
		FypRepository.save(fypModel);  
	}  
}
