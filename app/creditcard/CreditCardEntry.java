package app.creditcard;

import app.framework.entity.Entry;
import app.framework.entity.Event;

import java.time.LocalDateTime;

public class CreditCardEntry extends Entry {
    public CreditCardEntry(double amount, String description, LocalDateTime date, Event event) {
        super(amount, date, description,event);
    }
}
