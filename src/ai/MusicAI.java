package src.ai;
import java.util.Scanner;
public class MusicAI extends AIAssistant {

    public MusicAI(String assistantName) {
        super(assistantName);
    }

    @Override
    public void interact() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== MUSIC AI ===");
        System.out.println("What mood are you in?");
        System.out.println("1. Energetic");
        System.out.println("2. Relaxed");
        System.out.println("3. Romantic");
        System.out.println("4. Emotional");

        System.out.print("Choose: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nRecommendations:");
                System.out.println("- Upbeat pop music");
                System.out.println("- Workout playlists");
                System.out.println("- Dance tracks");
                break;

            case 2:
                System.out.println("\nRecommendations:");
                System.out.println("- Soft instrumental music");
                System.out.println("- Chill playlists");
                System.out.println("- Acoustic songs");
                break;

            case 3:
                System.out.println("\nRecommendations:");
                System.out.println("- Love songs");
                System.out.println("- Romantic playlists");
                System.out.println("- Slow music");
                break;

            case 4:
                System.out.println("\nRecommendations:");
                System.out.println("- Calm emotional music");
                System.out.println("- Piano playlists");
                System.out.println("- Deep lyrical songs");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}

