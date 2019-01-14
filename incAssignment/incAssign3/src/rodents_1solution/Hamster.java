package rodents_1solution;

public class Hamster extends Rodents {
    public Hamster() {
        System.out.println("This is Hamster");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running");
    }
}
