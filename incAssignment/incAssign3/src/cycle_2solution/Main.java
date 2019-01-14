package cycle_2solution;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Cycle cycles[]={unicycle,bicycle,tricycle};
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
        unicycle= (Unicycle) cycles[0];
        unicycle.balance();
    }
}
