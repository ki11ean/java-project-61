package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static String gameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String game() {

        var numberOne = Engine.randomNumber();
        var numberTwo = Engine.randomNumber();
        var check = "";
        System.out.println("Question: " + numberOne + " " + numberTwo);

        while (numberTwo != 0) {
            int tmp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = tmp;
        }
        check = Integer.toString(numberOne + numberTwo);
        return check;
    }
}
