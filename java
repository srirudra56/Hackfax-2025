import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class HealthTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        System.out.println("Health Tracker for " + today);

        // water
        System.out.print("Enter cups of water today: ");
        int water = scanner.nextInt();

        // sleep
        System.out.print("Enter hours of sleep: ");
        double sleep = scanner.nextDouble();
        scanner.nextLine();

        // exercise
        System.out.print("Enter exercise type: ");
        String type = scanner.nextLine();

        System.out.print("Duration: ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Intensity: ");
        String intensity = scanner.nextLine();

        scanner.close();
    }
}
