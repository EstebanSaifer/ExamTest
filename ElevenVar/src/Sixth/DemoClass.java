package Sixth;

public class DemoClass {
    private MyClass[] arr;
    public void demo() {
        MyClass myClass = new MyClass();
        MyClass.prepare();
        for(int i = 0; i < arr.length; i++) {
            myClass.work();
        }
    }
}