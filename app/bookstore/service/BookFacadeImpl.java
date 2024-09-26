
package app.bookstore.service;

import app.bookstore.domain.Book;
import app.framework.facade.CommonFacadeImpl;
import app.framework.repository.DAO;

public class BookFacadeImpl extends CommonFacadeImpl<Book, String> implements BookFacade{

    public BookFacadeImpl(DAO<Book, String> database) {
        super(database);
    }
}
