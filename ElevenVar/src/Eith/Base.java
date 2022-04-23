package Eith;

public class Base {
    private int a;
    public Base(int a) {
        System.out.println("Base(int)");
        this.a = a;
    }
    public Base() {
        System.out.println("Base()");
    }
    public void show() {
        System.out.println("Super!");
    }
}
