public class DiscountedProduct extends Products { //get subclass from Products by using "extends"

    double discount; //new attribute for this subclass

    public DiscountedProduct(String name, double price, double discount, int qty) {
        super(name, price, qty); //all attributes from Products class
       this.price = price - (discount/100*price); //creating discounted price ("price" = "discounted price" in this class)

    }

}

