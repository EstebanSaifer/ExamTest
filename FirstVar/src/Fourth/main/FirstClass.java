package Fourth.main;

import Fourth.add.FourthClass;
import Fourth.add.ThirdClass;

public class FirstClass {
    private int a;
    void f (SecondClass objA, ThirdClass objB) {
        FirstClass objC = null;
        this.a = 1; //1
        a = objA.g(); //2
        //objB.x = 1; //3
        //objB.t(); //4
        //FourthClass objC = null; //5
    }

    public static void main(String[] args) {

    }
}
