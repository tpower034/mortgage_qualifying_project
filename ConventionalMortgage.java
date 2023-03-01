package mortgageQualifyingProject;

import java.util.Scanner;

import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class ConventionalMortgage {
	

	private String borrowerFirstName = "";
	private String borrowerMiddleName = "";
	private String borrowerLastName = "";
	private String loanAmount = "";
	private String valueOfTheProperty = "";
	private String monthlyIncome = "";
	private String monthlyLiabilities = "";
	private String yearlyInsurance = "";
	private String yearlyTaxesForProperty = "";
	private String ficoScore = "";
	private String name = "";
	private String number = "";
	private String loanTerms = "";
	private String interestRate = "";
	private double loanAmountDouble = 0;
	private double interestPayment = 0;
	private double valueOfThePropertyDouble = 0;
	private double monthlyIncomeDouble = 0;
	private double monthlyLiabilitiesDouble = 0;
	private double yearlyInsuranceDouble = 0;
	private double yearlyTaxesForPropertyDouble = 0;
	private double ficoScoreDouble = 0;
	private double loanTermsDouble = 0;
	private double monthlyPrincipalAndInterest = 0;
	private double interestRateDouble = 0;
	private double totalMonthlyPayment = 0;
	private double debtToIncomeRatio = 0;
	private double loanToValue = 0;
	private double payment = 0;
	private double principalPayment = 0;
	private double outstandingPrincipal = 0;
	private double totalCost = 0;
	boolean flag = false;
	boolean qualified = true;
	Scanner sc = new Scanner(System.in);

	public void getAllUserInput()
	{
		getBorrowerFirstName();
		getBorrowerMiddleName();
		getBorrowerLastName();
		getLoanAmount();
		getValueOfTheProperty();
		getInterestRate();
		getFicoScore();
		getLoanTerms();
		getMonthlyIncome();
		getMonthlyLiabilities();
		getYearlyInsurance();
		getYearlyTaxesForProperty();
		getCalculateMonthlyPAndI();
		getTotalMonthlyPayment();
		getDebtToIncomeRatio();
		getLoanToValue();
		checkToSeeIfQualify();
		amortizationSchedule();
	}
	private String getValueFromUser()
	{
		String ValueFromUser = sc.next();
		return ValueFromUser;
	}
	
	private void getBorrowerFirstName() //getting borrower's first name
	{
		System.out.println("Please enter your first name:");//we will ask the user to enter in all the items needed for the loan.
		do {
			borrowerFirstName = getValueFromUser(); //checking to make sure it is the right format.
			flag = (checkName(borrowerFirstName));
			if(!flag)
			System.out.println("Error, please only use letters,\nwithout any special characters. Please try again:");

		}while (!flag);
		}
	
	private void getBorrowerMiddleName() //getting borrower's middle name
	{
		System.out.println("Please enter your middle name:");
		do {
			borrowerMiddleName = getValueFromUser();
			flag = (checkName(borrowerMiddleName));
			if(!flag)
			System.out.println("Error, please only use letters,\nwithout any special characters. Please try again:");

		}while (!flag);
		}
	private void getBorrowerLastName() //getting borrower's last name
	{
		System.out.println("Please enter your last name:");
	do {
		borrowerLastName = getValueFromUser();
		flag = (checkName(borrowerLastName));
		if(!flag)
		System.out.println("Error, please only use letters,\nwithout any special characters. Please try again:");

	}while (!flag);
	}
	private void getLoanAmount() //getting the loan amount from the borrower
	{
		System.out.println("Please enter loan amount:"); //User must enter a digit or integer with two decimals.
		do {
			loanAmount = getValueFromUser();
			flag = (checkNumber(loanAmount));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		loanAmountDouble = Double.valueOf(loanAmount);
	}
	private void getValueOfTheProperty() //getting the value of the property from the borrower
	{
		System.out.println("Please enter the value of the house:");
		do {
			valueOfTheProperty = getValueFromUser();
			flag = (checkNumber(valueOfTheProperty));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		valueOfThePropertyDouble = Double.valueOf(valueOfTheProperty);
	}
	private void getInterestRate() //getting the interest rate from the borrower
	{
		System.out.println("Please enter interest rate as a percentage such as 4.5:");
		do {
			interestRate = getValueFromUser();
			flag = (checkNumber(interestRate));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		interestRateDouble = Double.valueOf(interestRate);
		interestRateDouble = (interestRateDouble/100);

	}
	private void getMonthlyIncome() //getting the monthly income of the borrower
	{
		System.out.println("Please enter your monthly income:");
		do {
			monthlyIncome = getValueFromUser();
			flag = (checkNumber(monthlyIncome));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		monthlyIncomeDouble = Double.valueOf(monthlyIncome);

	}
	private void getMonthlyLiabilities() //getting the monthly liabilities of the borrower
	{
		System.out.println("Please enter your monthly liabilities:");
		do {
			monthlyLiabilities = getValueFromUser();
			flag = (checkNumber(monthlyLiabilities));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		monthlyLiabilitiesDouble = Double.valueOf(monthlyLiabilities);

	}
	private void getYearlyInsurance() //getting the yearly insurance from the borrower
	{
		System.out.println("Please enter your yearly insurance:");
		do {
			yearlyInsurance = getValueFromUser();
			flag = (checkNumber(yearlyInsurance));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		yearlyInsuranceDouble = Double.valueOf(yearlyInsurance);

	}
	private void getYearlyTaxesForProperty() //getting the taxes from the borrower
	{
		System.out.println("Please enter your yearly taxes:");
		do {
			yearlyTaxesForProperty = getValueFromUser();
			flag = (checkNumber(yearlyTaxesForProperty));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		yearlyTaxesForPropertyDouble = Double.valueOf(yearlyTaxesForProperty);

	}
	private void getFicoScore() //getting the fico score from the borrower
	{
		System.out.println("Please enter your fico score:");
		do {
			ficoScore = getValueFromUser();
			flag = (checkNumber(ficoScore));
			if(!flag)
			System.out.println("Error, please only use integers or number with two decimals. Please try again:");

		}while (!flag);
		ficoScoreDouble = Double.valueOf(ficoScore);

	}
	private void getLoanTerms() //getting the loan terms from the borrower
	{
		System.out.println("Please enter loan terms in years.");
		do {
			loanTerms = getValueFromUser();
			flag = (checkLoanTerms(loanTerms));
			if(!flag)
			System.out.println("Error, please only use integers for loan terms. Please try again:");

		}while (!flag);
		loanTermsDouble = Double.valueOf(loanTerms);
		loanTermsDouble = (loanTermsDouble*12); //This is to get the loan term in months.

	}
	
	private void getCalculateMonthlyPAndI()
	{
  //here I will calculate the monthly P and I payment
		monthlyPrincipalAndInterest = (loanAmountDouble*(interestRateDouble/12)*Math.pow(1+interestRateDouble/12,loanTermsDouble))/(Math.pow(1+interestRateDouble/12,loanTermsDouble)-1);
		System.out.println("\nThe monthly payment for principal and interest is: ");
		System.out.format("%10.2f", monthlyPrincipalAndInterest);


	}
	
	private void getTotalMonthlyPayment()
	{
		  //here I will calculate the total monthly payment
		totalMonthlyPayment = monthlyPrincipalAndInterest + (yearlyTaxesForPropertyDouble/12) + (yearlyInsuranceDouble/12);
		System.out.println("\n\nThe monthly payment for principal and interest, taxes, and insurance is: ");
		System.out.format("%10.2f", totalMonthlyPayment);


	}
	private void getDebtToIncomeRatio()
	{
     //Calculating the debt to income ratio.
		debtToIncomeRatio = (totalMonthlyPayment + monthlyLiabilitiesDouble)/monthlyIncomeDouble;
		

	}
	private void getLoanToValue()
	{
   //Calculating the LTV.
		loanToValue = (loanAmountDouble /valueOfThePropertyDouble);
		

	}
	
	private void checkToSeeIfQualify() //Here I am checking to see if the borrower qualifies, based on the DTI, FICO, and LTV.
	{
	if (debtToIncomeRatio<=.43 && ficoScoreDouble>=620 && loanToValue<=80) {
		qualified = true;
		System.out.println("\n\nCongradulations " + borrowerFirstName + " " + borrowerMiddleName + " " + borrowerLastName + " you qualified!");
		totalCost = monthlyPrincipalAndInterest*loanTermsDouble;
		System.out.println("\n\nThe total cost of your loan is: ");
		System.out.format("%10.2f", totalCost);
		System.out.println();



	}
		else {
			System.out.println("\n\nUnfortunately " + borrowerFirstName + " " + borrowerMiddleName + " " + borrowerLastName + " you did not qualify.");
			System.out.println("End of program.");
			System.exit(0); //If they do not qualify we will exit the program.

		}

	}
	
	
	private void amortizationSchedule() //Here we are creating a text file with the Amortization schedule
	{
		String fileName = "AmortizationScheduleFile.txt";
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(fileName);

		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}


		outputStream.format("\n%8s%10s%10s%10s%20s\n",
                "Month", "Principal", "Interest", "Payment", "Outstanding Balance");
		outputStream.println("==============================================================================");
		for (payment = 1; payment <= loanTermsDouble; payment++) {
			
			interestPayment = loanAmountDouble * (interestRateDouble/12);
			principalPayment = monthlyPrincipalAndInterest - interestPayment; 
			outstandingPrincipal = loanAmountDouble - principalPayment;
			loanAmountDouble = outstandingPrincipal;
			
			
			outputStream.format("%8.0f%10.2f%10.2f%10.2f%20.2f\n",
	        payment, principalPayment, interestPayment, monthlyPrincipalAndInterest, outstandingPrincipal);
		}
	
		System.out.println("\nThe amortization schedule is located: " + fileName);
		outputStream.close();
		System.out.println();
	
	}

	private boolean checkName(String name)
	{
		return name.matches("[a-zA-Z]+");// The format for the name we will only take alphabetic letters.
	}
	
	private boolean checkNumber(String number)
	{
		return number.matches("(\\d+\\.\\d{2})|(\\d+\\.\\d{1})|(\\d+)");// The format for the numbers will be either a digit, or digit with two decimals.
	}
	private boolean checkLoanTerms(String number)
	{
		return number.matches("(\\d+)");// The format for the numbers will be either a digit, or digit with two decimals.
	}
}
