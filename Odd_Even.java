import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Taking user input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");

        // Check positive/negative/zero and even/odd
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i] + " is positive and even.");
                } else {
                    System.out.println(nums[i] + " is positive and odd.");
                }
            } else if (nums[i] < 0) {
                System.out.println(nums[i] + " is negative.");
            } else {
                System.out.println(nums[i] + " is zero.");
            }
        }

        // Compare first and last element
        System.out.println("\n--- First vs Last ---");
        if (nums[0] == nums[4]) {
            System.out.println("First (" + nums[0] + ") and last (" + nums[4] + ") elements are equal.");
        } else if (nums[0] > nums[4]) {
            System.out.println("First (" + nums[0] + ") is greater than last (" + nums[4] + ").");
        } else {
            System.out.println("First (" + nums[0] + ") is less than last (" + nums[4] + ").");
        }

        sc.close();
    }
}