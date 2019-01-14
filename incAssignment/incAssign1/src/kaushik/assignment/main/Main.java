package kaushik.assignment.main;

import kaushik.assignment.data.Data;
import kaushik.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data(30,'a');
        data.printGlobalVariables();
        data.printLocalVariables(10,20);
        Singleton singleton=Singleton.getSingleton("hello");
        singleton.printString();
    }
}
