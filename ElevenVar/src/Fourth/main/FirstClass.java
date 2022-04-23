package Fourth.main;

import Fourth.additional.FourthClass;
import Fourth.additional.ThirdClass;

public class FirstClass {
    private int a;
    void f(SecondClass objA, ThirdClass objB) {
        this.a = 1; //1
        a = objA.g(); //2
        //objB.x = 1; //3
        //objB.t(); //4
        FourthClass objC = null; //5
    }
}
