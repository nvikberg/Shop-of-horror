//Nikolina Vikberg

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //new scanner object to read user input
        Customer customer = new Customer(0, 0.00); //create new customer object from customer class and set starting totals to 0


        //new objects from products class with their attributes
        Products bloodyBlade = new Products("Bloody Blade", 30.49, 5);
        Products fakePuke = new Products("Fake Puke", 45.49, 18);
        DiscountedProduct killerKnife = new DiscountedProduct("Killer knife", 19.99, 30, 10);

        System.out.println("Welcome to my halloween store");
        System.out.println("Please choose items for purchase");


        while (true) { //while statement


            System.out.printf("1: ");
            killerKnife.info(); //import product info
            System.out.print("2: ");
            bloodyBlade.info(); //import product info
            System.out.print("3: ");
            fakePuke.info(); //import product info
            System.out.print("4: Exit\n");
            int userInput = input.nextInt(); //creating variable to read users input (in int)


            if (userInput == 1) { //if user press 1, all this code below happens
                System.out.println("You added " + killerKnife.getName()); //let user know what product they chose
                customer.totalCost += killerKnife.getPrice(); //adds price of knife to the "total cost basket"
                customer.itemsPurchased += 1; //Adds item to items purchased
                killerKnife.qty -=1; //Subtracts quantity from total product quantity

            } else if (userInput == 2) { //if user press 2, all this code below happens, same as above
                System.out.println("You added " + bloodyBlade.getName());
                customer.totalCost += bloodyBlade.getPrice(); //
                customer.itemsPurchased += 1;
                bloodyBlade.qty -=1;

            } else if (userInput == 3) { //if user press 3, all this code below happens
                System.out.println("You added " + fakePuke.getName());
                customer.totalCost += fakePuke.getPrice();
                customer.itemsPurchased += 1;
                fakePuke.qty -=1;

            } else { //no other conditions left //exit message below in method
                customer.finalPurchase(); //call on method for showing total purchase

                 break; //break to end loop which will end program
            }

        } //end while loop

    }
}