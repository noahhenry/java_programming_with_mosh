import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorWithErrorHandling {
    public static void main(String[] args) throws Exception {
        // constant variables
        final byte MONTHS_IN_YEAR = 12; // taken from solution
        final byte PERCENT = 100; // taken from solution

        Scanner scanner = new Scanner(System.in);

        // get principle
        System.out.print("Principle ($1K - $1M): ");
        int principle = scanner.nextInt();

        while (principle < 1_000 || principle > 1_000_000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            principle = scanner.nextInt();
        }

        // get interest rate
        System.out.print("Interest Rate (%): ");
        float interestRate = scanner.nextFloat() / PERCENT;

        while (interestRate < 0 || (interestRate * PERCENT) > 30) {
            System.out.println("Enter a value greater than 0 and less than 30.");
            interestRate = scanner.nextFloat() / PERCENT;
        }

        // get period length
        System.out.print("Period (years): ");
        byte period = scanner.nextByte();

        while (period < 1 || period > 30) {
            System.out.println("Enter a value between 1 and 30.");
            period = scanner.nextByte();
        }

        // print out inputs...
        System.out.println("--------------");
        System.out.println(principle);
        System.out.println(interestRate);
        System.out.println(period);
        System.out.println("--------------");

        int numberOfPayments = period * MONTHS_IN_YEAR;
        float monthlyInterest = interestRate / MONTHS_IN_YEAR;
        double mortgagePayment = principle // bellow formatting inspired by solution...
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        // String mortgagePaymentAsString = currency.format(mortgagePayment);
        String mortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment); // taken from
                                                                                                      // solution
        System.out.println("Monthly Mortgage Payment: " + mortgagePaymentFormatted);

    }


    public static void solution(String[] args) throws Exception {
        // constant variables
        final byte MONTHS_IN_YEAR = 12; // taken from solution
        final byte PERCENT = 100; // taken from solution

        // global variables to function... initialized
        int principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        // create an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // get principle
        while (true) {
            System.out.print("Principle ($1K - $1M): ");
            principle = scanner.nextInt();
            if (principle >= 1_000 && principle <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        // get interest rate
        while (true) {
            System.out.print("Interest Rate (%): ");
            float annualInterest = scanner.nextFloat() / PERCENT;
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than 30.");
        }

        // get period length
        while (true) {
            System.out.print("Period (years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principle
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
