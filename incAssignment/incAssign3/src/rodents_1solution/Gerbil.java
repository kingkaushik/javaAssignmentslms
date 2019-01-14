package rodents_1solution;

public class Gerbil extends Rodents {
    public Gerbil() {
        System.out.println("This is gerbil");
    }

    @Override
    public void eat() {
        System.out.println("gerbil is eating");
    }

    @Override
    public void sleep() {
        System.out.println("gerbil is sleeping");
    }

    @Override
    public void run() {
        System.out.println("gerbil is running");
    }
}
