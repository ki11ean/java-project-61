package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void game() {

        var gameRule = "What is the result of the expression?";
        String[][] questionsChecks = new String[Engine.HOW_MANY_ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int operandOne = Utils.generateNumber(1, 100);
            final int operandTwo = Utils.generateNumber(1, 100);
            final int numberOperator = Utils.generateNumber(0, 2);
            String[] operators = {" + ", " - ", " * "};
            questionsCheck[0] = (operandOne + operators[numberOperator] + operandTwo);
            questionsCheck[1] =
                    Integer.toString(calc(operandOne, operandTwo, operators[numberOperator]));
        }
        Engine.engine(gameRule, questionsChecks);
    }

    public static int calc(int operandOne, int operandTwo, String operator) {

        switch (operator) {
            case " + " -> {
                return operandOne + operandTwo;
            }
            case " - " -> {
                return operandOne - operandTwo;
            }
            case " * " -> {
                return operandOne * operandTwo;
            }
            default -> throw new Error("Error while default Calc.java");
        }
    }
}
