package com.afreen.Sample.jobexpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class jobexprService {

	@Autowired  
	jobexprRepository JobexprRepository;
	

	public jobexprService(jobexprRepository jobexprRepository) {
		super();
		JobexprRepository = jobexprRepository;
	}

	public jobexprModel getDetailsById(int id)   
	{  
	return JobexprRepository.findById(id).get();  
	}  
	
	public void save(jobexprModel jobexprModel)   
	{  
		JobexprRepository.save(jobexprModel);  
	}  
}
