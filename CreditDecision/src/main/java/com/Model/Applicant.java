package com.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ssnNumber ;
	double loanAmount;
	long currentAnualIncome;
	long creditScore;
	public int getssnNumber() {
		return ssnNumber;
	}
	public void setsSNNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getCurrentAnualIncome() {
		return currentAnualIncome;
	}
	public void setCurrentAnualIncome(long currentAnualIncome) {
		this.currentAnualIncome = currentAnualIncome;
	}
	public long getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(long creditScore) {
		this.creditScore = creditScore;
	}
	
	
	public Applicant() {
		super();
		
	}
	public Applicant(int ssnNumber, double loanAmount, long currentAnualIncome, long creditScore) {
		super();
		this.ssnNumber = ssnNumber;
		this.loanAmount = loanAmount;
		this.currentAnualIncome = currentAnualIncome;
		this.creditScore = creditScore;
	}
	
	

	

}