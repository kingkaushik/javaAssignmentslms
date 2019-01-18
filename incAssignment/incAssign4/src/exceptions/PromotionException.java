package exceptions;

public class PromotionException extends Exception{
    @Override
    public String toString() {
        return "cannot promote student below 40%";
    }
}
