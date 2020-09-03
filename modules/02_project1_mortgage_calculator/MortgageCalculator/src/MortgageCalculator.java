import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) throws Exception {
        // constant variables
        final byte MONTHS_IN_YEAR = 12; // taken from solution
        final byte PERCENT = 100; // taken from solution
        // ^^ Allows us to avoid "Magic Numbers" in our code...
            // Magic Numbers: 

        Scanner scanner = new Scanner(System.in);

        // get principle
        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        // get interest rate
        System.out.print("Interest Rate (%): ");
        float interestRate = scanner.nextFloat() / PERCENT;

        // get period length
        System.out.print("Period (years): ");
        byte period = scanner.nextByte();

        // print out inputs...
        System.out.println("--------------");
        System.out.println(principle);
        System.out.println(interestRate);
        System.out.println(period);
        System.out.println("--------------");

        // calculate mortgage payment per month
        // // create instance of NumberFormat type
        // NumberFormat currency = NumberFormat.getCurrencyInstance();

        int numberOfPayments = period * MONTHS_IN_YEAR;
        float monthlyInterest = interestRate / MONTHS_IN_YEAR;
        double mortgagePayment = principle // bellow formatting inspired by solution...
                                    * ( 
                                        monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))
                                        / (Math.pow(1 + monthlyInterest, numberOfPayments) -1)
                                    );
        // String mortgagePaymentAsString = currency.format(mortgagePayment);
        String mortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment); // taken from solution
        System.out.println("Monthly Mortgage Payment: " + mortgagePaymentFormatted);

    }
}