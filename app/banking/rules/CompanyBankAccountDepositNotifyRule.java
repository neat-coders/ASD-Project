/**
 * Author: Bayarjargal Jargalsaikhan
 * Date:2024.05.21
 * Time:14:42
 */
package app.banking.rules;

import app.banking.domain.BankAccount;
import app.framework.entity.Event;
import app.framework.entity.Observer;
import app.framework.entity.Subject;
import app.framework.rules.BankTransactionRule;

import java.util.List;

public class CompanyBankAccountDepositNotifyRule extends Subject implements BankTransactionRule {

    public CompanyBankAccountDepositNotifyRule(List<Observer> observerList) {
        if(observerList != null){
            observerList.stream().forEach(o -> o.subscribe(this));
        }
    }

    @Override
    public boolean matches(BankAccount account, Double amount, String desc, Event event) {
        return account.getCustomer().getCustomerType().equals("Company");
    }


    @Override
    public void apply(BankAccount account, Double amount, String desc, Event event) {
        this.notifyObservers(Event.DEPOSIT, account);
    }

    @Override
    public void notifyObservers(Event event, Object ob) {
        for(Observer obs: this.getObserverList()){
            obs.callback( event,  ob);
        }
    }
}
