package src.ai;
import java.util.Scanner;

public class StudyAI extends AIAssistant {

    public StudyAI(String assistantName) {
        super(assistantName);
    }

    @Override
    public void interact() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== STUDY AI ===");
        System.out.println("What type of learner are you?");
        System.out.println("1. Visual Learner");
        System.out.println("2. Auditory Learner");
        System.out.println("3. Reading/Writing Learner");
        System.out.println("4. Practical Learner");

        System.out.print("Choose: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nRecommendations:");
                System.out.println("- Use mind maps");
                System.out.println("- Watch educational videos");
                System.out.println("- Use color notes");
                System.out.println("- Study with diagrams");
                break;

            case 2:
                System.out.println("\nRecommendations:");
                System.out.println("- Listen to recorded lectures");
                System.out.println("- Study aloud");
                System.out.println("- Join discussions");
                System.out.println("- Use podcasts");
                break;

            case 3:
                System.out.println("\nRecommendations:");
                System.out.println("- Rewrite your notes");
                System.out.println("- Read textbooks carefully");
                System.out.println("- Summarize information");
                System.out.println("- Practice writing explanations");
                break;

            case 4:
                System.out.println("\nRecommendations:");
                System.out.println("- Practice with exercises");
                System.out.println("- Use experiments");
                System.out.println("- Build projects");
                System.out.println("- Learn by doing");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}