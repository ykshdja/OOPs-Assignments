
import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String fname = sc.nextLine();

        System.out.print("Last name: ");
        String lname = sc.nextLine();

        System.out.print("Birth month (1-12): ");
        int month = Integer.parseInt(sc.nextLine());

        System.out.print("Birth day (1-31): ");
        int day = Integer.parseInt(sc.nextLine());

        System.out.print("Birth year (yyyy): ");
        int year = Integer.parseInt(sc.nextLine());

        HeartRate hr = new HeartRate(fname, lname, month, day, year);

        System.out.println("\n" + hr);
        System.out.println("Age: " + hr.getAge());
        System.out.println("Maximum heart rate: " + hr.getMaximumHeartRate() + " bpm");
        System.out.println("Target heart-rate range: " + hr.getTargetHeartRate());
    }
}