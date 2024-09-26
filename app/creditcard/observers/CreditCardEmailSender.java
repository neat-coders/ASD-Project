package app.creditcard.observers;

import app.creditcard.CreditAccount;
import app.framework.entity.Event;
import app.framework.entity.Observable;
import app.framework.entity.Observer;

public class CreditCardEmailSender implements Observer {
    private static CreditCardEmailSender instance = new CreditCardEmailSender();

    private CreditCardEmailSender(){}

    public static CreditCardEmailSender getInstance(){
        return CreditCardEmailSender.instance;
    }

    @Override
    public void subscribe(Observable subject) {
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe(Observable subject) {
        subject.removeObserver(this);
    }

    public void callback(Event event, Object ob){
        CreditAccount acc = (CreditAccount) ob;
        System.out.println("[EMAIL]: Event: "+ event +",Account: "+ acc.getCustomer().getCustomerType()  + ", Email: " + acc.getCustomer().getEmail());
    };
}
