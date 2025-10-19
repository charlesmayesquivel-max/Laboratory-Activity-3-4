public class Customer {
    // Instance Variables
    private String name;
    private int points;

    // Static Variable
    private static int totalCustomers = 0;

    // Default Constructor
    public Customer() {
        this.name = "Unknown Customer";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized Constructor (name + points)
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Parameterized Constructor (name only)
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // Instance Method: Add Points
    public void addPoints(int additionalPoints) {
        this.points += additionalPoints;
        System.out.println(this.name + " earned " + additionalPoints + 
                           " points. Total points: " + this.points);
    }

    // Instance Method: Redeem Reward
    public void redeemReward() {
        System.out.println("\nRedeeming reward for " + this.name + "...");
        if (this.points >= 100) {
            int redeemCount = this.points / 100;
            this.points %= 100;
            System.out.println(this.name + " redeemed " + redeemCount + 
                               " free drink(s). Remaining points: " + this.points);
        } else {
            System.out.println(this.name + " does not have enough points to redeem a reward.");
        }
    }

    // Display Customer Info
    public void displayCustomerInfo() {
        System.out.println("--------------------------------------------");
        System.out.println("Customer Name : " + this.name);
        System.out.println("Current Points : " + this.points);
        System.out.println("--------------------------------------------");
    }

    // Static Method: Display Total Customers
    public static void displayTotalCustomers() {
        System.out.println("Total Customers Registered: " + totalCustomers);
    }

    // Static Method: Show Allowed Reward Redemptions
    public static void getAllowedRewardsRedemption(Customer c) {
        int redeemable = c.points / 100;
        System.out.println(c.name + " can redeem " + redeemable + " free drink(s).");
    }
}
