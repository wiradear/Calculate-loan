//Wirakarn Ponpraserd
//6409650311
package question2;

public class Loan {
	private double loan,interestRate;
	private double monthlyPayment;
	private int numOfYear;

	public double getLoan() {
		return loan;
	}
	
	public void setLoan(double loanAmount) {
		this.loan = loanAmount;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRatePercent(double anInterestRate ) {
		this.interestRate = anInterestRate/100;
	}
	
	public int getNumOfYear() {
		return numOfYear;
	}
	
	public void setNumOfYear(int aNumOfYear ) {
		this.numOfYear = aNumOfYear;
	}

	public double CalcurateMonthlyPayment() {
		monthlyPayment = (double)(loan*interestRate)/
				(1-1/Math.pow(1+interestRate,numOfYear*12));
		return monthlyPayment;
	}
}
