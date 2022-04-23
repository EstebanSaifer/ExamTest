package First;

public class Data {
    private double result;
    private boolean valid;

    public Data (double result, boolean valid) {
        this.result = result;
        this.valid = valid;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
