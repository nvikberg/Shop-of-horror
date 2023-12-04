public class Products {


    //Attributes for Products
    private String name;
    double price;
    int qty;


    //constructor for products
   public Products (String name, double price, int qty) {
       this.name = name;
       this.price = price;
       this.qty = qty;
   }

   public void info() {
       System.out.printf("%s, %.2fkr, %d kvar\n", name, price, qty); //method for products info
   }


    public String getName() { //getter metod for Name
        return name;
    }

    public double getPrice() { //getter metod for price
        return price;
    }


}
