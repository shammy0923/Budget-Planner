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

        int Projected_Monthly_Amount = (user.Goal - user.Current_Money) / user.Planned_Months;
        int Projected_Weekly_Amount = (Projected_Monthly_Amount / 4);

        System.out.println("You will need to save $" + Projected_Monthly_Amount + " a month or $" + Projected_Weekly_Amount + " a week.");


        // Ask the user how much money they made this week
        // Ask the user to add expenses || Name of expense and cost || Keep repeating until users done
        // Tell the user how much they should save, and how much they should keep for spending money
    }
}