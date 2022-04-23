package Sixth;

public class DemoClass {
    private MyClass[] arr;
    public void demo() {
        MyClass myClass = new MyClass();
        for(int i = 0; i < arr.length; i++) {
            myClass.work();
        }
        MyClass.done();
    }
}
