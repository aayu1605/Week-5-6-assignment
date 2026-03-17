import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");

        // Infinite loop — breaks on condition
        while (true) {
            if (index == 10) {
                System.out.println("Array is full (10 numbers reached).");
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();

            if (input <= 0) {
                System.out.println("Zero or negative entered. Stopping input.");
                break;
            }

            numbers[index] = input;
            index++;
        }

        // Sum loop
        System.out.println("\n--- Entered Numbers ---");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}