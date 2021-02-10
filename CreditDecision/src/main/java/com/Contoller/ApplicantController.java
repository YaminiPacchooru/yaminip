package com.Contoller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.Model.Applicant;
import com.Service.ApplicantService;

@RestController
public class ApplicantController {

	@Autowired
	public ApplicantService applicantService ;

	
	@RequestMapping(value = "/applicant" , method = RequestMethod.POST)
	public Applicant addApplicant(@RequestBody (required = false) Applicant applicant) {
		
		return this. applicantService.addApplicant(applicant); 
	}
	 
	@GetMapping(value="/getCreditScore/{ssnNumber}")
	public void findCreditScore(@PathVariable int ssnNumber)  {
		
		long creditScore =	 this.applicantService.findBySsnNumberReturnStream(ssnNumber);
		long currentAnualIncome = this.applicantService.findBySsnNumberReturnStreams(ssnNumber);
			if(creditScore > 700) {
				long santionedLoanamount = currentAnualIncome / 2 ; 
				System.out.println("credit score is more than 700 so it is printing sanctioned loan amount" + santionedLoanamount);
				 
			}
			else {
				System.out.println(creditScore);
			}
	}

	@GetMapping(value="/applicant1/{ssnNumber}")
	public Optional<Applicant> getApplicant(@PathVariable int ssnNumber) {
		
		return this.applicantService.getById(ssnNumber);

	}
	
	
}





