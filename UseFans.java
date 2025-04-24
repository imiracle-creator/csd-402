// Isaiah Miracle Module 7 UseFan.Java 04/27/2025
// UseFans.java
import java.util.ArrayList;

public class UseFans {

    // Method to display a collection of Fan instances
    public static void displayFanCollection(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displaySingleFan(fan);
        }
    }

    // Method to display a single Fan instance
    public static void displaySingleFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON [Speed: " + speedToString(fan.getSpeed()) +
                    ", Radius: " + fan.getRadius() + ", Color: " + fan.getColor() + "]");
        } else {
            System.out.println("Fan is OFF [Radius: " + fan.getRadius() + ", Color: " + fan.getColor() + "]");
        }
    }

    // Helper method to convert speed to string
    private static String speedToString(int speed) {
        switch (speed) {
            case Fan.SLOW: return "SLOW";
            case Fan.MEDIUM: return "MEDIUM";
            case Fan.FAST: return "FAST";
            default: return "STOPPED";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ArrayList<Fan> fanList = new ArrayList<>();

        // Creating Fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 12.0, "black");
        Fan fan3 = new Fan(Fan.SLOW, false, 8.5, "red");

        // Modify fan1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(10.0);
        fan1.setColor("blue");

        // Add to collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans in the collection
        System.out.println("Displaying all fans:");
        displayFanCollection(fanList);
    }
}
