package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static String greetingGame() {
        return "What is the result of the expression?";
    }

    public static void calc() {

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
    }
}
