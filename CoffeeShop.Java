public class CoffeeShop {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  BeanBrew Coffee Shop Rewards System");
        System.out.println("==============================================\n");

        // 1. Create Customers
        Customer c1 = new Customer("Joseph", 200);  // parameterized
        Customer c2 = new Customer("Peter");        // name only
        Customer c3 = new Customer();               // default constructor

        System.out.println("Initial customers have been created.\n");

        // 2. Peter’s Transactions
        System.out.println("Peter's Transactions:");
        c2.addPoints(200); // pastries and beverages
        c2.addPoints(20);  // water

        System.out.println("\n==============================================");

        // 3. Redeem rewards across all customers
        System.out.println("\nReward Redemption:");
        c1.redeemReward();
        c2.redeemReward();
        c3.redeemReward();

        System.out.println("\n==============================================");

        // 4. Display Customer Info & Total Customers
        System.out.println("\nCustomer Information:");
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();

        Customer.displayTotalCustomers();

        System.out.println("\n==============================================");

        // 5. Fourth Customer: Diane
        System.out.println("A new customer has arrived: Diane");
        Customer c4 = new Customer("Diane");
        c4.addPoints(50);

        Customer.displayTotalCustomers();

        System.out.println("\n==============================================");

        // 6. Display Reward Eligibility
        System.out.println("Reward Redemption Summary:");
        Customer.getAllowedRewardsRedemption(c1);
        Customer.getAllowedRewardsRedemption(c2);
        Customer.getAllowedRewardsRedemption(c3);
        Customer.getAllowedRewardsRedemption(c4);

        System.out.println("\n==============================================");
        System.out.println("End of Program. Thank you for visiting BeanBrew!");
        System.out.println("==============================================");
    }
}
