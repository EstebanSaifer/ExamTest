package Eleven;

public interface Example {
    void first();
    private int second();
    default int third() {return 13;}
    public int fourth() {return 0;}
    static int fifth() {return 13;}
}
