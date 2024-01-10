import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();

        // Basic Prompts

        System.out.println("Hello, what is your name?");
        user.Name = scanner.next();

        System.out.println("Hello " + user.Name + "," + " what is your budget goal?");
        user.Goal = scanner.nextInt();

        System.out.println("Enter target amount months for goal: ");
        user.Planned_Months = scanner.nextInt();

        System.out.println("How much do you currently have saved?");
        user.Current_Money = scanner.nextInt();

        int Projected_Monthly_Amount = user.getProjectedMonthlyAmount();
        int Projected_Weekly_Amount = (Projected_Monthly_Amount / 4);

        System.out.println("You will need to save $" + Projected_Monthly_Amount + " a month or $" + Projected_Weekly_Amount + " a week.");

        boolean Running = true;

        while (Running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("\n0 - Exit Application");
            System.out.println("1 - Add Money");
            System.out.println("2 - See Current Goal Projections");
            System.out.println("3 - Budget for Current Week");

            int Option = scanner.nextInt();

            switch (Option) {
                case 0:
                    Running = false;
                    break;
                case 1:
                    System.out.println("How much money would you like to add?");
                    user.addMoney(scanner.nextInt());
                    break;
                case 2:
                    Projected_Monthly_Amount = user.getProjectedMonthlyAmount();
                    Projected_Weekly_Amount = (Projected_Monthly_Amount / 4);
                    System.out.println("You will need to save $" + Projected_Monthly_Amount + " a month or $" + Projected_Weekly_Amount + " a week.");
                case 3:
                    user.weeklyBudget();
            }
        }

        // Ask the user how much money they made this week
        // Ask the user to add expenses || Name of expense and cost || Keep repeating until users done
        // Tell the user how much they should save, and how much they should keep for spending money
    }
}