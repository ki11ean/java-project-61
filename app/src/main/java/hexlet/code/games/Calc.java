package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {

    public static String greetingGame() {
        return "What is the result of the expression?";
    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        var operandOne = Engine.randomNumber();
        var operandTwo = Engine.randomNumber();
        String[] operations = {"+", "-", "*"};
        var numberOperand = (int) (Math.random() * 3);
        var result = 0;

        switch (operations[numberOperand]) {
            case "+":
                result = operandOne + operandTwo;
                Engine.check = Integer.toString(result);
                break;
            case "-":
                result = operandOne - operandTwo;
                Engine.check = Integer.toString(result);
                break;
            case "*":
                result = operandOne * operandTwo;
                Engine.check = Integer.toString(result);
                break;
            default:
                throw new Error("Error while default Calc.java");
        }

        System.out.println("Question: " + operandOne + " " + operations[numberOperand] + " " + operandTwo);
        System.out.print("Your answer: ");
        Engine.answer = scanner.next();

        if (Engine.answer.equals(Engine.check)) {
            System.out.println("Correct!");
            Engine.i++;
        } else {
            Engine.i = 4;
        }
    }
}
