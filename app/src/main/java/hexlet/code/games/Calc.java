package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static String greetingGame() {
        return "What is the result of the expression?";
    }

    public static void game() {

        var operandOne = Engine.randomNumber();
        var operandTwo = Engine.randomNumber();
        var numberOperand = (int) (Math.random() * 3);
        var operand = " ";
        var result = 0;

        switch (numberOperand) {
            case 1:
                operand = " + ";
                result = operandOne + operandTwo;
                Engine.check = Integer.toString(result);
                break;
            case 2:
                operand = " - ";
                result = operandOne - operandTwo;
                Engine.check = Integer.toString(result);
                break;
            case 3:
                operand = " * ";
                result = operandOne * operandTwo;
                Engine.check = Integer.toString(result);
                break;
            default:
                throw new Error("Error while default Calc.java");
        }
        System.out.println("Question: " + operandOne + operand + operandTwo);
    }
}
