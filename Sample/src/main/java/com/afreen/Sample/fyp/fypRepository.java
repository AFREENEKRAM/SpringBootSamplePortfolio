package com.afreen.Sample.fyp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface fypRepository extends CrudRepository<fypModel, Integer> {

}
