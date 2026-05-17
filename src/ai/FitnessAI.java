package src.ai;
import java.util.Scanner;

public class FitnessAI extends AIAssistant {

    public FitnessAI(String assistantName) {
        super(assistantName);
    }

    @Override
    public void interact() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== FITNESS AI ===");
        System.out.println("What is your fitness goal?");
        System.out.println("1. Build Muscle");
        System.out.println("2. Lose Weight");
        System.out.println("3. Improve Flexibility");
        System.out.println("4. Reduce Stress");

        System.out.print("Choose: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nRecommendations:");
                System.out.println("- Strength training");
                System.out.println("- Eat protein-rich meals");
                System.out.println("- Sleep 8 hours");
                System.out.println("- Stay consistent");
                break;

            case 2:
                System.out.println("\nRecommendations:");
                System.out.println("- Cardio exercises");
                System.out.println("- Drink more water");
                System.out.println("- Reduce sugar intake");
                System.out.println("- Walk daily");
                break;

            case 3:
                System.out.println("\nRecommendations:");
                System.out.println("- Stretch daily");
                System.out.println("- Try yoga");
                System.out.println("- Improve posture");
                System.out.println("- Warm up properly");
                break;

            case 4:
                System.out.println("\nRecommendations:");
                System.out.println("- Deep breathing");
                System.out.println("- Meditation");
                System.out.println("- Light exercise");
                System.out.println("- Take breaks");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}