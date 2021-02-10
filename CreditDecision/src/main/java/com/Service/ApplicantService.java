package com.Service;

import java.util.Optional;

import com.Model.Applicant;

public interface ApplicantService {

	Applicant addApplicant(Applicant applicant);

	
	Optional<Applicant> getById(int ssnNumber);


	long findBySsnNumberReturnStream(int ssnNumber);


	long findBySsnNumberReturnStreams(int ssnNumber);

	
	




	
}
