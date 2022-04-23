package Second;

public class Demo {
    public static void demoSample() {
        Sample[] samples = {new Sample(1,2), new Sample(2,1)};
        for(Sample s: samples) {
            System.out.println(s.getSum());
        }
    }

    public static void main(String[] args) {
        demoSample();
    }
}