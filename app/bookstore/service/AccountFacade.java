

package app.bookstore.service;

import app.bookstore.domain.Book;
import app.bookstore.domain.BookStoreAccount;
import app.bookstore.domain.PurchaseEntry;
import app.framework.facade.CommonBankFacade;
import app.framework.facade.CommonFacade;

public interface AccountFacade extends CommonFacade<BookStoreAccount, String> {
//    void refundBook(Book book, BookStoreAccount bookStoreAccount);
}
