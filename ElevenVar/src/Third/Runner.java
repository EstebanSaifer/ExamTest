package Third;

public class Runner {
    public static int run() {
        String[] data = {
                "aa", "abc" , "aaa", "aa", "bb",
                "abc", "aa", "aaa", "bbb", "aa",
                "bb", "ccc", "cc", "a", "bb", ""
        };
        String etalon = new String("aa");
        return Counter.countStr(data, etalon);
    }

    public static void main(String[] args) {
        System.out.println(run());
    }
}