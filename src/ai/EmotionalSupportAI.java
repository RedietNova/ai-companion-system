package src.ai;
import java.util.Scanner;

public class EmotionalSupportAI extends AIAssistant {

    public EmotionalSupportAI(String assistantName) {
        super(assistantName);
    }

    @Override
    public void interact() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== EMOTIONAL SUPPORT AI ===");
        System.out.println("How are you feeling?");
        System.out.println("1. Stressed");
        System.out.println("2. Lonely");
        System.out.println("3. Unmotivated");
        System.out.println("4. Overwhelmed");

        System.out.print("Choose: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nSuggestions:");
                System.out.println("- Take deep breaths");
                System.out.println("- Drink water");
                System.out.println("- Take a short break");
                break;

            case 2:
                System.out.println("\nSuggestions:");
                System.out.println("- Talk to someone you trust");
                System.out.println("- Go outside for a walk");
                System.out.println("- Listen to calming music");
                break;

            case 3:
                System.out.println("\nSuggestions:");
                System.out.println("- Start with small tasks");
                System.out.println("- Focus on progress");
                System.out.println("- Avoid overthinking");
                break;

            case 4:
                System.out.println("\nSuggestions:");
                System.out.println("- Organize your tasks");
                System.out.println("- Rest for a while");
                System.out.println("- Focus on one thing at a time");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
