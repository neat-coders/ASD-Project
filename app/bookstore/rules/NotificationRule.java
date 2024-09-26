
package app.bookstore.rules;

import app.bookstore.domain.BookStoreAccount;
import app.bookstore.domain.PurchaseEntry;
import app.framework.entity.Observable;
import app.framework.rules.Rule;

public abstract class NotificationRule implements Rule<BookStoreAccount, PurchaseEntry>, Observable {
}
