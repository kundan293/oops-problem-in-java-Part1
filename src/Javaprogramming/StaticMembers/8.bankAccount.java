package Javaprogramming.StaticMembers;

class BankAccount {

        private String accountNumber;
        private double balance;
        private static String bankName;
        private static double interestRate;
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Static method to get the bank name
        public static String getBankName() {
            return bankName;
        }

        // Static method to set the bank name
        public static void setBankName(String name) {
            bankName = name;
        }
        public static double getInterestRate() {
            return interestRate;
        }


        public static void setInterestRate(double rate) {
            interestRate = rate;
        }

        public void printDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Bank Name: " + bankName);
            System.out.println("Interest Rate: " + interestRate + "%");
        }

        // Main method to demonstrate the functionality
        public static void main(String[] args) {
            // Set static variables
            BankAccount.setBankName("National Bank");
            BankAccount.setInterestRate(3.5);

            // Create BankAccount objects
            BankAccount account1 = new BankAccount("123456789", 1000.00);
            BankAccount account2 = new BankAccount("987654321", 2000.00);

            account1.printDetails();
            System.out.println();
            account2.printDetails();
        }
    }


