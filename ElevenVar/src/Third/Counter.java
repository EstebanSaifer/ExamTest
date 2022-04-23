package Third;


public class Counter {
    public static int countStr (String[] arr, String str) {
        int count = 0;
        for(String s : arr) {
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
