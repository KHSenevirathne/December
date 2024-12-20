import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        QSelector();
    }

    private static void QSelector() {

        String[] Questions = { "what is the color of sky?",
                "what is the higest mountain in KM?", "how many moons earth have?", "Average hight of Human in Feet?" };

        // System.out.println(Questions.length);
        Random rand = new Random();
        int randomNumber = rand.nextInt(Questions.length);

        System.out.println("Question: " + Questions[randomNumber]);
        System.out.print("Answer: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String answer = scanner.nextLine();
            ASelector(randomNumber,answer);
        }
    }

    private static void ASelector(int randomNumber, String answer) {
    
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        if(randomNumber == 0) {
            if(answer.equals("blue")){
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Invalid Answer!");
            }
        }
        else if(randomNumber == 1){
            if(answer.equals("8")){
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Invalid Answer!");
            }
        }
        else if(randomNumber == 2){
            if(answer.equals("1")){
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Invalid Answer!");
            }
        }
        else if(randomNumber == 3){
            if(answer.equals("6")){
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Invalid Answer!");
            }
        }
    }
}
