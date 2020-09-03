import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // primitive types
        byte age = 30;
        long viewsCount = 3_123_456_789L; // we add "L" as a suffix because the Java compiler defaults reading values as integers...
        float price = 10.99F; // we add "F" as a suffix because the Java compiler defaults to reading numbers with a "." as a double.
        char letter = 'A';
        boolean isEligable = true;

        // reference types
        byte age2 = 25;
        Date now = new Date();
        System.out.println(now);

        String message = new String("Hello World"); // note: this is redundent
        String message2 = "Hello World 2"; // this is the same as above, a short hand to initialize a string variable
        String message3 = "String 1" + "string 2"; // string concatination
        message3.replace("2", "2.5"); // note: .replace() does not modify the message3 string... it returns a new string. In Java, strings are immutiable.
        System.out.println(message3);
        System.out.println(message3.replace("2", "2.5"));

        // Escape Sequences
        String escappedDoubleQuotes = "Hello \"World\"";
        String escappedForwardSlash = "c:\\Windows\\...";
        String escappedNewLine = "c:\nWindows\\...";
        String escappedTab = "c:\tWindows\\...";

        // Arrays (also known as a list)
        // note: IMPORTANT! in Java, once an array size is specified, it cannpt be changed. They are fixed in size...
        // old way of initializing
        int[] numbers = new int[5]; // the "5" in int[5] specifies the size of the array
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // this will print in memory address pointer, not the array itself
        String stringRepresentationOfNumbers = Arrays.toString(numbers);
        System.out.println(stringRepresentationOfNumbers);
        // new, simplier way of initializing
        int[] numbers2 = { 2, 3, 5, 1, 5};

        // sorting an array
        // int[] numbers2SortedArray = Arrays.sort(numbers2);
        Arrays.sort(numbers2);
        System.out.println(numbers2);

        // Multi-demensional Arrays
        int[][] twoDemnshionalArray = new int[2][3]; // two rows and three columns
        twoDemnshionalArray[0][0] = 1;
        System.out.println(Arrays.deepToString(twoDemnshionalArray));
        // currly brace syntax - quick initialization
        int[][] twoDemnshionalArrayInitialized = { { 1, 2, 3}, { 4, 5, 6} }; // two rows and three columns
        System.out.println(Arrays.deepToString(twoDemnshionalArrayInitialized));

        // Constants
        final float PI = 3.14F; // keyword "final" treats variable as a constant - also, by convention we use all caps to name constans in Java

        // Arithmetic Expressions
        // Same as we have in math...
        int result = 10 + 3;
        System.out.println(result);
        // note, in Java the division of two whole numbers results in a whole number...
        int result2 = 10 / 3;
        System.out.println(result2); // returns 3 instead of 3.333...
        // ^^ to get a floating point, we need to convert to a 'float' or a 'double'
        double result3 = (double)10 / (double)3; // with the "(double)" prefix, we are now casting the ints to a double - we also change the variable type to match the cast <- also known as explicit casting
        // ^^ note: the above is alos known as an "expression" -> any bit of code that returns a result
        System.out.println(result3);
        // increment and decrement opperators
        int a = 1;
        a++;
        //! ^^ note order...
        // if done after, i.e. int c = a++; <- "a" will be copied to "c" and then "a" will be incremented...
        // if done before, i.e. int c = ++a; <- "c" will equal "a" + 1 and then "a" will be incremented...
        int b = 1;
        b--;
        // augmented or compound assignment opperator
        a += 2;

        // Order of Opperations
        int x = 10 + 3 * 2; // result = 16
        // PEMDAS

        // Casting
        // implicit casting
        // byte > short > int > long <- byte can be converted into short, short into int, int into long, etc...
        short x2 = 1;
        int y = x2 + 2;
        // what about flotating numbers...
        // ^^ long > float > double...
        double x3 = 1.1;
        double y2 = x3 + 2; // an int is less percise than a double, so it gets auto casted...
        // explicit casting
        int y3 = (int)x3 + 2;
        // string to int conversion
        String x4 = "1";
        int y4 = Integer.parseInt(x4);
        // ^^ similarly we have parseShort() and parseFloat(), etc. 

        // The Math Class
        int resultUsingMath = Math.round(1.1F);
        System.out.println(resultUsingMath);
        // ceiling
        int ceailingUsingMath = (int)Math.ceil(1.1F);
        // floor
        int floorUsingMath = (int)Math.floor(1.1F);
        // max
        int maxUsingMath = Math.max(1, 2);
        // min
        // random
        double randomUsingMath = Math.random();
        // ^^ to get a range... multipy by top of range
        double randomRangeUsingMath = Math.random() * 100;

        // Formatting Numbers
        // NumberFormat currency = new NumberFormat() // NumberFormat() is an abstract class and cannot be instanciated using the "new" keyword
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // <- this is a factory method
        String currencyFormattedString = currency.format(1234567.891);
        System.out.println(currencyFormattedString);
        // percentages... NumberFormat.getPercentInstance();
        // shorthand if you don't need to store as a variable
        String percentFormattedString = NumberFormat.getPercentInstance().format(0.1); // <- also known as "method chaining...""
        System.out.println(percentFormattedString);

        // Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte userAge = scanner.nextByte();
        System.out.println("You are " + userAge);
        System.out.print("Name: ");
        String userName = scanner.next();
        System.out.println("You are " + userName);
        // note: inputs separated by spaces are considered separate tokens in Java... to get around this, use the ".nextLine()" method to get the entire line
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine(); //! Not working as expected... // to get rid of extra white spaces, you can chain .trim() to .nextLine()
        System.out.println("You are " + fullName);

        // Project: Mortgate Calculator
        // ...Refer to project files...
    }
}

