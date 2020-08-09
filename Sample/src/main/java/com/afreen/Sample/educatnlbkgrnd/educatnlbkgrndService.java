package com.afreen.Sample.educatnlbkgrnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class educatnlbkgrndService {
	@Autowired  
	educatnlbkgrndRepository EducatnlbkgrndRepository;
	
	

	public educatnlbkgrndService(educatnlbkgrndRepository educatnlbkgrndRepo) {
		this.EducatnlbkgrndRepository = educatnlbkgrndRepo ;
	}



	public educatnlbkgrndModel getDetailsById(int id)   
	{  
	return EducatnlbkgrndRepository.findById(id).get();  
	}  
	
	public void save(educatnlbkgrndModel educatnlbkgrndModel)   
	{  
		EducatnlbkgrndRepository.save(educatnlbkgrndModel);  
	}  
}
