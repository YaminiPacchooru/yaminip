package com.Repository;



import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Model.Applicant;

public interface ApplicantRepository extends CrudRepository<Applicant,Integer>{

	 @Query("select creditScore from Applicant a where a.ssnNumber = :ssnNumber")
	 long findBySsnNumberReturnStream(int ssnNumber);


	 @Query("select currentAnualIncome from Applicant a where a.ssnNumber = :ssnNumber")
	long findBySsnNumberReturnStreams(int ssnNumber);
	

}
