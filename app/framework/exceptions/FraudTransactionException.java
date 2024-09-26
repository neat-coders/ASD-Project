
package app.framework.exceptions;

public class FraudTransactionException extends RuntimeException{
    public FraudTransactionException(String message) {
        super(message);
    }
}
