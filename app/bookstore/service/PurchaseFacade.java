package app.bookstore.service;

import app.bookstore.domain.PurchaseEntry;
import app.bookstore.domain.BookStoreAccount;
import app.framework.facade.CommonBankFacade;

public interface PurchaseFacade extends CommonBankFacade<BookStoreAccount, PurchaseEntry, String> {
}
