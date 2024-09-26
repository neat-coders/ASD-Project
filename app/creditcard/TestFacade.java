

package app.creditcard;

import app.banking.domain.BankAccount;
import app.banking.domain.BankEntry;
import app.framework.facade.CommonBankFacade;

public interface TestFacade extends CommonBankFacade<CreditAccount, BankEntry, String> {
}
