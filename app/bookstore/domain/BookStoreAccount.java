/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.05.22
 * Time:12:22
 */

package app.bookstore.domain;

import app.framework.entity.Account;
import app.framework.entity.Customer;
import app.framework.entity.Entry;
import app.framework.entity.Event;

public class BookStoreAccount extends Account {
    public BookStoreAccount(String accNumber, Customer customer) {
        super(accNumber, customer);
    }

    @Override
    public void withdraw(double amount, String description) {

    }

    @Override
    public Entry getEntry(double amount, String description, Event event) {
        return null;
    }

}
