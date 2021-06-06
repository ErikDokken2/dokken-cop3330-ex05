package exercises.ex05;
import java.util.Scanner;

/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

 */
public class ex05 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex05 example05 = new ex05();

        //Gets input
        String num1 = example05.inputNum1();
        String num2 = example05.inputNum2();

        int convertStrInt1 = example05.strInt1(num1);
        int convertStrInt2 = example05.strInt2(num2);

        int sum = example05.sumNum(convertStrInt1,convertStrInt2);
        int minus = example05.minusNum(convertStrInt1,convertStrInt2);
        int product = example05.productNum(convertStrInt1,convertStrInt2);
        int quotient = example05.quotientNum(convertStrInt1,convertStrInt2);

        String outputString = example05.outputString(convertStrInt1, convertStrInt2, sum, minus, product, quotient);
        example05.printOutput(outputString);
    }

    private void printOutput(String outputString) { System.out.println(outputString);
    }

    private String outputString(int convertStrInt1, int convertStrInt2, int sum, int minus, int product, int quotient) {
        return convertStrInt1 + " + " + convertStrInt2 + " = " + sum + "\n" + convertStrInt1 + " - " + convertStrInt2 + " = " + minus + "\n" + convertStrInt1 + " * " + convertStrInt2 + " = " + product + "\n" + convertStrInt1 + " / " + convertStrInt2 + " = " + quotient;
    }

    private int quotientNum(int val1, int val2) {
        return val1 / val2;
    }

    private int productNum(int val1, int val2) {
        return val1 * val2;
    }

    private int minusNum(int val1, int val2) {
        return val1 - val2;
    }

    private int sumNum(int val1, int val2) {
        return val1 + val2;
    }

    private int strInt1 (String num1) {

        int int1 = Integer.parseInt(num1);
        return int1;
    }

    private int strInt2 ( String num2) {

        int int2 = Integer.parseInt(num2);
        return int2;
    }
    private String inputNum1() {
        System.out.print("What is the first number? ");
        String num1 = in.nextLine();
        return num1;
    }
    private String inputNum2() {
        System.out.print("What is the second number? ");
        String num2 = in.nextLine();
        return num2;
    }

}
