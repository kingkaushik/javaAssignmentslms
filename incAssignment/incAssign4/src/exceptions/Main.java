package exceptions;

public class Main {
    public static void main(String[] args) {
        int age=20;
        int marks=45;
        int balance=800;
        try
        {
            if(age<18)
                throw new VoteEligibilityException();
            if(marks<40)
                throw new PromotionException();
            if(balance<1000)
                throw new InsufficientBalanceException();
        }
        catch (VoteEligibilityException | InsufficientBalanceException | PromotionException exception)
        {
            System.out.println(exception.toString());
        }
        finally {
            System.out.println("Remaining code");
        }
    }
}
