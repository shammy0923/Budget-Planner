import java.util.Scanner;

public class User {
    public  String Name;
    public int Goal;
    public int Planned_Months;

    public int Current_Money;

    Scanner scanner = new Scanner(System.in);

    public void addMoney(int amount) {
        System.out.println("You have added $" + amount + " to your balance");
        Current_Money += amount;
    }

    public void removeMoney(int amount) {
        System.out.println("You have removed $" + amount + " from your balance");
        Current_Money -= amount;
    }

    public void weeklyBudget() {
        System.out.println("How much money did you make this week?");
        int moneyForWeek = scanner.nextInt();

        boolean running = true;

        while (running) {
            System.out.println("Do you have any expenses you'd like to add?");
            System.out.println("Y - Yes \n N - No");

            char option = scanner.next().toLowerCase().charAt(0);

            switch (option) {
                case 'y':
                    System.out.println("How much is your expense?");
                    int expense = scanner.nextInt();
                    moneyForWeek -= expense;
                    break;
                case 'n':
                    running = false;
                    break;
            }
        }

        System.out.println("Your remaining money will be added to your savings.");
        addMoney(moneyForWeek);
    }

    public int getProjectedMonthlyAmount() {
        return (Goal - Current_Money) / Planned_Months;
    }
}


