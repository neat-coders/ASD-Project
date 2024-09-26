

package app.bookstore.domain;

import app.framework.entity.Entry;
import app.framework.entity.Event;

import java.time.LocalDateTime;

public class PurchaseEntry extends Entry {
    public PurchaseEntry(double amount, LocalDateTime date, String description, Event event) {
        super(amount, date, description,event);
    }
}
