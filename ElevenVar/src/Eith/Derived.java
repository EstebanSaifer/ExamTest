package Eith;

public class Derived extends Base{
    private int b;
    public Derived(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Derived");
    }
}
