package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;


public class Engine {

    public static int i;   //счётчик игр
    public static String check;
    public static String answer;
    public static void engine() {

        switch (App.numberGame) {
            case 1:
                Greet.greet();
                break;
            case 2:
                Greet.greet();
                System.out.println(Even.greetingGame());
                break;
            case 3:
                Greet.greet();
                System.out.println(Calc.greetingGame());
                break;
            default:
                System.exit(0);
        }

        i = 0;
        Scanner scanner = new Scanner(System.in);

        while (i < 3) {
            switch (App.numberGame) {
                case 1:
                    i = 4;
                    break;
                case 2:
                    Even.even();
                    break;
                case 3:
                    Calc.calc();
                    break;
                default:
                    throw new Error("Error while default Engine.java");
            }
            System.out.print("Your answer: ");

            Engine.answer = scanner.next();

            if (Engine.answer.equals(Engine.check)) {
                System.out.println("Correct!");
                Engine.i++;
            } else {
                Engine.i = 4;
            }
        }

        if (i == 3) {
            System.out.println("Congratulations, " + Greet.name + "!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + check + "'.");
            System.out.println("Let's try again, " + Greet.name + "!");
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}