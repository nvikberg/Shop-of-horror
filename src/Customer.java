
public class Customer {

    //attributes for Customer class
    int itemsPurchased;
    double totalCost;

    public Customer(int itemsPurchased, double totalCost) { //construktor for customer class
        this.itemsPurchased = itemsPurchased;
        this.totalCost = totalCost;
    }

    void finalPurchase() { //method for end of program (total purchased info)
        System.out.printf("You purchased %d items and your total cost was %.2f kr\n", itemsPurchased, totalCost);
        System.out.println("Thank you for shopping with us!");
    }
}
    /*
    public int getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(int itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

     */


