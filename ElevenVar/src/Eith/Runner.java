package Eith;

public class Runner {
    public static void run() {
        Base obj = new Derived(20,20);
        obj.show();
    }

    public static void main(String[] args) {
        run();
    }
}
