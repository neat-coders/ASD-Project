

package app.banking.rules;

import app.banking.domain.BankAccount;
import app.framework.entity.*;
import app.framework.exceptions.InsufficientBalanceException;
import app.framework.rules.BankTransactionRule;

import java.util.List;

public class PersonalBankAccountWithdrawSufficientBalanceRule extends Subject implements BankTransactionRule {

    public PersonalBankAccountWithdrawSufficientBalanceRule(List<Observer> observerList) {
        if(observerList != null){
            observerList.stream().forEach(o -> o.subscribe(this));
        }
    }

    /**
     * Checks if the account has insufficient balance for the withdrawal amount.
     *
     * @param account the account to check.
     * @param amount   the transaction amount.
     * @return true if the account balance is less than the transaction amount, otherwise false.
     */
    @Override
    public boolean matches(BankAccount account, Double amount, String desc, Event event) {
        return account.getCustomer().getCustomerType().equals("Personal") && account.getBalance() < amount;
    }

    @Override
    public void apply(BankAccount account, Double amount, String desc, Event event) {
        this.notifyObservers(Event.WITHDRAW, account);
        throw new InsufficientBalanceException("Not Sufficient Funds");
    }

    @Override
    public void notifyObservers(Event event, Object ob) {
        for(Observer obs: this.getObserverList()){
            obs.callback( event,  ob);
        }
    }
}
