package exceptions;

public class VoteEligibilityException extends Exception{
    @Override
    public String toString() {
        return "people below 18 years cannot vote";
    }
}
