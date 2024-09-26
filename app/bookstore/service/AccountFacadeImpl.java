
package app.bookstore.service;

import app.bookstore.domain.BookStoreAccount;
import app.framework.facade.CommonFacadeImpl;
import app.framework.repository.DAO;

public class AccountFacadeImpl extends CommonFacadeImpl<BookStoreAccount, String> implements AccountFacade {

    public AccountFacadeImpl(DAO<BookStoreAccount, String> database) {
        super(database);
    }
}
