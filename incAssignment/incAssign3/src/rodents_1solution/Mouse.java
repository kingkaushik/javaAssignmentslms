package rodents_1solution;

public class Mouse extends Rodents {
    public Mouse() {
        System.out.println("This is Mouse");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Mouse is running");
    }
}
