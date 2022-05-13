//Wirakarn Ponpraserd
//6409650311
package question2;

public class TestLoan {

	public static void main(String[] args) {
		Loan loan1 = new Loan();
		loan1.setInterestRatePercent(10); //10%
		loan1.setNumOfYear(10);
		loan1.setLoan(1000000);
		System.out.printf("Your loan: %,.3f\n", loan1.getLoan());
		System.out.printf("Interest rate/month: %.2f%% \n",loan1.getInterestRate()*100);
		System.out.printf("Number of years: %d \n" ,loan1.getNumOfYear());
		System.out.printf("Your monthly payment: %,f\n",loan1.CalcurateMonthlyPayment());
		

	}

}


