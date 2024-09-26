/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.05.22
 * Time:12:32
 */

package app.framework.facade;

import app.framework.entity.Account;
import app.framework.entity.Entry;

public interface CommonBankFacade<R extends Account, T extends Entry, I> extends CommonFacade<R, I> {

    void withdraw(R r, T t);

    void deposit(R r, T t);

    void addInterest();
}
