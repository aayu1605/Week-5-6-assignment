import java.util.Scanner;

public class L2_LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        number = Math.abs(number); // handle negatives

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // --- Extract digits into array ---
        while (number != 0) {
            digits[index] = number % 10;   // extract last digit
            number = number / 10;          // remove last digit
            index++;
            if (index == maxDigit) break;  // array full
        }

        // --- Find largest and second largest ---
        int largest       = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;   // old largest becomes second
                largest       = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // --- Display ---
        System.out.print("\nDigits extracted: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + (i < index - 1 ? ", " : "\n"));
        }
        System.out.println("Largest digit        : " + largest);
        System.out.println("Second largest digit : " + secondLargest);

        sc.close();
    }
}