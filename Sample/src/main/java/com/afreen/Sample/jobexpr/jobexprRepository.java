package com.afreen.Sample.jobexpr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface jobexprRepository  extends CrudRepository<jobexprModel, Integer> {

}
