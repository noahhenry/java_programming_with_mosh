import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // get number input from terminal
        System.out.print("Number between 1 and 100: ");
        int userInput = scanner.nextInt();

        // check conditions and perform appropreate action...
        if (userInput % 3 == 0 && userInput % 5 == 0)
            System.err.println("FizzBuzz");
        else if (userInput % 5 == 0)
            System.err.println("Fizz");
        else if (userInput % 3 == 0)
            System.err.println("Buzz");
        else
            System.out.println(userInput);

    }
}
