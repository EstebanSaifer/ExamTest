package Second;

public class Sample {
    private int x, y;

    public Sample() {
        System.out.println("do nothing");
    }

    public Sample(int x, int y) {
        System.out.println("do something");
        this.x = x;
        this.y = y;
    }

    public int getSum() {
        System.out.println("get sum");
        return x + y;
    }

    public int getProd() {
        System.out.println("get prod");
        return x * y;
    }
}

