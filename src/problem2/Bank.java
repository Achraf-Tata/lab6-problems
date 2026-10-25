package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer current = customers.get(i);
            if (current.getName().equalsIgnoreCase(customerName)) {
                return current;
            }
        }
        return null;
    }

    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer c = findCustomer(customerName);
        if (c != null) {
            c.addTransaction(amount);
            return true;
        }
        return false;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer not found: " + customerName);
            return;
        }

        System.out.println("Statement for customer: " + customer.getName());
        ArrayList<Double> transactions = customer.getTransactions();
        double balance = 0.0;

        for (int i = 0; i < transactions.size(); i++) {
            double transactionAmount = transactions.get(i);
            balance += transactionAmount;

            if (transactionAmount >= 0) {
                System.out.printf("[%d] Credit: $%.2f%n", i + 1, transactionAmount);
            } else {
                System.out.printf("[%d] Debit: -$%.2f%n", i + 1, Math.abs(transactionAmount));
            }
        }
        System.out.printf("Total Balance: $%.2f%n%n", balance);
    }
}
