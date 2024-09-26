
package app.bookstore.domain;

import app.framework.domain.Address;
import app.framework.domain.Customer;

public class BookStoreCustomer extends Customer {
    public BookStoreCustomer(String name, String email, Address address) {
        super(name, email, address);
    }
}
