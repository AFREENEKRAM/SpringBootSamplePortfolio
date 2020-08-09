package com.afreen.Sample.internship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class internshipService {

	@Autowired  
	internshipRepository InternshipRepository;
	

	public internshipService(internshipRepository internshipRepository) {
		super();
		InternshipRepository = internshipRepository;
	}

	public internshipModel getDetailsById(int id)   
	{  
	return InternshipRepository.findById(id).get();  
	}  
	
	public void save(internshipModel internshipModel)   
	{  
		InternshipRepository.save(internshipModel);  
	}  
}
