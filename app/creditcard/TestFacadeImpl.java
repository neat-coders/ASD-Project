

package app.creditcard;

import app.banking.domain.BankEntry;
import app.framework.entity.Observer;
import app.framework.facade.CommonBankFacadeImpl;
import app.framework.repository.DAO;
import app.framework.rules.RuleEngine;
import java.util.List;

public class TestFacadeImpl extends CommonBankFacadeImpl<CreditAccount, BankEntry, String> implements TestFacade {
    public TestFacadeImpl(DAO<CreditAccount, String> database, RuleEngine<CreditAccount, BankEntry> ruleEngine, List<Observer> observers) {
        super(database, ruleEngine, observers);
    }
}
