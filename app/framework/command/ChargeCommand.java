//package app.framework.command;
//
//
//import app.creditcard.CreditAccount;
//import app.framework.domain.Account;
//
//public class ChargeCommand implements Command {
//    private Account account;
//    private double amount;
//
//    public ChargeCommand(Account account, double amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void execute() {
//        if (account instanceof CreditAccount) {
//            ((CreditAccount) account).charge(amount);
//        }
//    }
//
//    @Override
//    public void unexecute() {
//        if (account instanceof CreditAccount) {
//            ((CreditAccount) account).deposit(amount);
//        }
//    }
//}