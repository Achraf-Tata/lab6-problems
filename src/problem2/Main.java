package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank");

        bank.addCustomer("A");
        bank.addCustomer("B");

        boolean duplicateAdded = bank.addCustomer("A");
        System.out.println("Added ? : " + duplicateAdded);

        bank.addTransaction("A", 150.25);
        bank.addTransaction("A", -50.0);
        bank.addTransaction("B", -200.0);
        bank.addTransaction("B", 350.75);

        boolean test = bank.addTransaction("C", 100.0);
        System.out.println("Transaction for C added: " + test);
        System.out.println();
        bank.printStatement("A");
    }
}
