package com.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.ApplicantRepository;

import com.Model.Applicant;
@Service

public  class ApplicantServiceImpl implements ApplicantService{

	@Autowired
	public ApplicantRepository applicantRepository;
	
	public Applicant addApplicant(Applicant applicant) {
		
	
		return this.applicantRepository.save(applicant);
	}

	

	@Override
	public Optional<Applicant> getById(int ssnNumber) {
		
		return this.applicantRepository.findById(ssnNumber);
	}



	@Override
	public long findBySsnNumberReturnStream(int ssnNumber) {
	
		return this.applicantRepository.findBySsnNumberReturnStream(ssnNumber);
	}



	@Override
	public long findBySsnNumberReturnStreams(int ssnNumber) {

		return this.applicantRepository.findBySsnNumberReturnStreams(ssnNumber);
	}

	

	
}

	
	

