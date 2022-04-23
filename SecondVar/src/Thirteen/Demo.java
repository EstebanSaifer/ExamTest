package Thirteen;

import Twelve.Sample;
import Twelve.SampleException;

public class Demo {
    public static void view (String s, double x) throws SampleException {
        Switcher sw = new Switcher();
        sw.on();
        Sample sample = new Sample(x, s);

    }
}
