package Twelve;

public class Sample {
    public static int MAX_DATA = 1000;
    private double data;
    private String title;

    // для 13 задания
    private double x;
    private String s;

    //Sample sample = new Sample(x, s);
    // для 13 задания

    public Sample (double data, String title) throws SampleException {
        if(title == null || data > MAX_DATA) throw new SampleException("problem");
    }
}
