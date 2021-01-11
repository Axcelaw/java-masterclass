package com.walace.ex45;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String nameCustomer) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(nameCustomer))
                return this.customers.get((i));
        }

        return null;
    }

    public boolean newCustomer(String nameCustomer, double transaction) {
        if (findCustomer(nameCustomer) == null) {
            this.customers.add(new Customer(nameCustomer, transaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String nameCustomer, double transaction) {
        Customer customer = findCustomer(nameCustomer);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }
}
