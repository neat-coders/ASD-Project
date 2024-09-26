package app.banking.domain;

import app.framework.entity.Account;
import app.framework.entity.Customer;
import app.framework.entity.Entry;
import app.framework.entity.Event;

import java.time.LocalDateTime;

public class BankAccount extends Account {
    public BankAccount(String accNumber, Customer customer) {
        super(accNumber, customer);
    }

    @Override
    public Entry getEntry(double amount, String description, Event event) {
        return new BankEntry(amount, description, LocalDateTime.now(),event, "", "");
    }
}
