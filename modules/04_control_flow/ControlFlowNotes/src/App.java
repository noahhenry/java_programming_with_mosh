import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Comparison Operators
        int x = 1;
        int y = 1;
        System.out.println(x == y); // boolean expression "x == y": is equal
        System.out.println(x != y); // boolean expression: is not equal
        System.out.println(x > y); // boolean expression: is greater than
        System.out.println(x < y); // boolean expression: is less than
        System.out.println(x <= y); // boolean expression: is less than or equal to
        System.out.println(x >= y); // boolean expression: is greater than or equal to

        // Logical Opperators
        // "and" opperator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // read from left to right...
        System.out.println(isWarm);
        // "or" opperator
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        // boolean isEligible = hasHighIncome || hasGoodCredit;
        // "not" opperator
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // the "!", or "not" value reverses the value of what ever boolean it is placed infront of...

        // If Statements
        int temperature2 = 32;
        if (temperature2 > 30) {
            System.err.println("It's a hot day!");
            System.out.println("Drink some water.");
        }
        else if (temperature2 > 20 && temperature2 <= 30) // note, if only one action is being taken, no need to currly braces / code block
        // ^^ else if condition is redundent with the first condition... can be written as "(temperature2 > 20)"
        // ^^ in Java, it's "best practice" to start each condition on a new line...
            System.err.println("It's a beautiful day!");
        else {
            System.out.println("It's a cold day...");
            System.out.println("Maybe wear a coat?");
        }
            
        // Simplifying If Statements
        // ameture...
        int income = 120_000;
        boolean hasHighIncome2;
        if (income > 100_000)
            hasHighIncome2 = true;
        else
            hasHighIncome2 = false;
        // professional...
        boolean hasHighIncome3 = false;
        if (income > 100_000)
            hasHighIncome2 = true;
        // super professional...
        boolean hasHighIncomeBest = income > 100_000; // right side is a boolean expression...
        // mosh preferrs to wrap boolean expressions in parenthesis to make clear what is happening
        // ^^ i.e. (income > 100_000)

        // The Ternary Operator
        int income2 = 120_000;
        // ameture...
        String className;
        if (income > 100_000)
            className = "First";
        else
            className = "Economy";
        // professional...
        String className2 = "Economy"; // initialize variable to a value
        if (income > 100_000)
            className = "First";
        // super professional...
        String className3 = income > 100_000 ? "First" : "Economy";
        
        // Switch Statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admine");
                break;
            case "moderator":
                System.out.println("You're an moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        // Exercise: FizzBuzz
        // Reffer to exercise code...

        // For Loops
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);

        // While Loops
        int i = 5;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i--;
        }
        // another example
        Scanner scanner2 = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("quit")) { //! note: strings can't be compared with == in Java because it will compare their addresses in memory, not the actual value...
            System.out.print("Input: ");
            // Scanner scanner2 = new Scanner(System.in); //! This is bad practice as it will create a new scanner object for each instance of the loop and will pollute our memory
            userInput = scanner2.next().toLowerCase();
            System.out.println(userInput);
        }

        // Do..While Loops
        do {
            System.out.print("Input: ");
            userInput = scanner2.next().toLowerCase();
            System.out.println(userInput);
        } while (!userInput.equals("quit"));

        // Break and Continue
        while (true) { // will run for forever until the user enters "quit"
            System.out.print("Input: ");
            userInput = scanner2.next().toLowerCase();
            if (userInput.equals("pass"))
                continue; // jumps back to the top of the loop
            if (userInput.equals("quit"))
                break; // breaks out of the loop
            System.out.println(userInput);
        }

        // For-Each Loop
        // ^^ used to itterate over strings or array collections
        String[] fruits = { "Apple", "Mango", "Orange" };
        for (String fruit : fruits)
            System.out.println(fruit);
        
        // Project: Mortgage Calculator Pt. 2
        // ...Refer to project files...

    }
}
