package factoryCycle_solution4;

public class CycleFactory {
    public Cycle getCycle(String cycleType)
    {
        if(cycleType==null)
            return  null;
        if(cycleType.equalsIgnoreCase("unicycle"))
            return new Unicycle();
        if(cycleType.equalsIgnoreCase("bicycle"))
            return new Bicycle();
        if(cycleType.equalsIgnoreCase("tricycle"))
            return new Tricycle();
        return null;
    }
}
