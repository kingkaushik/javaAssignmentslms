package factoryCycle_solution4;

public class Main
{
    public static void main(String[] args) {
        CycleFactory cycleFactory=new CycleFactory();
        Cycle unicycle=cycleFactory.getCycle("unicycle");
        unicycle.balance();
        Cycle bicycle=cycleFactory.getCycle("bicycle");
        bicycle.balance();
        Cycle tricycle=cycleFactory.getCycle("tricycle");
        tricycle.balance();
    }
}
