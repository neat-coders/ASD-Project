package app.banking.rules;

import app.banking.domain.BankAccount;
import app.framework.entity.Event;
import app.framework.entity.Observer;
import app.framework.entity.Subject;
import app.framework.rules.BankTransactionRule;

import java.util.List;

public class PersonalBankAccountWithDrawNotifyRule extends Subject implements BankTransactionRule {

    public PersonalBankAccountWithDrawNotifyRule(List<Observer> observerList) {
        if(observerList != null){
            observerList.stream().forEach(o -> o.subscribe(this));
        }
    }

    /**
     * Checks if the account has insufficient balance for the withdrawal amount.
     *
     * @param account the account to check.
     * @param amount   the transaction amount.
     * @return true if the transaction amount is greater than 500, otherwise false.
     */
    @Override
    public boolean matches(BankAccount account, Double amount, String desc, Event event) {
        return account.getCustomer().getCustomerType().equals("Personal") && amount > 500;
    }

    @Override
    public void apply(BankAccount account, Double amount, String desc, Event event) {
        this.notifyObservers(Event.WITHDRAW, account);
    }

    @Override
    public void notifyObservers(Event event, Object ob) {
        for(Observer obs: this.getObserverList()){
            obs.callback( event,  ob);
        }
    }
}
