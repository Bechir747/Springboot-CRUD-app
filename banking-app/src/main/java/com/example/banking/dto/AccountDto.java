package com.example.banking.dto;


import lombok.Data;



//In Spring Boot, a DTO, or Data Transfer Object, is like a messenger that carries information between different parts of your application. Imagine you have a blog application with a `Post` entity that has details like `title`, `content`, and `author`. When you want to send information about a `Post` from the database to the user interface, you create a DTO, let's call it `PostDTO`, with only the necessary details you want to show, like `title` and `content`. This way, you're not sending all the database-related details, just what's needed for display, making your application more efficient and organized.
@Data
public class AccountDto {

        private long id;
        private String accountHolderName;
        private double balance;

        public AccountDto(long id, String accountHolderName, double balance) {
            this.id = id;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        // Getter for id
        public long getId() {
            return id;
        }

        // Setter for id
        public void setId(long id) {
            this.id = id;
        }

        // Getter for accountHolderName
        public String getAccountHolderName() {
            return accountHolderName;
        }

        // Setter for accountHolderName
        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Setter for balance
        public void setBalance(double balance) {
            this.balance = balance;
        }
}
