public class User {
    public  String Name;
    public int Goal;
    public int Planned_Months;

    public int Current_Money;

    public void addMoney(int amount) {
        System.out.println("You have added $" + amount + " to your balance");
        Current_Money += amount;
    }

    public int getProjectedMonthlyAmount() {
        return (Goal - Current_Money) / Planned_Months;
    }
}


