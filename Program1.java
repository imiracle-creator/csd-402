//Isaiah Miracle Module 9 Program1 05/11/2025
import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("honeydew");
        words.add("kiwi");
        words.add("lemon");

        // For-each loop to print all elements
        System.out.println("Here is the list of fruits:");
        for (String word : words) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you want to see again: ");
        String input = scanner.nextLine();

        try {
            // Autoboxing and Unboxing
            Integer index = Integer.parseInt(input); // Auto-unboxing from String to int
            System.out.println("You selected: " + words.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}

