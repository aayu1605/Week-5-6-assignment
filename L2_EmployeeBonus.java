import java.util.Scanner;

public class L2_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary       = new double[10];
        double[] yearsService = new double[10];
        double[] bonus        = new double[10];
        double[] newSalary    = new double[10];

        double totalBonus     = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // --- Input Loop ---
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("  Enter salary: ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("  Invalid salary. Please re-enter.");
                i--;
                continue;
            }

            System.out.print("  Enter years of service: ");
            yearsService[i] = sc.nextDouble();
            if (yearsService[i] < 0) {
                System.out.println("  Invalid years of service. Please re-enter.");
                i--;
                continue;
            }
        }

        // --- Calculation Loop ---
        for (int i = 0; i < 10; i++) {
            double rate = (yearsService[i] > 5) ? 0.05 : 0.02;
            bonus[i]        = salary[i] * rate;
            newSalary[i]    = salary[i] + bonus[i];
            totalBonus      += bonus[i];
            totalOldSalary  += salary[i];
            totalNewSalary  += newSalary[i];
        }

        // --- Display Results ---
        System.out.println("\n========== Zara Employee Bonus Report ==========");
        System.out.printf("%-6s %-12s %-10s %-10s %-12s%n",
                          "Emp", "Old Salary", "Yrs", "Bonus", "New Salary");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-6d %-12.2f %-10.1f %-10.2f %-12.2f%n",
                              (i + 1), salary[i], yearsService[i], bonus[i], newSalary[i]);
        }
        System.out.println("================================================");
        System.out.printf("%-6s %-12.2f %-10s %-10.2f %-12.2f%n",
                          "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);

        sc.close();
    }
}