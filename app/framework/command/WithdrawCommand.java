//package app.framework.command;
//
//
//import app.framework.domain.Account;
//
//public class WithdrawCommand implements Command {
//    private Account account;
//    private double amount;
//
//    public WithdrawCommand(Account account, double amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void execute() {
//        account.withdraw(amount);
//    }
//
//    @Override
//    public void unexecute() {
//        account.deposit(amount);
//    }
//}