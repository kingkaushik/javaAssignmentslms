package exceptions;

public class InsufficientBalanceException extends Exception {
    @Override
    public String toString() {
        return "balance should be atleast 1000 rupees";
    }
}
