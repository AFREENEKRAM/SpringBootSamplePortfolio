package com.afreen.Sample.internship;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface internshipRepository extends CrudRepository<internshipModel, Integer> {

}
