package Fifteen;

public class Sample implements IDerived{
    @Override
    public int calc(int x) {
        return x * x;
    }
    @Override
    public String write() {
        return "";
    }
}
