package Fourth.main;

import Fourth.additional.ThirdClass;
import Fourth.additional.FourthClass;

public class FirstClass {
    public static int a;
    void f (FourthClass objA, ThirdClass objB) {
        SecondClass objC = null; //1
        a = 13; //2
        //a = objA.s(); //3
        //objB.h = 1; //4
        objB.t(); //5
    }

    public static void main(String[] args) {

    }
}

