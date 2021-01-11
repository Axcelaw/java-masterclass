package com.walace.ex45;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String nameBranch) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameBranch))
                return this.branches.get(i);
        }

        return null;
    }

    public boolean addBranch(String nameBranch) {
        if (findBranch(nameBranch) == null) {
            this.branches.add(new Branch(nameBranch));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double transaction) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            return branch.newCustomer(nameCustomer, transaction);
        }

        return false;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double transaction) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            return branch.addCustomerTransaction(nameCustomer, transaction);
        }

        return false;
    }

    public boolean listCustomers(String nameBranch, boolean printTransactions) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else
            return false;
    }
}
