package Ten;

public class DataProcessor implements IDataProcessor{
    private int value;
    @Override
    public int process(int[] arr) {
        int count = 0;
        if(arr.length <= value) {
            for (int i = 0; i< arr.length; i++) {
                count++;
            }
        }
        return count;
    }
}
