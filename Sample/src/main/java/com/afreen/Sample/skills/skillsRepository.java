package com.afreen.Sample.skills;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface skillsRepository  extends CrudRepository<skillsModel, Integer>  {

}
