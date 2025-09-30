import java.util.Scanner;

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter destination city >> ");
        String dest = input.nextLine();

        System.out.print("Enter departure city >> ");
        String dep = input.nextLine();

        System.out.print("Enter mode of travel (car, plane, train, etc.) >> ");
        String mode = input.nextLine();

        DebugTrip trip1 = new DebugTrip(dest);

        DebugTrip trip2 = new DebugTrip(dest, dep);

        DebugTrip trip3 = new DebugTrip(dest, dep, mode);

        System.out.println("\nTrip 1:");
        displayTrip(trip1);

        System.out.println("\nTrip 2:");
        displayTrip(trip2);

        System.out.println("\nTrip 3:");
        displayTrip(trip3);
    }

    private static void displayTrip(DebugTrip trip) {
        System.out.println("Destination: " + trip.getDestination());
        System.out.println("Departure : " + trip.getDepartureCity());
        System.out.println("Mode      : " + trip.getMode());
    }
}
