package kaushik.assignment.data;

public class Data {
    int intVariable;
    char charVariable;
    public Data(int intVariable,char charVariable)
    {
        this.intVariable=intVariable;
        this.charVariable=charVariable;
    }
    public void printGlobalVariables()
    {
        System.out.println("intVariable:"+intVariable+",charVariable:"+charVariable);
    }
    public void printLocalVariables(int parameter1,int parameter2)
    {
	int localVar1,localVar2;
	//System.out.println(localVar1+" "+localVar2);error because local variables doesnot have default values
	
        System.out.println("parameter1"+parameter1+",parameter2"+parameter2);
    }
}
