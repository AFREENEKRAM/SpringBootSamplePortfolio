package com.afreen.Sample.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class skillsService {

	@Autowired  
	skillsRepository SkillsRepository;

	public skillsService(skillsRepository skillsRepository) {
		super();
		SkillsRepository = skillsRepository;
	}

	public skillsModel getDetailsById(int id)   
	{  
	return SkillsRepository.findById(id).get();  
	}  
	
	public void save(skillsModel skillsModel)   
	{  
		SkillsRepository.save(skillsModel);  
	}
}
