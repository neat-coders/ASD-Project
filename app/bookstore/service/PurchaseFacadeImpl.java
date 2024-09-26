
package app.bookstore.service;

import app.bookstore.domain.BookStoreAccount;
import app.bookstore.domain.PurchaseEntry;
import app.framework.entity.Observer;
import app.framework.facade.CommonBankFacadeImpl;
import app.framework.repository.DAO;
import app.framework.rules.RuleEngine;

import java.util.List;

public class PurchaseFacadeImpl extends CommonBankFacadeImpl<BookStoreAccount, PurchaseEntry, String> implements PurchaseFacade {
    public PurchaseFacadeImpl(DAO<BookStoreAccount, String> database, RuleEngine ruleEngine, List<Observer> observers) {
        super(database, ruleEngine, observers);
    }

    @Override
    public void addInterest() {
        throw new UnsupportedOperationException("Not supported");
    }
}
