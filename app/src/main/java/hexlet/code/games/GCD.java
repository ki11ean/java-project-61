package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static String greetingGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void game() {

        var numberOne = Engine.randomNumber();
        var numberTwo = Engine.randomNumber();

        System.out.println("Question: " + numberOne + " " + numberTwo);

        while (numberTwo != 0) {
            int tmp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = tmp;
        }
        Engine.check = Integer.toString(numberOne + numberTwo);
    }
}
