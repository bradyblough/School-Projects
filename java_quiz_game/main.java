import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println( "Brady's Quiz Game\n"); // title
        float score = 0; // initializing the score variable

        System.out.println("You will be asked 5 questions.\nInput the letter associated with each answer.\nAt the end of the game, you will receive a final score.\n"); // introducing the game
        Scanner scanner = new Scanner(System.in); // scanner object to take user input

        // Question 1
        System.out.println("What is the capital of Pennsylvania?\nA. Somerset\nB. Harrisburg\nC. Johnstown\nD. Pittsburgh");
        String question_one = scanner.nextLine().toUpperCase();
        if (question_one.equals("B")) {
            score++;
        } else { // validating that user input is one of the four choices
            while (!(question_one.equals("A") || question_one.equals("B") || question_one.equals("C") || question_one.equals("D"))) {
                System.out.println("Please enter a letter: A, B, C, or D.");
                question_one = scanner.nextLine().toUpperCase();
            }
        }

        // Question 2
        System.out.println("How many letters are in the word 'cat'?\nA. 1 \nB. 2\nC. 3\nD. 4");
        String question_two = scanner.nextLine().toUpperCase();
        if (question_two.equals("C")) {
            score++;
        } else {
            while (!(question_two.equals("A") || question_two.equals("B") || question_two.equals("C") || question_two.equals("D"))) {
                System.out.println("Please enter a letter: A, B, C, or D.");
                question_two = scanner.nextLine().toUpperCase();
            }
        }

        // Question 3
        System.out.println("Who is the current President of the United States?\nA. Joe Biden \nB. Donald Trump \nC. George Washington\nD. Bernie Sanders");
        String question_three = scanner.nextLine().toUpperCase();
        if (question_three.equals("A")) {
            score++;
        } else {
            while (!(question_three.equals("A") || question_three.equals("B") || question_three.equals("C") || question_three.equals("D"))) {
                System.out.println("Please enter a letter: A, B, C, or D.");
                question_three = scanner.nextLine().toUpperCase();
            }
        }

        // Question 4
        System.out.println("How many Super Bowl wins do the Pittsburgh Steelers have?\nA. 2\nB. 3\nC. 5\nD. 6");
        String question_four = scanner.nextLine().toUpperCase();
        if (question_four.equals("D")) {
            score++;
        } else {
            while (!(question_four.equals("A") || question_four.equals("B") || question_four.equals("C") || question_four.equals("D"))) {
                System.out.println("Please enter a letter: A, B, C, or D.");
                question_four = scanner.nextLine().toUpperCase();
            }
        }

        // Question 5
        System.out.println("What day in December is Christmas celebrated in the United States? \nA. 1st\nB. 12th\nC. 25th \nD. 4th");
        String question_five = scanner.nextLine().toUpperCase();
        if (question_five.equals("C")) {
            score++;
        } else {
            while (!(question_five.equals("A") || question_five.equals("B") || question_five.equals("C") || question_five.equals("D"))) {
                System.out.println("Please enter a letter: A, B, C, or D.");
                question_five = scanner.nextLine().toUpperCase();
            }
        }

        scanner.close(); // closing scanner
        float score_percentage = (score / 5) * 100; // algorithm to calculate the amount correct as a percentage
        System.out.println("\nYou scored " + score_percentage + "%!"); // displaying the final score
    }
}
