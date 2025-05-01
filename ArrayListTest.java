//Isaiah Miracle Module 8 ArrayListTest.Java 5/4/2025
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop and include 0 in the list):");
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                numbers.add(input);
                if (input == 0) break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        Integer largest = max(numbers);
        System.out.println("The largest value in the list is: " + largest);
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}
