import java.util.Scanner;

public class L3_DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        number = Math.abs(number);          // handle negatives

        // --- Step 1: Count digits ---
        int count = 0;
        long temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // --- Step 2: Extract digits into array ---
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // --- Step 3: Build frequency array (size 10 for digits 0–9) ---
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // --- Step 4: Display ---
        System.out.println("\nNumber   : " + number);
        System.out.println("Digits   : " + count);
        System.out.println("\n--- Digit Frequency ---");
        for (int d = 0; d <= 9; d++) {
            if (frequency[d] > 0) {
                System.out.println("Digit " + d + " appears " + frequency[d]
                                 + " time(s)");
            }
        }

        sc.close();
    }
}