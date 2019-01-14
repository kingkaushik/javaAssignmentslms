package kaushik.assignment.singleton;

public class Singleton {
    String stringVar;

    public Singleton(String stringVar) {
        this.stringVar=stringVar;
    }

    public static Singleton getSingleton(String stringVar)
    {
	//non-static members cannot be accessed from static method
	//this.stringVar=stringVar;
        return new Singleton(stringVar);
    }

    public void printString()
    {
        System.out.println("stringVar:"+this.stringVar);
    }
}
