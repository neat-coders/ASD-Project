
package app.framework.facade;

import java.util.Collection;

public interface CommonFacade<R, I> {
    R create(I id, R r);

    R update(I id, R r);

    void delete(I id);

    Collection<R> findAll();

    long count();

}
