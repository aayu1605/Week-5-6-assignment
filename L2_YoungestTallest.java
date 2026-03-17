import java.util.Scanner;

public class L2_YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names  = {"Amar", "Akbar", "Anthony"};
        int[]    age    = new int[3];
        double[] height = new double[3];

        // --- Input Loop ---
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + names[i] + ":");
            System.out.print("  Enter age (years)  : ");
            age[i] = sc.nextInt();
            System.out.print("  Enter height (cm)  : ");
            height[i] = sc.nextDouble();
        }

        // --- Find youngest and tallest ---
        int    youngestIdx = 0;
        int    tallestIdx  = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i]    < age[youngestIdx])    youngestIdx = i;
            if (height[i] > height[tallestIdx])  tallestIdx  = i;
        }

        // --- Display results ---
        System.out.println("\n======== Results ========");
        System.out.println("Youngest : " + names[youngestIdx]
                         + " (Age: " + age[youngestIdx] + " years)");
        System.out.println("Tallest  : " + names[tallestIdx]
                         + " (Height: " + height[tallestIdx] + " cm)");

        sc.close();
    }
}