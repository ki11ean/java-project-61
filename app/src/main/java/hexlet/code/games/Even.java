package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Even {

    public static String greetingGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void even() {

        Scanner scanner = new Scanner(System.in);

        var randomNum = Engine.randomNumber();

        Engine.check = ((randomNum % 2) == 0) ? "yes" : "no";
        System.out.println("Question: " + randomNum);
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
