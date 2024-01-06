import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();

        // Basic Plan

        System.out.println("Hello, what is your name?");
        user.Name = scanner.next();

        System.out.println("Hello " + user.Name + "," + " what is your budget goal?");
        user.Goal = scanner.nextInt();

        System.out.println("Enter target amount months for goal: ");
        user.Planned_Months = scanner.nextInt();

        System.out.println(user.Name + "," + " you'd like to save $" + user.Goal + " in " + user.Planned_Months + " months.");

        // Ask the user how much money they made this week
        // Ask the user to add expenses || Name of expense and cost || Keep repeating until users done
        // Tell the user how much they should save, and how much they should keep for spending money
    }
}