package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even() {

        Greet.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var name = Greet.getName();
        var i = 0;
        var check = "";
        var answer = "";
        Scanner scanner = new Scanner(System.in);
        while (i < 3) {

            int randomNum = (int) (Math.random() * 100) + 1;

            check = ((randomNum % 2) == 0) ? "yes" : "no";
            System.out.println("Question: " + randomNum);

            answer = scanner.next();

            if (answer.equals(check)) {
                System.out.println("Correct!");
                i++;
            } else {
                break;
            }
        }
        scanner.close();

        if (i == 3) {
            System.out.println("Congratulations, " + name);
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + check + "'.");
        }
    }
}
