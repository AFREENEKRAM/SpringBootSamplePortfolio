package com.afreen.Sample.basicinfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface basicinfoRepository extends CrudRepository<basicinfoModel, Integer>   {

}
