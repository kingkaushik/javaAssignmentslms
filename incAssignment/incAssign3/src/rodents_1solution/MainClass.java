package rodents_1solution;

public class MainClass {
    public static void main(String[] args) {
        Rodents rodents[]={new Mouse(),new Gerbil(),new Hamster()};
        for(Rodents rodent:rodents)
        {
            rodent.eat();
            rodent.run();
            rodent.sleep();
        }
    }
}
