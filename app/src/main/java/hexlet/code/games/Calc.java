package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void game() {

        var gameRule = "What is the result of the expression?";
        String[] questions = new String[App.HOWMANYROUNDS];
        String[] checks = new String[App.HOWMANYROUNDS];

        var countRound = 0;

        while (countRound < App.HOWMANYROUNDS) {
            var operandOne = Utils.generateNumber(1, 100);
            var operandTwo = Utils.generateNumber(1, 100);
            var numberOperator = Utils.generateNumber(0, 3);
            String[] calcChecks = checkCalc(operandOne, operandTwo, numberOperator);
            questions[countRound] = (operandOne + calcChecks[0] + operandTwo);
            checks[countRound] = calcChecks[1];
            countRound++;
        }
        Engine.engine(gameRule, questions, checks);
    }

    public static String[] checkCalc(int operandOne, int operandTwo, int numberOperator) {

        String[] calcChecks = new String[2];

        switch (numberOperator) {
            case 0 -> {
                calcChecks[0] = " + ";
                calcChecks[1] = Integer.toString(operandOne + operandTwo);
            }
            case 1 -> {
                calcChecks[0] = " - ";
                calcChecks[1] = Integer.toString(operandOne - operandTwo);
            }
            case 2 -> {
                calcChecks[0] = " * ";
                calcChecks[1] = Integer.toString(operandOne * operandTwo);
            }
            default -> throw new Error("Error while default Calc.java");
        }

        return calcChecks;
    }
}
