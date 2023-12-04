package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static String greetingGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void game() {

        var randomNum = Engine.randomNumber();

        Engine.check = ((randomNum % 2) == 0) ? "yes" : "no";
        System.out.println("Question: " + randomNum);
    }
}
