package Console_Quiz_App_using_Advance_Java;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
        questions[4] = new Question(5, "What is the chemical symbol for Gold?", "Au", "Ag", "Gd", "Go", "Au");
    }

    public void playQuiz() {

        int i = 0;
        for (Question q: questions) {
            System.out.println("---------------------------");
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();



        }

        for (String s: selection) {
            System.out.println("You selected: " + s);
        }
        
    }

    public void printScoreCard() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String selectedAnswer = selection[i];
            if (actualAnswer.equalsIgnoreCase(selectedAnswer)) {
                score += 10;
            }


        }

        System.out.println("Your total score is: " + score + " out of " + (questions.length * 10));
    }

}
