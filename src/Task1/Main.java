package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Tom", "The Cat", "JerryTheCat"));
        customers.add(new Customer("Jerry", "The Mouse", "cheeselover"));
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
