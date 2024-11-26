package bank;

import java.util.ArrayList;

public class BankAccountClass {
    public static class UserAccount {
        String accountNumber; // Random Generated Account Number
        String username; // Auto generated First Name Initial + Middle Name Initial + Surname
        String firstName;
        String middleName;
        String lastName;
        String email;
        String birthday;
        String address;
        double balance;
        String password;
        String pin;
        ArrayList<Transaction> transactions = new ArrayList<>();

        public UserAccount(String accountNumber, String firstName, String middleName, String lastName, String email, String birthday, String address, double balance, String password, String pin) {
            this.accountNumber = accountNumber;
            this.username = (String.valueOf(firstName.charAt(0)) + middleName.charAt(0) + lastName).toLowerCase();
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.email = email;
            this.birthday = birthday;
            this.address = address;
            this.balance = balance;
            this.password = password;
            this.pin = pin;
        }

        public boolean checkUserCredentials(String username, String inputPassword) {
            return (username.equals(this.username) || username.equals(this.email)) && this.password.equals(inputPassword);
        }

        private String getAccountNumber() {
            return this.accountNumber;
        }

        private double getBalance() {
            return this.balance;
        }

        private String getUsername() {
            return this.username;
        }

        private String getBirthday() {
            return this.birthday;
        }

        private String getEmail() {
            return this.email;
        }

        private boolean transferMoney() {
            return true;
        }

        // Need more getters and setters

    }

    public static class Transaction {
        String accountNumber;
        String date;
        String recipient;
        double amount;
    }

}
