package Ninth;

public class Demo {
    public static void main(String[] args) {
        Base a = new Base();
        Base b = new Derived();
        Runner.run(b);
        Runner.run(a);
    }
}
