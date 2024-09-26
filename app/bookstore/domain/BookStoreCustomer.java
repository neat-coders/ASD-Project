
package app.bookstore.domain;

import app.framework.entity.Address;
import app.framework.entity.Customer;

public class BookStoreCustomer extends Customer {
    public BookStoreCustomer(String name, String email, Address address) {
        super(name, email, address);
    }
}
