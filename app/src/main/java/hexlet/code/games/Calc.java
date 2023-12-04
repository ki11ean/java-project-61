package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static String greetingGame() {
        return "What is the result of the expression?";
    }

    public static void game() {

        var operandOne = Engine.randomNumber();
        var operandTwo = Engine.randomNumber();
        final int numberOperator = (int) (Math.random() * 3);
        var operator = " ";
        var result = 0;

        switch (numberOperator) {
            case 0 -> {
                operator = " + ";
                result = operandOne + operandTwo;
            }
            case 1 -> {
                operator = " - ";
                result = operandOne - operandTwo;
            }
            case 2 -> {
                operator = " * ";
                result = operandOne * operandTwo;
            }
            default -> throw new Error("Error while default Calc.java");
        }
        Engine.check = Integer.toString(result);
        System.out.println("Question: " + operandOne + operator + operandTwo);
    }
}
