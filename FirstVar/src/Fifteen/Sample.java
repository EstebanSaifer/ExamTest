package Fifteen;

public class Sample implements IDerived{

    @Override
    public double calc (double x, double y) {
        return x+y;
    }

    @Override
    public boolean check (int z) {
        if(z > 0) return true;
        else return false;
    }
}
