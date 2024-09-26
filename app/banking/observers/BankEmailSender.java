package app.banking.observers;

import app.banking.domain.BankAccount;
import app.framework.entity.Event;
import app.framework.entity.Observable;
import app.framework.entity.Observer;

public class BankEmailSender implements Observer {
    private static BankEmailSender instance = new BankEmailSender();

    private BankEmailSender(){}

    public static BankEmailSender getInstance(){
        return BankEmailSender.instance;
    }

    @Override
    public void subscribe(Observable subject) {
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe(Observable subject) {
        subject.unregisterObserver(this);
    }

    @Override
    public void callback(Event event, Object ob) {
        BankAccount acc = (BankAccount) ob;
        System.out.println("[EMAIL]: Event: "+ event +",Account: "+ acc.getCustomer().getCustomerType()  + ", Email: " + acc.getCustomer().getEmail());
    }
}
