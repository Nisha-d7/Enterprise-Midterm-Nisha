package com.nisha.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Savings implements Account {

    @Id
    private String id;
    private String accountHolder;
    private double balance;
    private double interestRate;

    public void depositMonthlyInterest() {
        this.balance += this.balance * interestRate / 100;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    @Override
    public String getAccountHolder() {
        return accountHolder;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
