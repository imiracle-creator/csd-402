//Isaiah Miracle Module 9 Program2 05/11/2025
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");

        try {
            // Create file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("Appending to existing file: " + file.getName());
            }

            // Write or append 10 random numbers
            FileWriter writer = new FileWriter(file, true); // true = append mode
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                writer.write(rand.nextInt(100) + " "); // Random numbers 0–99
            }
            writer.write("\n");
            writer.close();

            // Read and display the file contents
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of the file:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

