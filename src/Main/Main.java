package src.Main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import src.ai.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<AIAssistant> assistants = new ArrayList<>();

        assistants.add(new StudyAI("Study AI"));
        assistants.add(new FitnessAI("Fitness AI"));
        assistants.add(new MusicAI("Music AI"));
        assistants.add(new EmotionalSupportAI("Emotional Support AI"));

        int choice = 0;

        do {

            try {

                System.out.println("\n==== AI COMPANION SYSTEM ====");
                System.out.println("1. Study AI");
                System.out.println("2. Fitness AI");
                System.out.println("3. Music AI");
                System.out.println("4. Emotional Support AI");
                System.out.println("5. Exit");

                System.out.print("Choose: ");

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        assistants.get(0).interact();
                        break;

                    case 2:
                        assistants.get(1).interact();
                        break;

                    case 3:
                        assistants.get(2).interact();
                        break;

                    case 4:
                        assistants.get(3).interact();
                        break;

                    case 5:
                        System.out.println("Exiting system.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter numbers only.");
                input.nextLine();
            }

        } while (choice != 5);

        input.close();
    }
}
